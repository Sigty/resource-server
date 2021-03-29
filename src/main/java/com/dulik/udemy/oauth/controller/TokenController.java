package com.dulik.udemy.oauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RequestMapping("v1/token")
@RestController
public class TokenController {

    @GetMapping("/principal")
    public ResponseEntity<Map<String, Object>> echo(@AuthenticationPrincipal Jwt jwt) {
        return ResponseEntity.ok(Collections.singletonMap("principal", jwt));
    }
}
