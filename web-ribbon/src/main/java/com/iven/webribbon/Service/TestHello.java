package com.iven.webribbon.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestHello {
    @Autowired
    private RestTemplate restTemplate;
    public String hello(String name){
        return restTemplate.getForObject("http://WEB-CLIENT/hello?name="+name,String.class);
    }
}
