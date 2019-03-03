package com.khermstad.teamcitytest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {

    @GetMapping("/test")
    public String indexRest(){
        return "HELLO!";
    }
}
