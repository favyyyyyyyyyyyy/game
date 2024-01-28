package com.example.demo.controllers;

import com.example.demo.domaine.Userterrain;
import com.example.demo.services.UserterrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/agrigame")
@RestController
public class UserterrainController {

    @Autowired
    private UserterrainService userterrainService;

    @GetMapping("/userterrain/{idUtilisateur}")
    public List<Userterrain> getUserterrainByIdUtilisateur(@PathVariable Integer idUtilisateur) {
        return userterrainService.getUserterrainByIdUtilisateur(idUtilisateur);
    }
}