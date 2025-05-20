package com.example.microserviceB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MicroServiceBController {

    @GetMapping("microserviceB")
    public Map<String, String> microServiceB() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "MicroService B");
        response.put("timestamp", String.valueOf(System.currentTimeMillis()));
        return response;
    }
}
