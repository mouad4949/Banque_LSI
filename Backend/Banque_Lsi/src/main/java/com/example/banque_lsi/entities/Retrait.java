package com.example.banque_lsi.entities;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("R")
public class Retrait extends com.example.banque_lsi.entities.Operation {

}
