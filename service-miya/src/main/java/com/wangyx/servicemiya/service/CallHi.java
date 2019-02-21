package com.wangyx.servicemiya.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-hi")
public interface CallHi {

    @RequestMapping("/hi")
    String callHi(String age);
}
