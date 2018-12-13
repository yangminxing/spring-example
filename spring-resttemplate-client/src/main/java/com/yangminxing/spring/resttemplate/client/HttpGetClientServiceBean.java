package com.yangminxing.spring.resttemplate.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class HttpGetClientServiceBean implements HttpGetClientService{

    private static final String HTTP_GET_QUERY = "http://localhost:28080/httpget/query";

    private RestTemplate restTemplate;

    @Override
    public String retrieveHttpGetResult(String parameters){
        String result = restTemplate.getForObject(HTTP_GET_QUERY, String.class, parameters);
        return result;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
