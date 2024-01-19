package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domaine.Vparcelle;
import com.example.demo.services.VparcelleService;

import java.util.List;

@RequestMapping("/vparcelles")
@RestController
public class VparcelleController {
     @Autowired
    private VparcelleService parcelleService;

    @GetMapping("/liste_vparcelle")
    public List<Vparcelle> getAllVparcelles() {
        return parcelleService.getAllVparcelles();
    }

    @PostMapping("/rNameCulture")
    public List<Vparcelle> getAllVparcellesByCulture(@RequestParam String nom_culture) {
        return parcelleService.getVparcellesByName(nom_culture);
    }
}
