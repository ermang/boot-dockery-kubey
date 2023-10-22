package com.eg.boot.dockery.kubey.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @GetMapping
    public String hello() {
        return activeProfile;
    }






}
