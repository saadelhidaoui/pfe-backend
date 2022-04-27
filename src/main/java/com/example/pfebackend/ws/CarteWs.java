package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Carte;
import com.example.pfebackend.service.CarteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/carte")
public class CarteWs {
    @Autowired
    private CarteService carteService;

    @GetMapping("ref/{ref}")
    public Carte findByRef(@PathVariable String ref) {
        return carteService.findByRef(ref);
    }

    @GetMapping("adherent/ppr/{ppr}")
    public Carte findByAdherentPpr(@PathVariable String ppr) {
        return carteService.findByAdherentPpr(ppr);
    }

    @GetMapping("/adherent/numAdhesion/{numAdhesion}")
    public Carte findByAdherentNumAdhesion(@PathVariable String numAdhesion) {
        return carteService.findByAdherentNumAdhesion(numAdhesion);
    }

    @GetMapping("/adherent/cin/{cin}")
    public Carte findByAdherentCin(@PathVariable String cin) {
        return carteService.findByAdherentCin(cin);
    }

    @GetMapping("dateArrivee/{dateArrivee}")
    public List<Carte> findByDateArrivee(@PathVariable Date dateArrivee) {
        return carteService.findByDateArrivee(dateArrivee);
    }

    @GetMapping("/dateDepart/{departDepart}")
    public List<Carte> findByDateDepart(@PathVariable Date dateDepart) {
        return carteService.findByDateDepart(dateDepart);
    }

    @GetMapping("/")
    public List<Carte> findAll() {
        return carteService.findAll();
    }
@PostMapping("/")
    public int save(@RequestBody Carte carte) {
        return carteService.save(carte);
    }
}
