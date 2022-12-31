package com.codeonline;


import com.codeonline.harbor.CodeOnlineHarborApplication;
import com.codeonline.harbor.api.RepositoryApi;
import com.codeonline.harbor.api.model.Artifact;
import com.codeonline.harbor.api.model.Repository;
import com.codeonline.harbor.shell.ShellMan;


import com.codeonline.harbor.utils.RestTemplateUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.spring.web.json.Json;


import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;


@SpringBootTest(classes = CodeOnlineHarborApplication.class)
public class test {

    @Autowired
    private ShellMan shellMan;

    @Test
    public void shellTest() throws IOException {
//        RestTemplate restTemplate = new RestTemplate();
        String url = "http://192.168.3.77:30002/api/v2.0/health";
//        RequestEntity<Void> requestEntity = RequestEntity.get(url)
//                .header("Authorization", "Basic "+ Base64.getEncoder().encodeToString("admin:Harbor12345".getBytes()))
//                .build();
//
//        ResponseEntity<String> response = restTemplate.exchange(requestEntity, String.class);
//        String body = response.getBody();
//        System.out.println(body);
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization" ,"Basic "+ Base64.getEncoder().encodeToString("admin:Harbor12345".getBytes()));

        ResponseEntity<String> stringResponseEntity = RestTemplateUtils.get(url, headers, String.class);
        System.out.println(stringResponseEntity);


    }

    @Value("${harbor.harborUrl}")
    private String harborUrl;

    public String getBASE_PATH() {
        return "http://"+harborUrl+"/api/v2.0/projects/codeonline-all/repositories";
    }

    @Autowired
    private RepositoryApi repositoryApi;
    @Test
    public void projectsTest() throws IOException {
        List<Repository> repositories = repositoryApi.listRepository();
        System.out.println(repositories);
        System.out.println("==================================");
        Repository repository = repositoryApi.getRepository("centos-base-ssh-aa");
        System.out.println(repository);
        System.out.println("==================================");
        List<String> repositoryTags = repositoryApi.getRepositoryTags("centos-base-ssh");
        System.out.println(repositoryTags);


    }
}
