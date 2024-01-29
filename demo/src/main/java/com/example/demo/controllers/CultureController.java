package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domaine.Culture;
import com.example.demo.services.CultureService;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/agrigame")

public class CultureController {
    @Autowired
    private CultureService cultureService;

    @GetMapping("/cultures")
    public List<Culture> getAllCultures() {
        System.out.println("culture");
        return cultureService.getAllCultures();
    }

    @PostMapping("/culture")
    public Culture insertCulture(@RequestBody Culture culture) {
        System.out.println("culture");
        return cultureService.insertCulture(culture);
    }
}