package com.nikhil.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api")
@RestController
public class TestController {

    @GetMapping(value = "/sayhello")
    public String abc(){
        return "version 12";
    }
}
