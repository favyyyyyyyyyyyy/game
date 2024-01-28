package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domaine.Userterrain;

import java.util.List;

public interface UserterrainRepository extends JpaRepository<Userterrain, Integer> {
    List<Userterrain> findByIdUtilisateur(Integer idUtilisateur);
}
