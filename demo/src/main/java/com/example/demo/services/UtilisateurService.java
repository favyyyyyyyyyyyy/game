package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domaine.Utilisateur;
import com.example.demo.repositories.UtilisateurRepository;


@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur login(Utilisateur utilisateur) {
        return utilisateurRepository.findByNomUtilisateurAndMdp(utilisateur.getNomUtilisateur(), utilisateur.getMdp());
    }    

    public Utilisateur register(Utilisateur utilisateur) {
        Utilisateur u= new Utilisateur(utilisateur.getIdUtilisateur(), utilisateur.getNomUtilisateur(), utilisateur.getMdp());
        return utilisateurRepository.save(u);
    }
}