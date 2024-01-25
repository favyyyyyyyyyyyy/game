package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domaine.Vparcelle;
import com.example.demo.services.VparcelleService;

import java.util.List;

@RequestMapping("/agrigame")
@RestController
public class VparcelleController {
     @Autowired
    private VparcelleService vparcelleService;

    @GetMapping("/vparcelles")
    public List<Vparcelle> getAllVparcelles() {
        return vparcelleService.getAllVparcelles();
    }

    @GetMapping("/{nomCulture}")
    public List<Vparcelle> getParcellesByNomCulture(@RequestParam String nomCulture) {
        return vparcelleService.getParcellesByNomCulture(nomCulture);
    }

    @GetMapping("/{nomParcelle}")
    public List<Vparcelle> getParcellesByNomParcelle(@RequestParam String nomParcelle) {
        return vparcelleService.getParcellesByNomParcelle(nomParcelle);
    }
}
