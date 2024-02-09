package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domaine.Terrain;
import com.example.demo.services.TerrainService;

@RequestMapping("/agrigame")
@RestController
@CrossOrigin
public class TerrainController {
    @Autowired
    private TerrainService TerrainService;

    @GetMapping("/terrains")
    public List<Terrain> getAllTerrains() {
        return TerrainService.getAllTerrains();
    }

    @PostMapping("/terrain")
    public Terrain insertterrain(@RequestBody Terrain terrain) {
        return TerrainService.insertterrain(terrain);
    }

    @PutMapping("/terrain/{idTerrain}/{idUtilisateur}")
    public void updateTerrainInfo(@PathVariable Integer idTerrain, @PathVariable Integer idUtilisateur, @RequestBody Terrain updatedTerrain) {
        TerrainService.updateTerrainInfo(idTerrain, idUtilisateur, updatedTerrain);
    }
}