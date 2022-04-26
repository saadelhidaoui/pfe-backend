package com.example.pfebackend.service;

import com.example.pfebackend.bean.Projets;
import com.example.pfebackend.dao.ProjetsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProjetService {
    @Autowired
    private ProjetsDao projetsDao;

    public Projets findByRef(String ref) {
        return projetsDao.findByRef(ref);
    }

    public List<Projets> findByDateDebut(Date dateDebut) {
        return projetsDao.findByDateDebut(dateDebut);
    }

    public List<Projets> findByVille(String ville) {
        return projetsDao.findByVille(ville);
    }

    public List<Projets> findAll() {
        return projetsDao.findAll();
    }

    public int deleteByRef(String ref) {
        return projetsDao.deleteByRef(ref);
    }

    public int save(Projets projets) {
        projetsDao.save(projets);
        return 1;
    }
}
