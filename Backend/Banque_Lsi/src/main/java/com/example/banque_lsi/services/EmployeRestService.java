package com.example.banque_lsi.services;

import com.example.banque_lsi.entities.Compte;
import com.example.banque_lsi.entities.Employe;
import com.example.banque_lsi.metier.CompteMetier;
import com.example.banque_lsi.metier.EmployeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeRestService {

    @Autowired
    private EmployeMetier employeMetier;

    @PostMapping(value = "/employe")
    public Employe employe(@RequestBody Employe employe) {

        return employeMetier.saveEmploye(employe);
    }

    @GetMapping(value = "/employes")
    public List<Employe> getEmployees() {
        return employeMetier.listEmploye();
    }
}
