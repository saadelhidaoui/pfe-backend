package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Conjoint;
import com.example.pfebackend.service.AdherentService;
import com.example.pfebackend.service.ConjointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conjoint")
public class ConjointWs {
    @Autowired
    private ConjointService conjointService;
    @Autowired
    private AdherentService adherentService;

    @GetMapping("/cin/{cin}")
    public Conjoint findByCin(@PathVariable String cin) {
        return conjointService.findByCin(cin);
    }

    @GetMapping("/nom/{nom}")
    public Conjoint findByNom(@PathVariable String nom) {
        return conjointService.findByNom(nom);
    }

    @GetMapping("/adherent/cin/{cin}")
    public List<Conjoint> findByAdherentCin(@PathVariable String cin) {
        return conjointService.findByAdherentCin(cin);
    }

    @GetMapping("/adherent/ppr/{ppr}")
    public List<Conjoint> findByAdherentPpr(@PathVariable String ppr) {
        return conjointService.findByAdherentPpr(ppr);
    }

    @GetMapping("/adherent/numAdhesion/{numAdhesion}")
    public List<Conjoint> findByAdherentNumAdhesion(@PathVariable String numAdhesion) {
        return conjointService.findByAdherentNumAdhesion(numAdhesion);
    }

    @DeleteMapping("/adherent/cin/{cin}")
    public int deleteByAdherentCin(@PathVariable String cin) {
        return conjointService.deleteByAdherentCin(cin);
    }

    @DeleteMapping("/cin/{cin}")
    public int deleteByCin(@PathVariable String cin) {
        return conjointService.deleteByCin(cin);
    }

    @GetMapping("/")
    public List<Conjoint> findAll() {
        return conjointService.findAll();
    }

}
