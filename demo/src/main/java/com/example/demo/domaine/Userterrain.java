package com.example.demo.domaine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Userterrain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idUtilisateur;

    String nom_utilisateur;
    Integer id_terrain;
    String nom_terrain;

    
    public Userterrain(Integer idUtilisateur, String nom_utilisateur, Integer id_terrain, String nom_terrain) {
        this.idUtilisateur = idUtilisateur;
        this.nom_utilisateur = nom_utilisateur;
        this.id_terrain = id_terrain;
        this.nom_terrain = nom_terrain;
    }

    public Userterrain() {
    }


    public Integer getidUtilisateur() {
        return idUtilisateur;
    }
    public void setidUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
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

    
}
