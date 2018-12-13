package com.yangminxing.spring.resttemplate.server.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/httpget"})
public class HttpGetRest {

    @RequestMapping(value = {"/query"})
    public String query(@RequestParam String parameters){
        return "successful!" + parameters;
    }

}
