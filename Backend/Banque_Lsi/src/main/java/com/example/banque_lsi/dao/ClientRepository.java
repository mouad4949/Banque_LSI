package com.example.banque_lsi.dao;

import com.example.banque_lsi.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}

