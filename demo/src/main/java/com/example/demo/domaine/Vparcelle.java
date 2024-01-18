package com.example.demo.domaine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vparcelle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_parcelle;
    
    String nom_parcelle;
    float surface_parcelle;
    Integer id_culture;
    String nom_culture;
    float unite;
    float prix_culture;

    
    public Vparcelle() {
    }

    
    public Vparcelle(Integer id_parcelle, String nom_parcelle, float surface_parcelle, Integer id_culture,
            String nom_culture, float unite, float prix_culture) {
        this.setId_parcelle(id_parcelle);
        this.setNom_parcelle(nom_parcelle);
        this.setSurface_parcelle(surface_parcelle);
        this.setId_culture(id_culture);
        this.setNom_culture(nom_culture);
        this.setUnite(unite);
        this.setPrix_culture(prix_culture);
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
    public String getNom_culture() {
        return nom_culture;
    }
    public void setNom_culture(String nom_culture) {
        this.nom_culture = nom_culture;
    }
    public float getUnite() {
        return unite;
    }
    public void setUnite(float unite) {
        this.unite = unite;
    }
    public float getPrix_culture() {
        return prix_culture;
    }
    public void setPrix_culture(float prix_culture) {
        this.prix_culture = prix_culture;
    }

    
}
