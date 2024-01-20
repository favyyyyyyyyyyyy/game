package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domaine.Vparcelle;

public interface VparcelleRepository extends JpaRepository<Vparcelle, Integer> {
    List<Vparcelle> findByNomCulture(String nom_culture);

    List<Vparcelle> findByNomParcelle(String nom_parcelle);
}
