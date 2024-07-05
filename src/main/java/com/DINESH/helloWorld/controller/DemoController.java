package com.DINESH.helloWorld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public ResponseEntity<?> sayHelloWorld() {
        return ResponseEntity.accepted().body("<h1> Working</h1>");
    }
}
