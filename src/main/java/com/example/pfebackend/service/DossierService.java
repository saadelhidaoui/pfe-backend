package com.example.pfebackend.service;

import com.example.pfebackend.bean.Dossier;
import com.example.pfebackend.dao.DossierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DossierService {
    @Autowired
    private DossierDao dossierDao;
    @Autowired
    private AdherentService adherentService;
    @Autowired
    private ModerateurService moderateurService;

    public Dossier findByReference(String reference) {
        return dossierDao.findByReference(reference);
    }

    public Dossier findByAdherentNumAdhesion(String numAdhesion) {
        return dossierDao.findByAdherentNumAdhesion(numAdhesion);
    }

    public Dossier findByAdherentPpr(String ppr) {
        return dossierDao.findByAdherentPpr(ppr);
    }

    public Dossier findByAdherentCin(String cin) {
        return dossierDao.findByAdherentCin(cin);
    }

    public List<Dossier> findByDateArrivee(Date dateArrivee) {
        return dossierDao.findByDateArrivee(dateArrivee);
    }

    public List<Dossier> findByDateEnvoi(Date dateEnvoi) {
        return dossierDao.findByDateEnvoi(dateEnvoi);
    }

    public List<Dossier> findByDateReception(Date dateReception) {
        return dossierDao.findByDateReception(dateReception);
    }

    public List<Dossier> findByNiveauImport(String niveauImport) {
        return dossierDao.findByNiveauImport(niveauImport);
    }

    public List<Dossier> findByTypeDossier(String typeDossier) {
        return dossierDao.findByTypeDossier(typeDossier);
    }

    public List<Dossier> findAll() {
        return dossierDao.findAll();
    }

    public int deleteByReference(String reference) {
        return dossierDao.deleteByReference(reference);
    }

    public int deleteByAdherentCin(String cin) {
        return dossierDao.deleteByAdherentCin(cin);
    }

    public int deleteByAdherentPpr(String ppr) {
        return dossierDao.deleteByAdherentPpr(ppr);
    }

    public int deleteByAdherentNumAdhesion(String numAdhesion) {
        return dossierDao.deleteByAdherentNumAdhesion(numAdhesion);
    }

    public int save(Dossier dossier) {
        dossierDao.save(dossier);
        return 1;
    }
}
