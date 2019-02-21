package com.wangyx.servicehello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class ServiceHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHelloApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String home(@RequestParam(value = "name",defaultValue = "wangyx") String name){
        return "this is "+port+"my name is "+name+".";
    }
}

