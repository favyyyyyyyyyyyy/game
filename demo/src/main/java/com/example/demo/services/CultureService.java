package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domaine.Culture;
import com.example.demo.repositories.CultureRepository;

import java.util.List;

@Service
public class CultureService {
    @Autowired
    private CultureRepository cultureRepository;

    public List<Culture> getAllCultures() {
        return cultureRepository.findAll();
    }

    public Culture insertCulture(String nom, float unite, float prix) {
        Culture culture = new Culture();
        culture.setNom_Culture(nom);
        culture.setUnite(unite);
        culture.setPrix_culture(prix);
        return cultureRepository.save(culture);
    }
}
