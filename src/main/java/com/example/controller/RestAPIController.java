package com.example.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author marc-assie
 */
@RestController
public class RestAPIController {

    /**
     * @return xxxxxxxxxxxxxxx
     */
    @RequestMapping("/api/helloworld")
    public String findAll () {
        return "Hello World!";
    }
}
