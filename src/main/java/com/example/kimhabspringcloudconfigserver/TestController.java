package com.example.kimhabspringcloudconfigserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${greeting.msg}")
    private String greetingMessage;

    @GetMapping("/greeting")
    public String getGreetingMessage() {
        return greetingMessage;
    }
}
