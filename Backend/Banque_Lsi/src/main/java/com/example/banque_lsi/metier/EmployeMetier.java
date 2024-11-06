package com.example.banque_lsi.metier;

import com.example.banque_lsi.entities.Employe;

import java.util.List;

public interface EmployeMetier {
    public Employe saveEmploye(Employe employe);
    public List<Employe> listEmploye();
}
