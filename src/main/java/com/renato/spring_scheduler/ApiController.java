package com.renato.spring_scheduler;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Component
public class ApiController {

    @GetMapping("/test-endpoint")
    public ResponseEntity<String> handleRequest() {
    	System.out.println("Chegou uma mensagem!");
        return ResponseEntity.ok("Request received successfully!");
    }

}