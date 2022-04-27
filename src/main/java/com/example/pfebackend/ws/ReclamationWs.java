package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Reclamation;
import com.example.pfebackend.service.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reclamations")
public class ReclamationWs {
    @Autowired
    private ReclamationService reclamationService;

    @GetMapping("/ref/{ref}")
    public Reclamation findByRef(@PathVariable String ref) {
        return reclamationService.findByRef(ref);
    }

    @GetMapping("/adherent/cin/{cin}")
    public List<Reclamation> findByAdherentCin(@PathVariable String cin) {
        return reclamationService.findByAdherentCin(cin);
    }

    @GetMapping("/adherent/ppr/{ppr}")
    public List<Reclamation> findByAdherentPpr(@PathVariable String ppr) {
        return reclamationService.findByAdherentPpr(ppr);
    }

    @GetMapping("/adherent/aff/{numAdhesion}")
    public List<Reclamation> findByAdherentNumAdhesion(@PathVariable String numAdhesion) {
        return reclamationService.findByAdherentNumAdhesion(numAdhesion);
    }

    @GetMapping("/")
    public List<Reclamation> findAll() {
        return reclamationService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return reclamationService.deleteByRef(ref);
    }

    @DeleteMapping("/adherent/cin/{cin}")
    public int deleteByAdherentCin(@PathVariable String cin) {
        return reclamationService.deleteByAdherentCin(cin);
    }

    @DeleteMapping("/adherent/ppr/{ppr}")
    public int deleteByAdherentPpr(@PathVariable String ppr) {
        return reclamationService.deleteByAdherentPpr(ppr);
    }

    @DeleteMapping("/adherent/aff/{numAdhesion}")
    public int deleteByAdherentNumAdhesion(@PathVariable String numAdhesion) {
        return reclamationService.deleteByAdherentNumAdhesion(numAdhesion);
    }

    @PostMapping("/")
    public int save(@RequestBody Reclamation reclamation) {
        return reclamationService.save(reclamation);
    }
}
