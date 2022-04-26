package com.example.pfebackend.service;

import com.example.pfebackend.bean.Produit;
import com.example.pfebackend.dao.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitDao produitDao;

    public Produit findByRef(String ref) {
        return produitDao.findByRef(ref);
    }

    public List<Produit> findByDateArrivee(Date dateArrivee) {
        return produitDao.findByDateArrivee(dateArrivee);
    }

    public List<Produit> findAll() {
        return produitDao.findAll();
    }

    public int deleteByRef(String ref) {
        return produitDao.deleteByRef(ref);
    }

    public int save(Produit produit) {
        produitDao.save(produit);
        return 1;
    }
}
