package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domaine.Vparcelle;

public interface VparcelleRepository extends JpaRepository<Vparcelle, Integer> {

    List<Vparcelle> findByNom_culture(String nom_culture);
    // You can add custom query methods here if needed
}
