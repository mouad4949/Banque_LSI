package com.example.banque_lsi.metier;

import com.example.banque_lsi.dao.GroupeRepository;
import com.example.banque_lsi.entities.Groupe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupMetierImp implements GroupMetier{
    @Autowired
    private GroupeRepository groupeRepository;

    @Override
    public Groupe saveGroupe(Groupe groupe) {
        return groupeRepository.save(groupe);
    }

    @Override
    public List<Groupe> listGroupe() {
        return groupeRepository.findAll();
    }

}
