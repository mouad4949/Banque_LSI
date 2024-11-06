package com.example.banque_lsi.metier;

import java.util.List;
import com.example.banque_lsi.entities.Client;
public interface ClientMetier {
    public Client saveClient(Client client);
    public List<Client> listClient();
}
