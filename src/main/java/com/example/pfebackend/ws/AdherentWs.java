package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Adherent;
import com.example.pfebackend.service.AdherentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/adherent")
public class AdherentWs {
    @Autowired
    private AdherentService adherentService;

    public Adherent findByCin(String cin) {
        return adherentService.findByCin(cin);
    }

    public Adherent findByPpr(String ppr) {
        return adherentService.findByPpr(ppr);
    }

    public Adherent findByNom(String nom) {
        return adherentService.findByNom(nom);
    }

    public Adherent findByNumAdhesion(String numAdhesion) {
        return adherentService.findByNumAdhesion(numAdhesion);
    }

    public List<Adherent> findAll() {
        return adherentService.findAll();
    }

    public int deleteByCin(String cin) {
        return adherentService.deleteByCin(cin);
    }

    public int deleteByPpr(String ppr) {
        return adherentService.deleteByPpr(ppr);
    }

    public int deleteByNumAdhesion(String numAdhesion) {
        return adherentService.deleteByNumAdhesion(numAdhesion);
    }

    public int save(Adherent adherent) {
        return adherentService.save(adherent);
    }
}
