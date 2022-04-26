package com.example.pfebackend.service;

import com.example.pfebackend.bean.Conjoint;
import com.example.pfebackend.dao.ConjointDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConjointService {
    @Autowired
    private ConjointDao conjointDao;
    @Autowired
    private AdherentService adherentService;

    public Conjoint findByCin(String cin) {
        return conjointDao.findByCin(cin);
    }

    public Conjoint findByNom(String nom) {
        return conjointDao.findByNom(nom);
    }

    public List<Conjoint> findByAdherentCin(String cin) {
        return conjointDao.findByAdherentCin(cin);
    }

    public List<Conjoint> findByAdherentPpr(String ppr) {
        return conjointDao.findByAdherentPpr(ppr);
    }

    public List<Conjoint> findByAdherentNumAdhesion(String numAdhesion) {
        return conjointDao.findByAdherentNumAdhesion(numAdhesion);
    }

    public int deleteByAdherentCin(String cin) {
        return conjointDao.deleteByAdherentCin(cin);
    }

    public int deleteByCin(String cin) {
        return conjointDao.deleteByCin(cin);
    }

    public List<Conjoint> findAll() {
        return conjointDao.findAll();
    }

    public List<Conjoint> findAll(Sort sort) {
        return conjointDao.findAll(sort);
    }

}
