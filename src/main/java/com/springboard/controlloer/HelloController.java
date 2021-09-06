package com.springboard.controlloer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/") //포트번호 8080
    public String hello(){
        System.out.println("hello");
        return "redirect:/board";
    }
}