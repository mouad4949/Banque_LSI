package com.example.banque_lsi.metier;

import com.example.banque_lsi.entities.Groupe;

import java.util.List;

public interface GroupMetier {
    public Groupe saveGroupe(Groupe group);
    public List<Groupe> listGroupe();
}
