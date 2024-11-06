package com.example.banque_lsi.dao;

import com.example.banque_lsi.entities.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupeRepository extends JpaRepository<Groupe, Long> {
}
