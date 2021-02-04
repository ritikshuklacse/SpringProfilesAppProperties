package com.example.demo.controller;

import com.example.demo.config.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    // Injecting ConfigurationProperties in your Beans
    @Autowired
    private AppProperties appProperties;

    @GetMapping("/properties")
    public String getAppDetails() {

        return appProperties.getUsername()+" -> "+appProperties.getName();
    }
}
