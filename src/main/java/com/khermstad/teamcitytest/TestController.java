package com.khermstad.teamcitytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String indexRest(){
        return "HELLO!";
    }
}
