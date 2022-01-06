package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author marc-assie
 */
@RequestMapping("/api")
@RestController
public class RestAPIController {

    /**
     * @return xxxxxxxxxxxxxxx
     */
    @GetMapping("/hello")
    public String findAll () {
        return "Hello World!";
    }
}
