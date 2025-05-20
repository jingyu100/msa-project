package com.example.microserviceA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MicroServiceAController {

    @GetMapping("microserviceA")
    public Map<String, String> microServiceA() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "MicroService A");
        response.put("timestamp", String.valueOf(System.currentTimeMillis()));
        return response;
    }
}
