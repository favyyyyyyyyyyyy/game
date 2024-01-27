package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domaine.Terrain;

public interface TerrainRepository extends JpaRepository<Terrain, Integer>
{
    
}
