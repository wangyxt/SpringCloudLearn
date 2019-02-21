//package com.wangyx.servicemiya.controller;
//
//import com.wangyx.servicemiya.service.CallHi;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.logging.Logger;
//
//@RestController
//public class MiYaController {
//
//    private final static Logger LOGGER = Logger.getLogger(MiYaController.class.getName());
//    @Autowired
//    private CallHi service;
//    @GetMapping("/miya")
//    public String call(String age){
//        return service.callHi(age);
//    }
//
//    @GetMapping("/hi")
//    public String hi(String name){
//        return "this is miya";
//    }
//}
