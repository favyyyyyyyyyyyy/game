package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domaine.Terrain;
import com.example.demo.repositories.TerrainRepository;

@Service
public class TerrainService {
 @Autowired
    private TerrainRepository terrainRepository;

    public List<Terrain> getAllTerrains() {
        return terrainRepository.findAll();
    }

    public Terrain insertterrain(Terrain t) {
        Terrain terrain = new Terrain(t.getIdTerrain(), t.getNomTerrain(), t.getSurfaceTerrain(), t.getPrixTerrain(), t.getIdParcelle(), t.getIdUtilisateur());
        return terrainRepository.save(terrain);
    } 
}