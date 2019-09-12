package com.fairwarning.rest.assignment.controller;

import com.fairwarning.rest.assignment.model.ApiInfo;
import com.fairwarning.rest.assignment.model.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.condition.NameValueExpression;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class MainController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    public RequestMappingHandlerMapping requestMappingHandlerMapping;
    /*
    @RequestMapping("/")
    public @ResponseBody
    List<ApiInfo> root()  {
        List<ApiInfo> listOfApi = new ArrayList<>();
        for (RequestMappingInfo api : requestMappingHandlerMapping.getHandlerMethods().keySet()) {
            HandlerMethod medhod = requestMappingHandlerMapping.getHandlerMethods().get(api);
            Set<String> uriSet = api.getPatternsCondition().getPatterns();
            String uri = "";
            if(uriSet != null && !uriSet.isEmpty()){
                uri = (String) uriSet.toArray()[0];
            }

            String methodName = medhod.getMethod().getName();
            ApiInfo apiInfo = new ApiInfo();
            apiInfo.setMethodName(methodName);
            apiInfo.setUri(uri);

            listOfApi.add(apiInfo);

        }

        return listOfApi;

    }*/

    @RequestMapping("/")
    public @ResponseBody
    String root(HttpServletRequest request)  {
        //http://localhost:8001/actuator/mappings

        String scheme = request.getScheme();
        String userInfo = request.getRemoteUser();
        String host = request.getLocalAddr();
        int port = request.getLocalPort();
        String path = "/actuator/mappings";
        try {
            URI uri = new URI(scheme, userInfo, host, port, path, null, null);
            return restTemplate.getForObject(uri, String.class);
        }catch (Exception e){
            e.printStackTrace();
        }


       return "Welcome";
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

