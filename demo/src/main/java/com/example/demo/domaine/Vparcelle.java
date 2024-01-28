package com.example.demo.domaine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vparcelle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idParcelle;
    
    String nomParcelle;
    float surfaceParcelle;
    Integer idCulture;
    String nomCulture;
    float prixCulture;

    
    public Vparcelle() {
    }


    public Vparcelle(Integer idParcelle, String nomParcelle, float surfaceParcelle, Integer idCulture,
            String nomCulture, float prixCulture) {
        this.setIdParcelle(idParcelle);
        this.setNomParcelle(nomParcelle);
        this.setSurfaceParcelle(surfaceParcelle);
        this.setIdCulture(idCulture);
        this.setNomCulture(nomCulture);
        this.setPrixCulture(prixCulture);
    }


    public Integer getIdParcelle() {
        return idParcelle;
    }


    public void setIdParcelle(Integer idParcelle) {
        this.idParcelle = idParcelle;
    }


    public String getNomParcelle() {
        return nomParcelle;
    }


    public void setNomParcelle(String nomParcelle) {
        this.nomParcelle = nomParcelle;
    }


    public float getSurfaceParcelle() {
        return surfaceParcelle;
    }


    public void setSurfaceParcelle(float surfaceParcelle) {
        this.surfaceParcelle = surfaceParcelle;
    }


    public Integer getIdCulture() {
        return idCulture;
    }


    public void setIdCulture(Integer idCulture) {
        this.idCulture = idCulture;
    }


    public String getNomCulture() {
        return nomCulture;
    }


    public void setNomCulture(String nomCulture) {
        this.nomCulture = nomCulture;
    }


    public float getPrixCulture() {
        return prixCulture;
    }


    public void setPrixCulture(float prixCulture) {
        this.prixCulture = prixCulture;
    }
}
