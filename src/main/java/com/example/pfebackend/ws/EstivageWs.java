package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Estivage;
import com.example.pfebackend.service.EstivageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/estivage")
public class EstivageWs {
    @Autowired
    private EstivageService estivageService;

    public Estivage findByRef(String ref) {
        return estivageService.findByRef(ref);
    }

    public List<Estivage> findByAdherentPpr(String ppr) {
        return estivageService.findByAdherentPpr(ppr);
    }

    public List<Estivage> findByAdherentNumAdhesion(String numAdhesion) {
        return estivageService.findByAdherentNumAdhesion(numAdhesion);
    }

    public List<Estivage> findByAdherentCin(String cin) {
        return estivageService.findByAdherentCin(cin);
    }

    public List<Estivage> findByRegion(String region) {
        return estivageService.findByRegion(region);
    }

    public List<Estivage> findByVille(String ville) {
        return estivageService.findByVille(ville);
    }

    public List<Estivage> findByDateReception(String dateReception) {
        return estivageService.findByDateReception(dateReception);
    }

    public List<Estivage> findByDateEnvoi(String dateEnvoi) {
        return estivageService.findByDateEnvoi(dateEnvoi);
    }

    public List<Estivage> findByDateArrivee(String dateArrivee) {
        return estivageService.findByDateArrivee(dateArrivee);
    }

    public List<Estivage> findByNumArrivee(String numArrivee) {
        return estivageService.findByNumArrivee(numArrivee);
    }

    public List<Estivage> findAll() {
        return estivageService.findAll();
    }

    public int deleteByRef(String ref) {
        return estivageService.deleteByRef(ref);
    }

    public int deleteByNumArrivee(String numArrivee) {
        return estivageService.deleteByNumArrivee(numArrivee);
    }

    public int deleteByAdherentNumAdhesion(String numAdhesion) {
        return estivageService.deleteByAdherentNumAdhesion(numAdhesion);
    }

    public int deleteByAdherentPpr(String ppr) {
        return estivageService.deleteByAdherentPpr(ppr);
    }

    public int deleteByAdherentCin(String cin) {
        return estivageService.deleteByAdherentCin(cin);
    }

    public int save(Estivage estivage) {
        return estivageService.save(estivage);
    }
}
