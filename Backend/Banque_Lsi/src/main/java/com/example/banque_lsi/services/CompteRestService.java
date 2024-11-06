package com.example.banque_lsi.services;

import com.example.banque_lsi.entities.Compte;
import com.example.banque_lsi.metier.CompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompteRestService {

    @Autowired
    private CompteMetier compteMetier;

    @PostMapping(value = "/compte")
    public Compte compte(@RequestBody Compte compte) {

        return compteMetier.saveCompte(compte);
    }

    @GetMapping(value = "/comptes")
    public List<Compte> getComptes() {
        return compteMetier.listCompte();
    }
}
