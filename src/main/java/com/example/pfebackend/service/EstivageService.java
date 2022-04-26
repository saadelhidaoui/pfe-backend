package com.example.pfebackend.service;

import com.example.pfebackend.bean.Estivage;
import com.example.pfebackend.dao.EstivageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstivageService {
    @Autowired
    private EstivageDao estivageDao;
    @Autowired
    private ModerateurService moderateurService;

    public Estivage findByRef(String ref) {
        return estivageDao.findByRef(ref);
    }

    public List<Estivage> findByAdherentPpr(String ppr) {
        return estivageDao.findByAdherentPpr(ppr);
    }

    public List<Estivage> findByAdherentNumAdhesion(String numAdhesion) {
        return estivageDao.findByAdherentNumAdhesion(numAdhesion);
    }

    public List<Estivage> findByAdherentCin(String cin) {
        return estivageDao.findByAdherentCin(cin);
    }

    public List<Estivage> findByRegion(String region) {
        return estivageDao.findByRegion(region);
    }

    public List<Estivage> findByVille(String ville) {
        return estivageDao.findByVille(ville);
    }

    public List<Estivage> findByDateReception(String dateReception) {
        return estivageDao.findByDateReception(dateReception);
    }

    public List<Estivage> findByDateEnvoi(String dateEnvoi) {
        return estivageDao.findByDateEnvoi(dateEnvoi);
    }

    public List<Estivage> findByDateArrivee(String dateArrivee) {
        return estivageDao.findByDateArrivee(dateArrivee);
    }

    public List<Estivage> findByNumArrivee(String numArrivee) {
        return estivageDao.findByNumArrivee(numArrivee);
    }

    public List<Estivage> findAll() {
        return estivageDao.findAll();
    }

    public int deleteByRef(String ref) {
        return estivageDao.deleteByRef(ref);
    }

    public int deleteByNumArrivee(String numArrivee) {
        return estivageDao.deleteByNumArrivee(numArrivee);
    }

    public int deleteByAdherentNumAdhesion(String numAdhesion) {
        return estivageDao.deleteByAdherentNumAdhesion(numAdhesion);
    }

    public int deleteByAdherentPpr(String ppr) {
        return estivageDao.deleteByAdherentPpr(ppr);
    }

    public int deleteByAdherentCin(String cin) {
        return estivageDao.deleteByAdherentCin(cin);
    }

    public int save(Estivage estivage) {
        estivageDao.save(estivage);
        return 1;
    }
}
