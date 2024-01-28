package com.example.demo.domaine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Culture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_Culture;


    String nom_Culture;
    float prix_culture;

    
    public Culture() {
    }

    
    public Culture(Integer id_Culture, String nom_Culture, float prix_culture) {
        this.setId_Culture(id_Culture);
        this.setNom_Culture(nom_Culture);
        this.setPrix_culture(prix_culture);
    }


    public Integer getId_Culture() {
        return id_Culture;
    }
    public void setId_Culture(Integer id_Culture) {
        this.id_Culture = id_Culture;
    }
    public String getNom_Culture() {
        return nom_Culture;
    }
    public void setNom_Culture(String nom_Culture) {
        this.nom_Culture = nom_Culture;
    }
    public float getPrix_culture() {
        return prix_culture;
    }
    public void setPrix_culture(float prix_culture) {
        this.prix_culture = prix_culture;
    }

    


}
