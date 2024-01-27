package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domaine.Terrain;
import com.example.demo.services.TerrainService;

@RequestMapping("/agrigame")
@RestController
public class TerrainController {
    @Autowired
    private TerrainService TerrainService;

    @GetMapping("/terrains")
    public List<Terrain> getAllTerrains() {
        return TerrainService.getAllTerrains();
    }

    @PostMapping("/terrains")
    public Terrain insertterrain(@RequestBody Terrain terrain) {
        return TerrainService.insertterrain(terrain);
    }
}
