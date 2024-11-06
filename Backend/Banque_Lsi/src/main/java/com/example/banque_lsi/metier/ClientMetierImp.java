package com.example.banque_lsi.metier;

import com.example.banque_lsi.dao.ClientRepository;
import com.example.banque_lsi.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientMetierImp implements ClientMetier {
    @Autowired
    private ClientRepository clientRepository;


    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> listClient() {
        return clientRepository.findAll();
    }
}
