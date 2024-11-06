package com.example.banque_lsi.dao;

import com.example.banque_lsi.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
