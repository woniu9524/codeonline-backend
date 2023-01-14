package com.codeonline.k8s;



import com.alibaba.nacos.shaded.com.google.gson.Gson;
import com.codeonline.common.core.constant.K8sConstants;
import com.codeonline.common.core.utils.StringUtils;
import com.codeonline.common.security.utils.SecurityUtils;
import com.codeonline.k8s.mapper.K8sMapper;
import com.codeonline.k8s.model.K8sConfigure;
import com.codeonline.k8s.model.K8sDeployment;
import com.codeonline.k8s.model.K8sService;
import com.codeonline.k8s.shell.ShellMan;


import com.codeonline.k8s.utils.K8sUtil;
import io.fabric8.kubernetes.api.model.*;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.apps.DeploymentSpec;
import io.fabric8.kubernetes.api.model.extensions.Ingress;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SpringBootTest(classes= CodeOnlineK8sApplication.class)
public class TestK8s {

    @Autowired
    private ShellMan shellMan;

    @Test
    public void k8sTest() throws IOException {
        KubernetesClient client= new KubernetesClientBuilder().build();

        //创建container
        Container container = new Container();
        container.setName("test-container");
        container.setImage("192.168.3.77:30002/codeonline-all/centos-base-ssh:1.0.0");
        List<ContainerPort> containerPorts = new ArrayList<>();
        ContainerPort containerPort = new ContainerPort();
        containerPort.setName("tcp-22");
        containerPort.setContainerPort(22);
        containerPort.setProtocol("TCP");
        containerPorts.add(containerPort);
        container.setPorts(containerPorts);
        container.setImagePullPolicy("IfNotPresent");
        //创建label
        Map<String, String> labels=new HashMap<>();
        labels.put("app", "test-deployment");
        labels.put("teacherID", "10001");
        labels.put("studentID", "20001");
        labels.put("labID", "30001");
        //创建Metadata
        ObjectMeta metadata = new ObjectMeta();
        metadata.setLabels(labels);
        //创建Pod模板
        PodTemplateSpec podTemplateSpec = new PodTemplateSpec();
        podTemplateSpec.setMetadata(metadata);
        podTemplateSpec.setSpec(new PodSpec());
        podTemplateSpec.getSpec().setRestartPolicy("Always");
        podTemplateSpec.getSpec().setTerminationGracePeriodSeconds(30L);
        podTemplateSpec.getSpec().setDnsPolicy("ClusterFirst");
        List<LocalObjectReference> localObjectReferences = new ArrayList<>();
        localObjectReferences.add(new LocalObjectReference("harbor-registry-secret"));
        podTemplateSpec.getSpec().setImagePullSecrets(localObjectReferences);
        podTemplateSpec.getSpec().setSchedulerName("default-scheduler");
        //创建Pod
        DeploymentSpec deploymentSpec = new DeploymentSpec();
        deploymentSpec.setSelector(new LabelSelector());
        deploymentSpec.getSelector().setMatchLabels(labels);
        deploymentSpec.setReplicas(1);//Pod副本数量
        //创建deployment
        Deployment deployment = new Deployment();
        deployment.setApiVersion("apps/v1");//版本
        deployment.setMetadata(new ObjectMeta());
        deployment.getMetadata().setName("test-deployment");//deployment名称
        deployment.getMetadata().setNamespace("codeonline-all-pods");//deployment命名空间
        //组合
        podTemplateSpec.getSpec().getContainers().add(container);
        deploymentSpec.setTemplate(podTemplateSpec);
        deployment.setSpec(deploymentSpec);
        System.out.println(deployment);
        // 部署
        client.apps().deployments().inNamespace("codeonline-all-pods").create(deployment);

    }

    @Test
    public void serviceTest() throws IOException {
        KubernetesClient client= new KubernetesClientBuilder().build();
        //创建label
        Map<String, String> labels=new HashMap<>();
        labels.put("app", "test-deployment");
        labels.put("teacherID", "10001");
        labels.put("studentID", "20001");
        labels.put("labID", "30001");

        //创建Metadata
        ObjectMeta metadata = new ObjectMeta();
        metadata.setLabels(new HashMap<>());
        metadata.getLabels().put("app","base-service");
        metadata.setName("base-service");
        metadata.setNamespace("codeonline-all-pods");
        //创建service
        Service service = new Service();
        service.setApiVersion("v1");
        service.setMetadata(metadata);
        service.setSpec(new ServiceSpec());
        service.getSpec().setType("NodePort");
        service.getSpec().setSelector(labels);
        service.getSpec().setPorts(new ArrayList<>());

        ServicePort servicePort = new ServicePort();
        servicePort.setName("tcp-22");
        servicePort.setPort(22);
        servicePort.setProtocol("TCP");
        servicePort.setTargetPort(new IntOrString(22));
        servicePort.setNodePort(30122);

        service.getSpec().getPorts().add(servicePort);
        System.out.println(service);
        //创建service
        client.services().inNamespace("codeonline-all-pods").create(service);
    }

    @Autowired
    private K8sUtil k8sUtil;

    @Autowired
    private K8sMapper k8sMapper;

    @Value("${harbor.harborUrl}")
    private String harborUrl;
    @Value("${harbor.harborSpace}")
    private String harborSpace;
    @Value("${nfs.server}")
    private String nfsServer;
    @Value("${nfs.path}")
    private String nfsPath;

    @Test
    public void deploy() throws IOException {
        String labId="1-5464146515";
        // 读取配置文件
        String k8sConfigureJsonString = k8sMapper.selectK8sConfigureByLabId(labId);
        // 将json字符串转换为k8sConfigure
        K8sConfigure k8sConfigure = new Gson().fromJson(k8sConfigureJsonString,K8sConfigure.class);
        // 读取teacherId
        Long teacherId = k8sMapper.selectUserIdByLabId(labId);
        // 读取userId
        Long studentId = 1L;
        // 修改imageName
        if("harbor".equals(k8sConfigure.getSourceFrom())){
            String imageName=k8sConfigure.getImageName();
            k8sConfigure.setImageName(harborUrl+"/"+harborSpace+"/"+imageName);
        }
        // 提前创建nfs目录
        String nfsPathNew = this.nfsPath + "/" + teacherId + "/" + labId+ "/" + studentId;
        if(!StringUtils.isEmpty(k8sConfigure.getVolume())){
            shellMan.exec("mkdir -p "+nfsPathNew);
        }

        K8sDeployment k8sDeployment = new K8sDeployment(k8sConfigure,"1-5464146515",String.valueOf(teacherId),String.valueOf(studentId),nfsPathNew,nfsServer);
        k8sDeployment.populate();
    }

    @Test
    public void service() throws IOException {

    }


    @Test
    public void K8sUtilTest() {
        List<ServicePort> servicePort = k8sUtil.getServicePort("codeonline-service-2-1673483074074-1");
        System.out.println(servicePort);
    }
}
