package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/greeting")
@RestController
public class TestController {
    @GetMapping("/hello")
    public ResponseEntity<?> hello(@RequestParam(name="huhu") String a) {
        String bonjour="bonjour";
        return new ResponseEntity<>(bonjour,HttpStatus.ACCEPTED);
    }
}