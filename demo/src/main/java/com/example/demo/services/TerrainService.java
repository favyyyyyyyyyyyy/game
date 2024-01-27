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


    public Terrain insertterrain(String nomTerrain, float surfaceTerrain, float prixTerrain, Integer idParcelle, Integer idUtilisateur) {
        Terrain terrain = new Terrain();
        terrain.setNomTerrain(nomTerrain);
        terrain.setSurfaceTerrain(surfaceTerrain);
        terrain.setPrixTerrain(prixTerrain);
        terrain.setIdParcelle(idParcelle);
        terrain.setIdUtilisateur(idUtilisateur);
        return terrainRepository.save(terrain);
    }
}
