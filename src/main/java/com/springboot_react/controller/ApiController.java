package com.springboot_react.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {
    @GetMapping("/api/hello")
    public Map<String, String> hello() {
        Map<String, String> result = new HashMap();
        result.put("message", "안녕");

        return result;
    }
}
