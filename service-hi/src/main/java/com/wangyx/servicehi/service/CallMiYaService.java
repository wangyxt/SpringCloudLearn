package com.wangyx.servicehi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-miya")
public interface CallMiYaService {

    @GetMapping("/hi")
    String callMiYa(String name);
}
