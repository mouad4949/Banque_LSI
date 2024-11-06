package com.example.banque_lsi.metier;

import com.example.banque_lsi.dao.EmployeRepository;
import com.example.banque_lsi.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeMetierImp implements EmployeMetier {
    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> listEmploye() {
        return employeRepository.findAll();
    }
}
