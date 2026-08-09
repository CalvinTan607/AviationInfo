package com.example.OpenSky.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TokenController {
    @GetMapping("/refreshToken")
    public String hello() {
        return "getting refreshed token";
    }
}