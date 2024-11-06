package com.example.banque_lsi.services;



import com.example.banque_lsi.entities.Client;
import com.example.banque_lsi.metier.ClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientRestService {


    @Autowired
    private ClientMetier clientMetier;

    @PostMapping(value = "/client")
    public Client clients(@RequestBody Client client) {

        return clientMetier.saveClient(client);
    }

    @GetMapping(value = "/clients")
    public List<Client> getClients() {
        return clientMetier.listClient();
    }
}

