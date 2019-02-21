//package com.wangyx.servicehi.controller;
//
//import com.wangyx.servicehi.ServiceHiApplication;
//import com.wangyx.servicehi.service.CallMiYaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.logging.Logger;
//
//@RestController
//public class HiController {
//
//    private static final Logger LOGGER = Logger.getLogger(ServiceHiApplication.class.getName());
//
//    @Autowired
//    private CallMiYaService service;
//
//    @RequestMapping("/hi")
//    public String hi(String name){
//        //LOGGER.info("calling trace service-hi  ");
//        return service.callMiYa(name);
//    }
//
//    @RequestMapping("/info")
//    public String info(){
//        LOGGER.info( "calling trace service-hi ");
//
//        return "i'm service-hi";
//
//    }
//}
