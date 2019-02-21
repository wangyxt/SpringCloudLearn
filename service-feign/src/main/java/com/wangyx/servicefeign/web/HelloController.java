package com.wangyx.servicefeign.web;

import com.wangyx.servicefeign.service.CallHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private CallHello callHello;

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam String name){
        return callHello.SayHello(name);
    }
}
