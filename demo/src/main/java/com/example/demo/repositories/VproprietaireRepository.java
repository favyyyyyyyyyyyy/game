package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domaine.Vproprietaire;

public interface VproprietaireRepository extends JpaRepository<Vproprietaire, Integer> {
    List<Vproprietaire> findByNomUtilisateur(String nom_utilisateur);
}
