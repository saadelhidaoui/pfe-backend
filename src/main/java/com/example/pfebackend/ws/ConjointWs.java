package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Conjoint;
import com.example.pfebackend.service.AdherentService;
import com.example.pfebackend.service.ConjointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/conjoint")
public class ConjointWs {
    @Autowired
    private ConjointService conjointService;
    @Autowired
    private AdherentService adherentService;

    public Conjoint findByCin(String cin) {
        return conjointService.findByCin(cin);
    }

    public Conjoint findByNom(String nom) {
        return conjointService.findByNom(nom);
    }

    public List<Conjoint> findByAdherentCin(String cin) {
        return conjointService.findByAdherentCin(cin);
    }

    public List<Conjoint> findByAdherentPpr(String ppr) {
        return conjointService.findByAdherentPpr(ppr);
    }

    public List<Conjoint> findByAdherentNumAdhesion(String numAdhesion) {
        return conjointService.findByAdherentNumAdhesion(numAdhesion);
    }

    public int deleteByAdherentCin(String cin) {
        return conjointService.deleteByAdherentCin(cin);
    }

    public int deleteByCin(String cin) {
        return conjointService.deleteByCin(cin);
    }

    public List<Conjoint> findAll() {
        return conjointService.findAll();
    }

}
