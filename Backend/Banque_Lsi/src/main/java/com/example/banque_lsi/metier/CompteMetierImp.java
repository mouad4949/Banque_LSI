package com.example.banque_lsi.metier;


import com.example.banque_lsi.dao.CompteRepository;

import com.example.banque_lsi.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteMetierImp implements CompteMetier {
    @Autowired
    private CompteRepository compteRepository;

    @Override
    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public List<Compte> listCompte() {
        return compteRepository.findAll();
    }
}
