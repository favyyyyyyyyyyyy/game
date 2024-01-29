package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domaine.Vparcelle;

public interface VparcelleRepository extends JpaRepository<Vparcelle, Integer> {
    List<Vparcelle> findByNomCulture(String nomCulture);

    List<Vparcelle> findByNomParcelle(String nomParcelle);
}