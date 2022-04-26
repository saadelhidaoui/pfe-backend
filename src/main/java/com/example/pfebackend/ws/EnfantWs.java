package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Enfant;
import com.example.pfebackend.service.EnfantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/enfant")
public class EnfantWs {
    @Autowired
    private EnfantService enfantService;

    public Enfant findByRef(String ref) {
        return enfantService.findByRef(ref);
    }

    public List<Enfant> findByAdherentCin(String cin) {
        return enfantService.findByAdherentCin(cin);
    }

    public List<Enfant> findByAdherentPpr(String ppr) {
        return enfantService.findByAdherentPpr(ppr);
    }

    public List<Enfant> findByAdherentNumAdhesion(String numAdhesion) {
        return enfantService.findByAdherentNumAdhesion(numAdhesion);
    }

    public List<Enfant> findAll() {
        return enfantService.findAll();
    }

    public int deleteByRef(String ref) {
        return enfantService.deleteByRef(ref);
    }

    public int deleteByAdherentCin(String cin) {
        return enfantService.deleteByAdherentCin(cin);
    }

    public int deleteByAdherentPpr(String ppr) {
        return enfantService.deleteByAdherentPpr(ppr);
    }

    public int deleteByAdherentNumAdhesion(String numAdhesion) {
        return enfantService.deleteByAdherentNumAdhesion(numAdhesion);
    }
}
