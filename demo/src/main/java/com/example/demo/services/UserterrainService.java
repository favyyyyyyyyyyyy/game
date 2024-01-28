package com.example.demo.services;

import com.example.demo.domaine.Userterrain;
import com.example.demo.repositories.UserterrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserterrainService {
    @Autowired
    private UserterrainRepository userterrainRepository;

    public List<Userterrain> getUserterrainByIdUtilisateur(Integer idUtilisateur) {
        return userterrainRepository.findByIdUtilisateur(idUtilisateur);
    }
}
