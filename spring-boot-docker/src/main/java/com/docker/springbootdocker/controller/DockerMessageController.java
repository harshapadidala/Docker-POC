package com.docker.springbootdocker.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerMessageController {

    @GetMapping("/message")
    public String getMessage() {
        return "Test message";
    }

}
