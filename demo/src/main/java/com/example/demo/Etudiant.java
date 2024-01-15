package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.)
    Integer id;
    String nom;

}
