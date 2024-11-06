package com.example.banque_lsi.dao;

import com.example.banque_lsi.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, Long> {
}
