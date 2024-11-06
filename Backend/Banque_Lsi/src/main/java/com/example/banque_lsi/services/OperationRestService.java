package com.example.banque_lsi.services;

import com.example.banque_lsi.entities.Groupe;
import com.example.banque_lsi.entities.Operation;
import com.example.banque_lsi.metier.GroupMetier;
import com.example.banque_lsi.metier.OperationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OperationRestService {

    @Autowired
    private OperationMetier operationMetier;

    @PostMapping(value = "/operation")
    public Operation operation(@RequestBody Operation operation) {

        return operationMetier.saveOperation(operation);
    }

    @GetMapping(value = "/operations")
    public List<Operation> getOperations() {
        return operationMetier.listOperation();
    }
}
