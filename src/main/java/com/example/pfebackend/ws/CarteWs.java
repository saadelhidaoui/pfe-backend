package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Carte;
import com.example.pfebackend.service.CarteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/carte")
public class CarteWs {
    @Autowired
    private CarteService carteService;

    public Carte findByRef(String ref) {
        return carteService.findByRef(ref);
    }

    public Carte findByAdherentPpr(String ppr) {
        return carteService.findByAdherentPpr(ppr);
    }

    public Carte findByAdherentNumAdhesion(String numAdhesion) {
        return carteService.findByAdherentNumAdhesion(numAdhesion);
    }

    public Carte findByAdherentCin(String cin) {
        return carteService.findByAdherentCin(cin);
    }

    public List<Carte> findByDateArrivee(Date dateArrivee) {
        return carteService.findByDateArrivee(dateArrivee);
    }

    public List<Carte> findByDateDepart(Date dateDepart) {
        return carteService.findByDateDepart(dateDepart);
    }

    public List<Carte> findAll() {
        return carteService.findAll();
    }

    public int save(Carte carte) {
        return carteService.save(carte);
    }
}
