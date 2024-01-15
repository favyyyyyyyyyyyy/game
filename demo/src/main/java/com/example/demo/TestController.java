package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/greeting")
@Controller
public class TestController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="huhu") String a, Model model) {
        model.addAttribute("huhu", a);
        return "hello";
    }
}
