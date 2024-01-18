package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/cultures")
@RestController
public class CultureController {
    @Autowired
    private CultureService cultureService;

    @GetMapping
    public List<Culture> getAllCultures() {
        return cultureService.getAllCultures();
    }
}