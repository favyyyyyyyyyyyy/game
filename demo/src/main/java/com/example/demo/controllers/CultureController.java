package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domaine.Culture;
import com.example.demo.services.CultureService;

import java.util.List;

@RequestMapping("/cultures")
@RestController
public class CultureController {
    @Autowired
    private CultureService cultureService;

    @GetMapping("/liste")
    public List<Culture> getAllCultures() {
        return cultureService.getAllCultures();
    }

    @PostMapping("/insert")
    public Culture insertCulture(@RequestParam String nom, @RequestParam float unite, @RequestParam float prix) {
        return cultureService.insertCulture(nom, unite, prix);
    }
}