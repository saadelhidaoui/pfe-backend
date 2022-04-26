package com.example.pfebackend.service;

import com.example.pfebackend.bean.Enfant;
import com.example.pfebackend.dao.EnfantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnfantService {
    @Autowired
    private EnfantDao enfantDao;
    @Autowired
    private AdherentService adherentService;

    public Enfant findByRef(String ref) {
        return enfantDao.findByRef(ref);
    }

    public List<Enfant> findByAdherentCin(String cin) {
        return enfantDao.findByAdherentCin(cin);
    }

    public List<Enfant> findByAdherentPpr(String ppr) {
        return enfantDao.findByAdherentPpr(ppr);
    }

    public List<Enfant> findByAdherentNumAdhesion(String numAdhesion) {
        return enfantDao.findByAdherentNumAdhesion(numAdhesion);
    }

    public List<Enfant> findAll() {
        return enfantDao.findAll();
    }

    public int deleteByRef(String ref) {
        return enfantDao.deleteByRef(ref);
    }

    public int deleteByAdherentCin(String cin) {
        return enfantDao.deleteByAdherentCin(cin);
    }

    public int deleteByAdherentPpr(String ppr) {
        return enfantDao.deleteByAdherentPpr(ppr);
    }

    public int deleteByAdherentNumAdhesion(String numAdhesion) {
        return enfantDao.deleteByAdherentNumAdhesion(numAdhesion);
    }

}
