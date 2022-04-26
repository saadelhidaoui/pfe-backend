package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Reclamation;
import com.example.pfebackend.service.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reclamations")
public class ReclamationWs {
    @Autowired
    private ReclamationService reclamationService;

    public Reclamation findByRef(String ref) {
        return reclamationService.findByRef(ref);
    }

    public List<Reclamation> findByAdherentCin(String cin) {
        return reclamationService.findByAdherentCin(cin);
    }

    public List<Reclamation> findByAdherentPpr(String ppr) {
        return reclamationService.findByAdherentPpr(ppr);
    }

    public List<Reclamation> findByAdherentNumAdhesion(String numAdhesion) {
        return reclamationService.findByAdherentNumAdhesion(numAdhesion);
    }

    public List<Reclamation> findAll() {
        return reclamationService.findAll();
    }

    public int deleteByRef(String ref) {
        return reclamationService.deleteByRef(ref);
    }

    public int deleteByAdherentCin(String cin) {
        return reclamationService.deleteByAdherentCin(cin);
    }

    public int deleteByAdherentPpr(String ppr) {
        return reclamationService.deleteByAdherentPpr(ppr);
    }

    public int deleteByAdherentNumAdhesion(String numAdhesion) {
        return reclamationService.deleteByAdherentNumAdhesion(numAdhesion);
    }

    public int save(Reclamation reclamation) {
        return reclamationService.save(reclamation);
    }
}
