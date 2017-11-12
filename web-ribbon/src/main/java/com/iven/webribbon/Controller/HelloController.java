package com.iven.webribbon.Controller;

import com.iven.webribbon.Service.TestHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Autowired
    private TestHello testHello;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam String name){
        return testHello.hello(name);
    }
}
