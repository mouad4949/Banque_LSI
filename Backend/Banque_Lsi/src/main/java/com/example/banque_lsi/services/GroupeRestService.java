package com.example.banque_lsi.services;

import com.example.banque_lsi.entities.Groupe;
import com.example.banque_lsi.metier.GroupMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupeRestService {

    @Autowired
    private GroupMetier groupeMetier;

    @PostMapping(value = "/groupe")
    public Groupe groupe(@RequestBody Groupe groupe) {

        return groupeMetier.saveGroupe(groupe);
    }

    @GetMapping(value = "/groupes")
    public List<Groupe> getGroupes() {
        return groupeMetier.listGroupe();
    }
}
