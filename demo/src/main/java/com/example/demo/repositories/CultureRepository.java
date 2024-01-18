package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domaine.Culture;

public interface CultureRepository extends JpaRepository<Culture, Integer> {
    // You can add custom query methods here if needed
}
