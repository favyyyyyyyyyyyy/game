package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domaine.Vproprietaire;

public interface VproprietaireRepository extends JpaRepository<Vproprietaire, Integer> {
    // You can add custom query methods here if needed
}
