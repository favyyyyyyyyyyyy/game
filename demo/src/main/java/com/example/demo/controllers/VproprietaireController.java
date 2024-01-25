package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domaine.Vproprietaire;
import com.example.demo.services.VproprietaireService;


@RequestMapping("/agigame")
@RestController
public class VproprietaireController {
    @Autowired
    private VproprietaireService vproprietaireService;

    @GetMapping("/vproprietaires")
    public List<Vproprietaire> getAllVproprietaires() {
        return vproprietaireService.getAllVproprietaires();
    }

    @GetMapping("/{nom_utilisateur}")
    public List<Vproprietaire> getVproprietairesByUtilisateur(@RequestParam String nom_utilisateur) {
        return vproprietaireService.getProprietaireByNomUtilisateur(nom_utilisateur);
    }
}
