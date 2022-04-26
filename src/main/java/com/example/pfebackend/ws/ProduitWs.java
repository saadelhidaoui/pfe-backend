package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Produit;
import com.example.pfebackend.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/stock")
public class ProduitWs {
    @Autowired
    private ProduitService produitService;

    public Produit findByRef(String ref) {
        return produitService.findByRef(ref);
    }

    public List<Produit> findByDateArrivee(Date dateArrivee) {
        return produitService.findByDateArrivee(dateArrivee);
    }

    public List<Produit> findAll() {
        return produitService.findAll();
    }

    public int deleteByRef(String ref) {
        return produitService.deleteByRef(ref);
    }

    public int save(Produit produit) {
        return produitService.save(produit);
    }
}
