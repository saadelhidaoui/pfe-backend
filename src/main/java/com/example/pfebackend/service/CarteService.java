package com.example.pfebackend.service;

import com.example.pfebackend.bean.Carte;
import com.example.pfebackend.dao.CarteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CarteService {
    @Autowired
    private CarteDao carteDao;

    public Carte findByRef(String ref) {
        return carteDao.findByRef(ref);
    }

    public Carte findByAdherentPpr(String ppr) {
        return carteDao.findByAdherentPpr(ppr);
    }

    public Carte findByAdherentNumAdhesion(String numAdhesion) {
        return carteDao.findByAdherentNumAdhesion(numAdhesion);
    }

    public Carte findByAdherentCin(String cin) {
        return carteDao.findByAdherentCin(cin);
    }

    public List<Carte> findByDateArrivee(Date dateArrivee) {
        return carteDao.findByDateArrivee(dateArrivee);
    }

    public List<Carte> findByDateDepart(Date dateDepart) {
        return carteDao.findByDateDepart(dateDepart);
    }

    public List<Carte> findAll() {
        return carteDao.findAll();
    }

    public int save(Carte carte) {
        carteDao.save(carte);
        return 1;
    }
}
