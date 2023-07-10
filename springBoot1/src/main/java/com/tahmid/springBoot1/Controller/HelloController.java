package com.tahmid.springBoot1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @RequestMapping(value = "/",method = RequestMethod.GET)
    @GetMapping("/")
    public String greetHello(){
        return  "OutPut is changed" + " This is an example og getMapping";
    }
}
