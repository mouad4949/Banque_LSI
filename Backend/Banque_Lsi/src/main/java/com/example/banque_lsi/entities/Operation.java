package com.example.banque_lsi.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Operation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroOperacion;
    private Date dateOperation ;
    private double montant ;

    @ManyToOne
    @JoinColumn(name="CODE_CPTE")
    private com.example.banque_lsi.entities.Compte compte;

    @ManyToOne
    @JoinColumn(name="CODE_EMP")
    private com.example.banque_lsi.entities.Employe employe;

    public Operation(Date dateOperation, double montant) {
        super();
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    public Operation() {
        super();
    }

    public com.example.banque_lsi.entities.Employe getEmploye() {
        return employe;
    }

    public void setEmploye(com.example.banque_lsi.entities.Employe employe) {
        this.employe = employe;
    }

    public com.example.banque_lsi.entities.Compte getCompte() {
        return compte;
    }

    public void setCompte(com.example.banque_lsi.entities.Compte compte) {
        this.compte = compte;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Long getNumeroOperacion() {
        return numeroOperacion;
    }

    public void setNumeroOperacion(Long numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }
}
