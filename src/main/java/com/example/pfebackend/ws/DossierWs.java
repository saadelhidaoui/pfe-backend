package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Dossier;
import com.example.pfebackend.service.DossierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/dossier")
public class DossierWs {
    @Autowired
    private DossierService dossierService;

    @GetMapping("/reference/{reference}")
    public Dossier findByReference(@PathVariable String reference) {
        return dossierService.findByReference(reference);
    }

    @GetMapping("/adherent/aff/{numAdhesion}")
    public Dossier findByAdherentNumAdhesion(@PathVariable String numAdhesion) {
        return dossierService.findByAdherentNumAdhesion(numAdhesion);
    }

    @GetMapping("/adherent/ppr/{ppr}")
    public Dossier findByAdherentPpr(@PathVariable String ppr) {
        return dossierService.findByAdherentPpr(ppr);
    }

    @GetMapping("/adherent/cin/{cin}")
    public Dossier findByAdherentCin(@PathVariable String cin) {
        return dossierService.findByAdherentCin(cin);
    }

    @GetMapping("/dateArrivee/{dateArrivee}")
    public List<Dossier> findByDateArrivee(@PathVariable Date dateArrivee) {
        return dossierService.findByDateArrivee(dateArrivee);
    }

    @GetMapping("/dateEnvoi/{dateEnvoi}")
    public List<Dossier> findByDateEnvoi(@PathVariable Date dateEnvoi) {
        return dossierService.findByDateEnvoi(dateEnvoi);
    }

    @GetMapping("/dateReception/{dateReception}")
    public List<Dossier> findByDateReception(@PathVariable Date dateReception) {
        return dossierService.findByDateReception(dateReception);
    }

    @GetMapping("/dateNiveauImportance/{dateNiveauImport}")
    public List<Dossier> findByNiveauImport(@PathVariable String niveauImport) {
        return dossierService.findByNiveauImport(niveauImport);
    }

    @GetMapping("/typeDossier/{typeDossier}")
    public List<Dossier> findByTypeDossier(@PathVariable String typeDossier) {
        return dossierService.findByTypeDossier(typeDossier);
    }

    public List<Dossier> findAll() {
        return dossierService.findAll();
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return dossierService.deleteByReference(reference);
    }

    @DeleteMapping("/adhrent/cin/{cin}")
    public int deleteByAdherentCin(@PathVariable String cin) {
        return dossierService.deleteByAdherentCin(cin);
    }

    @DeleteMapping("/adhrent/ppr/{ppr}")
    public int deleteByAdherentPpr(String ppr) {
        return dossierService.deleteByAdherentPpr(ppr);
    }

    @DeleteMapping("/adhrent/aff/{numAdhesion}")
    public int deleteByAdherentNumAdhesion(@PathVariable String numAdhesion) {
        return dossierService.deleteByAdherentNumAdhesion(numAdhesion);
    }

    @PostMapping("/")
    public int save(@RequestBody Dossier dossier) {
        return dossierService.save(dossier);
    }
}
