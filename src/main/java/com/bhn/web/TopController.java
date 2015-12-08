package com.bhn.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopController {


    @RequestMapping("/")
    public String index() {
        return "Greetings from Level up lunch!";
    }
    
}