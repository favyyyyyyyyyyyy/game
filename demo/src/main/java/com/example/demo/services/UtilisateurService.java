package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domaine.Utilisateur;
import com.example.demo.repositories.UtilisateurRepository;


@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur login(String nomUtilisateur, String mdp) {
        return utilisateurRepository.findByNomUtilisateurAndMdp(nomUtilisateur, mdp);
    }

    public Utilisateur register(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }
}
