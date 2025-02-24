package com.example.demo.RestAPI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Api {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message","Hello from BridgeLabz");
        return "message";

    }
    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message","Hello from BridgeLabz");
        return "message";
    }
}
