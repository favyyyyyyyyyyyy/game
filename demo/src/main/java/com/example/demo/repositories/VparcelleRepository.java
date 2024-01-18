package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domaine.Vparcelle;

public interface VparcelleRepository extends JpaRepository<Vparcelle, Integer> {
    // You can add custom query methods here if needed
}
