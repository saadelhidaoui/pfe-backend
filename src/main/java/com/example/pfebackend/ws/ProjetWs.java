package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Projets;
import com.example.pfebackend.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/projets")
public class ProjetWs {
    @Autowired
    private ProjetService projetService;

    public Projets findByRef(String ref) {
        return projetService.findByRef(ref);
    }

    public List<Projets> findByDateDebut(Date dateDebut) {
        return projetService.findByDateDebut(dateDebut);
    }

    public List<Projets> findByVille(String ville) {
        return projetService.findByVille(ville);
    }

    public List<Projets> findAll() {
        return projetService.findAll();
    }

    public int deleteByRef(String ref) {
        return projetService.deleteByRef(ref);
    }

    public int save(Projets projets) {
        return projetService.save(projets);
    }
}
