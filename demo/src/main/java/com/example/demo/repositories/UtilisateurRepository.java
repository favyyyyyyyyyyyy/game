package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domaine.Utilisateur;
import java.util.List;


public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    Utilisateur findByNomUtilisateurAndMdp(String nomUtilisateur, String mdp);
}
