package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domaine.Utilisateur;
import com.example.demo.services.UtilisateurService;

@RequestMapping("/agrigame")
@RestController
@CrossOrigin
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;
    
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Utilisateur utilisateur) {
        Utilisateur loggedInUser = utilisateurService.login(utilisateur);

        if (loggedInUser != null) {
            return ResponseEntity.ok("Login successful! Welcome " + loggedInUser.getNomUtilisateur());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed. Invalid credentials.");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Utilisateur utilisateur) {
        Utilisateur savedUser = utilisateurService.register(utilisateur);
        return ResponseEntity.ok("User registered successfully with ID: " + savedUser.getIdUtilisateur());
    }
}