package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domaine.Parcelle;

public interface ParcelleRepository extends JpaRepository<Parcelle, Integer> {
    // You can add custom query methods here if needed
}
