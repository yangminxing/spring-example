package com.yangminxing.spring.resttemplate.server;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;

import java.util.ResourceBundle;

/**
 * Spring Rest Template Server Example
 *
 * @author yangminxing
 * @date 2018-11-30
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.yangminxing.spring.resttemplate.server.rest")
@ImportResource({"classpath:applicationContext.xml"})
public class ServerLauncher {

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("application");

    public static void main(String[] args) {
        SpringApplication.run(ServerLauncher.class, args);
    }

    @Bean
    @Primary
    public ObjectMapper buildObjectMapperZZ() {
        ObjectMapper objectMapper = new ObjectMapper();
        this.buildObjectMapper(objectMapper);
        return objectMapper;
    }


    /**
     * Configure Jackson Xml
     *
     * @param objectMapper ObjectMapper
     */
    private void buildObjectMapper(ObjectMapper objectMapper) {
        // Not do with Null
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        //
        objectMapper.configure(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    private static String getProperty(String key) {
        return RESOURCE_BUNDLE.getString(key);
    }
}
