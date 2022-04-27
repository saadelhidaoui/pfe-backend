package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Estivage;
import com.example.pfebackend.service.EstivageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estivage")
public class EstivageWs {
    @Autowired
    private EstivageService estivageService;

    @GetMapping("/ref/{ref}")
    public Estivage findByRef(@PathVariable String ref) {
        return estivageService.findByRef(ref);
    }

    @GetMapping("/ppr/{ppr}")
    public List<Estivage> findByAdherentPpr(@PathVariable String ppr) {
        return estivageService.findByAdherentPpr(ppr);
    }

    @GetMapping("/aff/{numAdhesion}")
    public List<Estivage> findByAdherentNumAdhesion(@PathVariable String numAdhesion) {
        return estivageService.findByAdherentNumAdhesion(numAdhesion);
    }

    @GetMapping("/adherent/cin/{cin}")
    public List<Estivage> findByAdherentCin(@PathVariable String cin) {
        return estivageService.findByAdherentCin(cin);
    }

    @GetMapping("/region/{region}")
    public List<Estivage> findByRegion(@PathVariable String region) {
        return estivageService.findByRegion(region);
    }

    @GetMapping("/ville/{ville}")
    public List<Estivage> findByVille(@PathVariable String ville) {
        return estivageService.findByVille(ville);
    }

    @GetMapping("/dateReception/{dateReception}")
    public List<Estivage> findByDateReception(@PathVariable String dateReception) {
        return estivageService.findByDateReception(dateReception);
    }

    @GetMapping("/dateEnvoi/{dateEnvoi}")
    public List<Estivage> findByDateEnvoi(@PathVariable String dateEnvoi) {
        return estivageService.findByDateEnvoi(dateEnvoi);
    }

    @GetMapping("/dateArrivee/{dateArrivee}")
    public List<Estivage> findByDateArrivee(@PathVariable String dateArrivee) {
        return estivageService.findByDateArrivee(dateArrivee);
    }

    @GetMapping("/numArrivee/{dateArrivee}")
    public List<Estivage> findByNumArrivee(String numArrivee) {
        return estivageService.findByNumArrivee(numArrivee);
    }

    @GetMapping("/")
    public List<Estivage> findAll() {
        return estivageService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return estivageService.deleteByRef(ref);
    }

    @DeleteMapping("/aff/{numArrivee}")
    public int deleteByNumArrivee(@PathVariable String numArrivee) {
        return estivageService.deleteByNumArrivee(numArrivee);
    }

    @DeleteMapping("/adherent/aff/{numAdhesion}")
    public int deleteByAdherentNumAdhesion(@PathVariable String numAdhesion) {
        return estivageService.deleteByAdherentNumAdhesion(numAdhesion);
    }

    @DeleteMapping("/adherent/ppr/{ppr}")
    public int deleteByAdherentPpr(@PathVariable String ppr) {
        return estivageService.deleteByAdherentPpr(ppr);
    }

    @DeleteMapping("/adherent/cin/{cin}")
    public int deleteByAdherentCin(@PathVariable String cin) {
        return estivageService.deleteByAdherentCin(cin);
    }

    @PostMapping("/")
    public int save(@RequestBody Estivage estivage) {
        return estivageService.save(estivage);
    }
}
