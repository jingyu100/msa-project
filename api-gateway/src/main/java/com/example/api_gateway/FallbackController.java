package com.example.api_gateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/microservice-a")
    public ResponseEntity<Map<String, String>> microserviceAFallback() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Microservice A is currently unavailable");
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(response);
    }

    @GetMapping("/microservice-b")
    public ResponseEntity<Map<String, String>> microserviceBFallback() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Microservice B is currently unavailable");
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(response);
    }
}
