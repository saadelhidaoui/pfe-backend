package com.example.pfebackend.service;

import com.example.pfebackend.bean.Adherent;
import com.example.pfebackend.dao.AdherentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdherentService {
    @Autowired
    private AdherentDao adherentDao;

    public Adherent findByCin(String cin) {
        return adherentDao.findByCin(cin);
    }

    public Adherent findByPpr(String ppr) {
        return adherentDao.findByPpr(ppr);
    }

    public Adherent findByNom(String nom) {
        return adherentDao.findByNom(nom);
    }

    public Adherent findByNumAdhesion(String numAdhesion) {
        return adherentDao.findByNumAdhesion(numAdhesion);
    }

    public List<Adherent> findAll() {
        return adherentDao.findAll();
    }

    public int deleteByCin(String cin) {
        return adherentDao.deleteByCin(cin);
    }

    public int deleteByPpr(String ppr) {
        return adherentDao.deleteByPpr(ppr);
    }

    public int deleteByNumAdhesion(String numAdhesion) {
        return adherentDao.deleteByNumAdhesion(numAdhesion);
    }

    public int save(Adherent adherent) {
        adherentDao.save(adherent);
        return 1;
    }
}
