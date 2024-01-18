package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CultureRepository extends JpaRepository<Culture, Integer> {
    // You can add custom query methods here if needed
}
