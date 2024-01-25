package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domaine.Utilisateur;
import com.example.demo.services.UtilisateurService;

@CrossOrigin
@RequestMapping("/agrigame")
@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;
    
   @PostMapping("/login/{nomUtilisateur}/{mdp}")
    public ResponseEntity<String> login(
        @PathVariable String nomUtilisateur,
        @PathVariable String mdp
    ) {
        Utilisateur utilisateur = utilisateurService.login(nomUtilisateur, mdp);

        if (utilisateur != null) {
            return ResponseEntity.ok("Login successful! Welcome " + utilisateur.getNomUtilisateur());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed. Invalid credentials.");
        }
    }

    @PostMapping("/register/{nomUtilisateur}/{mdp}")
    public ResponseEntity<String> register(
        @PathVariable String nomUtilisateur,
        @PathVariable String mdp
    ) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNomUtilisateur(nomUtilisateur);
        utilisateur.setMdp(mdp);

        Utilisateur savedUser = utilisateurService.register(utilisateur);

        return ResponseEntity.ok("User registered successfully with ID: " + savedUser.getIdUtilisateur());
    }
}
