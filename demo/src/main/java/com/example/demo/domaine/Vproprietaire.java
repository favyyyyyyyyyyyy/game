package com.example.demo.domaine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vproprietaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    Integer idUtilisateur;
    String nomUtilisateur;
    Integer idTerrain;
    String nomTerrain;
    float surfaceTerrain;
    float prixTerrain;
    Integer etatTerrain;

    public Vproprietaire() {
    }

    public Vproprietaire(Integer idUtilisateur, String nomUtilisateur, Integer idTerrain, String nomTerrain,
            float surfaceTerrain, float prixTerrain, Integer etatTerrain) {
        this.setIdUtilisateur(idUtilisateur);
        this.setNomUtilisateur(nomUtilisateur);
        this.setIdTerrain(idTerrain);
        this.setNomTerrain(nomTerrain);
        this.setSurfaceTerrain(surfaceTerrain);
        this.setPrixTerrain(prixTerrain);
        this.setEtatTerrain(etatTerrain);
    }


    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public Integer getIdTerrain() {
        return idTerrain;
    }

    public void setIdTerrain(Integer idTerrain) {
        this.idTerrain = idTerrain;
    }

    public String getNomTerrain() {
        return nomTerrain;
    }

    public void setNomTerrain(String nomTerrain) {
        this.nomTerrain = nomTerrain;
    }

    public float getSurfaceTerrain() {
        return surfaceTerrain;
    }

    public void setSurfaceTerrain(float surfaceTerrain) {
        this.surfaceTerrain = surfaceTerrain;
    }

    public float getPrixTerrain() {
        return prixTerrain;
    }

    public void setPrixTerrain(float prixTerrain) {
        this.prixTerrain = prixTerrain;
    }

    public Integer getEtatTerrain() {
        return etatTerrain;
    }

    public void setEtatTerrain(Integer etatTerrain) {
        this.etatTerrain = etatTerrain;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
}
