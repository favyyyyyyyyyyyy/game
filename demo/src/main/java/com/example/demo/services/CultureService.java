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

    public Culture insertCulture(Culture culture) {
        return cultureRepository.save(culture);
    }
}
