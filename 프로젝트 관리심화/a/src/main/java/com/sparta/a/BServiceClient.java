package com.sparta.a;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-b", url="${sevice.b.url}")
public interface BServiceClient {
    @GetMapping("/hello")
    public String getHello();
}
