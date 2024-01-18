package com.example.demo.domaine;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Parcelle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_parcelle;

    String nom_parcelle;
    float surface_parcelle;
    Integer id_culture;

    
    public Parcelle() {
    }

    
    public Parcelle(Integer id_parcelle, String nom_parcelle, float surface_parcelle, Integer id_culture) {
        this.setId_parcelle(id_parcelle);
        this.setNom_parcelle(nom_parcelle);
        this.setSurface_parcelle(surface_parcelle);
        this.setId_culture(id_culture);
    }


    public Integer getId_parcelle() {
        return id_parcelle;
    }
    public void setId_parcelle(Integer id_parcelle) {
        this.id_parcelle = id_parcelle;
    }
    public String getNom_parcelle() {
        return nom_parcelle;
    }
    public void setNom_parcelle(String nom_parcelle) {
        this.nom_parcelle = nom_parcelle;
    }
    public float getSurface_parcelle() {
        return surface_parcelle;
    }
    public void setSurface_parcelle(float surface_parcelle) {
        this.surface_parcelle = surface_parcelle;
    }
    public Integer getId_culture() {
        return id_culture;
    }
    public void setId_culture(Integer id_culture) {
        this.id_culture = id_culture;
    }

    
}
