package com.example.memo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController{
    @RequestMapping("/")
    public String Hello(){
        return "HelloWorld";
    }
    @RequestMapping("/helloAza")
    public String HelloAza(){
        return "My name is AzamaT";
    }
}
