package com.example.banque_lsi.entities;

import java.io.Serializable;
import java.util.Collection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeClient ;
    private String nomClient ;

    @OneToMany(mappedBy="client" , fetch = FetchType.LAZY)
    private Collection<com.example.banque_lsi.entities.Compte> comptes;

    public Long getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public Collection<com.example.banque_lsi.entities.Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Collection<com.example.banque_lsi.entities.Compte> comptes) {
        this.comptes = comptes;
    }

    public Client(String nomClient) {
        super();
        this.nomClient = nomClient;
    }
    public Client() {
        super();
    }

}
