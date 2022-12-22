package com.codeonline.system;

import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.kubernetes.api.model.NamespaceBuilder;
import io.fabric8.kubernetes.api.model.NamespaceList;
import io.fabric8.kubernetes.api.model.StatusDetails;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.fabric8.kubernetes.client.dsl.Resource;

import java.util.List;

//测试类
public class Test {
//    public static void main(String[] args) {
//        KubernetesClient client= new KubernetesClientBuilder().build();
//        //创建命名空间
//        Namespace namespace = client.namespaces().create(new NamespaceBuilder().withNewMetadata().withName("test-ns").endMetadata().build());
//        System.out.println(namespace);
//        System.out.println("创建命名空间成功");
//        //list命名空间
//        NamespaceList myNs = client.namespaces().list();
//        System.out.println(myNs);
//        System.out.println("列出命名空间成功");
//        //删除命名空间
//        List<StatusDetails> delete = client.namespaces().withName("test-ns").delete();
//        System.out.println(delete);
//    }
}
