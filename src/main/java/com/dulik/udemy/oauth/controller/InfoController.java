package com.dulik.udemy.oauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RequestMapping("/v1/info")
@RestController
public class InfoController {

    @GetMapping("/echo")
    public ResponseEntity<Map<String, Object>> echo() {
        return ResponseEntity.ok(Collections.singletonMap("Working...", true));
    }
}
