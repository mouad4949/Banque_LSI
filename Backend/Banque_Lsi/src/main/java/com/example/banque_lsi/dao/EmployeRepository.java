package com.example.banque_lsi.dao;

import com.example.banque_lsi.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeRepository extends JpaRepository<Employe, Long>{
}
