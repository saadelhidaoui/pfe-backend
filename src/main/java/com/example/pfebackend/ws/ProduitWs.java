package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Produit;
import com.example.pfebackend.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/stock")
public class ProduitWs {
    @Autowired
    private ProduitService produitService;

    @GetMapping("/ref/{ref}")
    public Produit findByRef(@PathVariable String ref) {
        return produitService.findByRef(ref);
    }

    @GetMapping("/dateArrivee/{dateArrivee}")
    public List<Produit> findByDateArrivee(@PathVariable Date dateArrivee) {
        return produitService.findByDateArrivee(dateArrivee);
    }

    @GetMapping("/")
    public List<Produit> findAll() {
        return produitService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return produitService.deleteByRef(ref);
    }

    @PostMapping("/")
    public int save(@RequestBody Produit produit) {
        return produitService.save(produit);
    }
}
