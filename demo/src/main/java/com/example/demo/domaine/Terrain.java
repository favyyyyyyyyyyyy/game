package com.example.demo.domaine;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Terrain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idTerrain;

    String nomTerrain;
    float surfaceTerrain;
    float prixTerrain;
    Integer idParcelle;
    Integer idUtilisateur;

    @Column(columnDefinition = "integer default 1")
    Integer etatTerrain;

    

    public Terrain() {
    }

    
    public Terrain(Integer idTerrain, String nomTerrain, float surfaceTerrain, float prixTerrain, Integer idParcelle,
            Integer idUtilisateur, Integer etatTerrain) {
        this.setIdTerrain(idTerrain);
        this.setNomTerrain(nomTerrain);
        this.setSurfaceTerrain(surfaceTerrain);
        this.setPrixTerrain(prixTerrain);
        this.setIdParcelle(idParcelle);
        this.setIdUtilisateur(idUtilisateur);
        this.setEtatTerrain(etatTerrain);
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
    public Integer getIdParcelle() {
        return idParcelle;
    }
    public void setIdParcelle(Integer idParcelle) {
        this.idParcelle = idParcelle;
    }
    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }
    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
    public Integer getEtatTerrain() {
        return etatTerrain;
    }
    public void setEtatTerrain(Integer etatTerrain) {
        this.etatTerrain = etatTerrain;
    }    
}
