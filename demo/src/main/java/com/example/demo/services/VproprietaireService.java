package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domaine.Vproprietaire;
import com.example.demo.repositories.VproprietaireRepository;

@Service
public class VproprietaireService {
     @Autowired
    private VproprietaireRepository vproprietaireRepository;

    public List<Vproprietaire> getAllVproprietaires() {
        return vproprietaireRepository.findAll();
    }
}
