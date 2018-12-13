package com.yangminxing.spring.resttemplate.client.test;

import com.yangminxing.spring.resttemplate.client.HttpGetClientService;
import com.yangminxing.spring.resttemplate.client.HttpGetClientServiceBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HttpGetClientTest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HttpGetClientService clientService = (HttpGetClientService) context.getBean(HttpGetClientServiceBean.class);

        String result = clientService.retrieveHttpGetResult("abc");
        System.out.println(result);
    }

}
