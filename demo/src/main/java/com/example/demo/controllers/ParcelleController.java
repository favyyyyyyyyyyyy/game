package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Parcelle insertParcelle(@RequestBody Parcelle parcelle) {
        return parcelleService.insertParcelle(parcelle);
    }
}
