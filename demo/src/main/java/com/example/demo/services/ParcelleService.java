package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domaine.Parcelle;
import com.example.demo.repositories.ParcelleRepository;

import java.util.List;

@Service
public class ParcelleService {
    @Autowired
    private ParcelleRepository parcelleRepository;

    public List<Parcelle> getAllParcelles() {
        return parcelleRepository.findAll();
    }

    public Parcelle insertParcelle(Parcelle parcelle) {
        return parcelleRepository.save(parcelle);
    }
}
