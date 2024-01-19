package com.example.demo.domaine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vproprietaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_proprietaire;

    Integer id_utilisateur;
    String nom_utilisateur;
    Integer id_terrain;
    String nom_terrain;
    float prix_terrain;
    Integer id_parcelle;
    Integer etat_terrain;

    public Vproprietaire() {
    }

    public Vproprietaire(Integer id_proprietaire, Integer id_utilisateur, String nom_utilisateur, Integer id_terrain,
            String nom_terrain, float prix_terrain, Integer id_parcelle, Integer etat_terrain) {
        this.setId_proprietaire(id_proprietaire);
        this.setId_utilisateur(id_utilisateur);
        this.setNom_utilisateur(nom_utilisateur);
        this.setId_terrain(id_terrain);
        this.setNom_terrain(nom_terrain);
        this.setPrix_terrain(prix_terrain);
        this.setId_parcelle(id_parcelle);
        this.setEtat_terrain(etat_terrain);
    }

    public Integer getId_proprietaire() {
        return id_proprietaire;
    }

    public void setId_proprietaire(Integer id_proprietaire) {
        this.id_proprietaire = id_proprietaire;
    }

    public Integer getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(Integer id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public Integer getId_terrain() {
        return id_terrain;
    }

    public void setId_terrain(Integer id_terrain) {
        this.id_terrain = id_terrain;
    }

    public String getNom_terrain() {
        return nom_terrain;
    }

    public void setNom_terrain(String nom_terrain) {
        this.nom_terrain = nom_terrain;
    }

    public float getPrix_terrain() {
        return prix_terrain;
    }

    public void setPrix_terrain(float prix_terrain) {
        this.prix_terrain = prix_terrain;
    }

    public Integer getId_parcelle() {
        return id_parcelle;
    }

    public void setId_parcelle(Integer id_parcelle) {
        this.id_parcelle = id_parcelle;
    }

    public Integer getEtat_terrain() {
        return etat_terrain;
    }

    public void setEtat_terrain(Integer etat_terrain) {
        this.etat_terrain = etat_terrain;
    }

    
    
}
