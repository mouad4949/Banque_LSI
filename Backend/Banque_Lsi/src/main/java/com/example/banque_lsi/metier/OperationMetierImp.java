package com.example.banque_lsi.metier;

import com.example.banque_lsi.dao.OperationRepository;
import com.example.banque_lsi.entities.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationMetierImp implements OperationMetier {
    @Autowired
    private OperationRepository operationRepository;

    @Override
    public Operation saveOperation(Operation operation) {
        return operationRepository.save(operation);
    }

    @Override
    public List<Operation> listOperation() {
        return operationRepository.findAll();
    }

}
