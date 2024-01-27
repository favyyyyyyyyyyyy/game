package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domaine.Parcelle;
import com.example.demo.services.ParcelleService;

import java.util.List;

@RequestMapping("/agrigame")
@RestController
public class ParcelleController {
    @Autowired
    private ParcelleService parcelleService;

    @GetMapping("/parcelles")
    public List<Parcelle> getAllParcelles() {
        return parcelleService.getAllParcelles();
    }

    @PostMapping("/parcelles")
    public Parcelle insertParcelle(@RequestParam String nom, @RequestParam float surface, @RequestParam int id_culture) {
        return parcelleService.insertParcelle(nom, surface, id_culture);
    }
}
