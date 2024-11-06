package com.example.banque_lsi.metier;

import com.example.banque_lsi.entities.Compte;

import java.util.List;

public interface CompteMetier {
    public Compte saveCompte(Compte compte);
    public List<Compte> listCompte();
}
