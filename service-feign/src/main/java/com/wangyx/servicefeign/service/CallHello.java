package com.wangyx.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.wangyx.servicefeign.fallback.SchedualServiceHiHystric;

@FeignClient(value = "service-hello",fallback = SchedualServiceHiHystric.class)
public interface CallHello {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String SayHello(@RequestParam(value = "name")String name);
}
