package com.example.demo.domaine;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idUtilisateur;

    String nomUtilisateur;
    String mdp;
    Integer privilege;

    
    public Utilisateur() {
    }

    

    public Utilisateur(Integer idUtilisateur, String nomUtilisateur, String mdp) {
        this.setIdUtilisateur(idUtilisateur);
        this.setNomUtilisateur(nomUtilisateur);
        this.setMdp(mdp);
        this.setPrivilege(0);
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
    public String getMdp() {
        return mdp;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    public Integer getPrivilege() {
        return privilege;
    }
    public void setPrivilege(Integer privilege) {
        this.privilege = privilege;
    }

    
}
