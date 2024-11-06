package com.example.banque_lsi.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends com.example.banque_lsi.entities.Compte {

    private double decouvert;

    public CompteCourant() {
        super();
    }
    public CompteCourant(String codeCompte , Date dateCreation , Double solde, double decouvert){
        super(codeCompte , dateCreation , solde);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
