package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Dossier;
import com.example.pfebackend.service.DossierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/dossier")
public class DossierWs {
    @Autowired
    private DossierService dossierService;

    public Dossier findByReference(String reference) {
        return dossierService.findByReference(reference);
    }

    public Dossier findByAdherentNumAdhesion(String numAdhesion) {
        return dossierService.findByAdherentNumAdhesion(numAdhesion);
    }

    public Dossier findByAdherentPpr(String ppr) {
        return dossierService.findByAdherentPpr(ppr);
    }

    public Dossier findByAdherentCin(String cin) {
        return dossierService.findByAdherentCin(cin);
    }

    public List<Dossier> findByDateArrivee(Date dateArrivee) {
        return dossierService.findByDateArrivee(dateArrivee);
    }

    public List<Dossier> findByDateEnvoi(Date dateEnvoi) {
        return dossierService.findByDateEnvoi(dateEnvoi);
    }

    public List<Dossier> findByDateReception(Date dateReception) {
        return dossierService.findByDateReception(dateReception);
    }

    public List<Dossier> findByNiveauImport(String niveauImport) {
        return dossierService.findByNiveauImport(niveauImport);
    }

    public List<Dossier> findByTypeDossier(String typeDossier) {
        return dossierService.findByTypeDossier(typeDossier);
    }

    public List<Dossier> findAll() {
        return dossierService.findAll();
    }

    public int deleteByReference(String reference) {
        return dossierService.deleteByReference(reference);
    }

    public int deleteByAdherentCin(String cin) {
        return dossierService.deleteByAdherentCin(cin);
    }

    public int deleteByAdherentPpr(String ppr) {
        return dossierService.deleteByAdherentPpr(ppr);
    }

    public int deleteByAdherentNumAdhesion(String numAdhesion) {
        return dossierService.deleteByAdherentNumAdhesion(numAdhesion);
    }

    public int save(Dossier dossier) {
        return dossierService.save(dossier);
    }
}
