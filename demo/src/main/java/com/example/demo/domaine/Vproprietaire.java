package com.example.demo.domaine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vproprietaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idProprietaire;

    Integer idUtilisateur;
    String nomUtilisateur;
    Integer idTerrain;
    String nomTerrain;
    float prixTerrain;
    Integer idParcelle;
    Integer etatTerrain;

    public Vproprietaire() {
    }

    public Vproprietaire(Integer idProprietaire, Integer idUtilisateur, String nomUtilisateur, Integer idTerrain,
            String nomTerrain, float prixTerrain, Integer idParcelle, Integer etatTerrain) {
        this.setIdProprietaire(idProprietaire);
        this.setIdUtilisateur(idUtilisateur);
        this.setNomUtilisateur(nomUtilisateur);
        this.setIdTerrain(idTerrain);
        this.setNomTerrain(nomTerrain);
        this.setPrixTerrain(prixTerrain);
        this.setIdParcelle(idParcelle);
        this.setEtatTerrain(etatTerrain);
    }

    public Integer getIdProprietaire() {
        return idProprietaire;
    }

    public void setIdProprietaire(Integer idProprietaire) {
        this.idProprietaire = idProprietaire;
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

    public Integer getEtatTerrain() {
        return etatTerrain;
    }

    public void setEtatTerrain(Integer etatTerrain) {
        this.etatTerrain = etatTerrain;
    }    
    
}
