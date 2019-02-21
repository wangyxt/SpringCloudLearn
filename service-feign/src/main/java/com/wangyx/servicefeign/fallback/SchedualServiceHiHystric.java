package com.wangyx.servicefeign.fallback;

import com.wangyx.servicefeign.service.CallHello;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements CallHello {

    @Override
    public String SayHello(String name) {
        return "sorry hello is not up";
    }
}
