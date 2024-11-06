package com.example.banque_lsi.metier;

import com.example.banque_lsi.entities.Operation;

import java.util.List;

public interface OperationMetier {

    public Operation saveOperation(Operation operation);
    public List<Operation> listOperation();
}
