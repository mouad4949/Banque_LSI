package com.example.banque_lsi.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;

@Entity
public class Groupe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeGroupe;
    private String nomGroup;

    @ManyToMany(mappedBy = "groupes")
    private Collection<com.example.banque_lsi.entities.Employe> employes;

    public Groupe(String nomGroup) {
        super();
        this.nomGroup = nomGroup;
    }

    public Groupe() {
        super();
    }

    public Long getCodeGroupe() {
        return codeGroupe;
    }

    public void setCodeGroupe(Long codeGroupe) {
        this.codeGroupe = codeGroupe;
    }

    public String getNomGroup() {
        return nomGroup;
    }

    public void setNomGroup(String nomGroup) {
        this.nomGroup = nomGroup;
    }

    public Collection<com.example.banque_lsi.entities.Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(Collection<com.example.banque_lsi.entities.Employe> employes) {
        this.employes = employes;
    }
}
