package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Enfant;
import com.example.pfebackend.service.EnfantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enfant")
public class EnfantWs {
    @Autowired
    private EnfantService enfantService;

    @GetMapping("/ref/{ref}")
    public Enfant findByRef(@PathVariable String ref) {
        return enfantService.findByRef(ref);
    }

    @GetMapping("/cin/{cin}")
    public List<Enfant> findByAdherentCin(@PathVariable String cin) {
        return enfantService.findByAdherentCin(cin);
    }

    @GetMapping("/ppr/{ppr}")
    public List<Enfant> findByAdherentPpr(@PathVariable String ppr) {
        return enfantService.findByAdherentPpr(ppr);
    }

    @GetMapping("/aff/{numAdhesion}")
    public List<Enfant> findByAdherentNumAdhesion(@PathVariable String numAdhesion) {
        return enfantService.findByAdherentNumAdhesion(numAdhesion);
    }

    @GetMapping("/")
    public List<Enfant> findAll() {
        return enfantService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return enfantService.deleteByRef(ref);
    }

    @DeleteMapping("/adherent/cin/{cin}")
    public int deleteByAdherentCin(@PathVariable String cin) {
        return enfantService.deleteByAdherentCin(cin);
    }

    @DeleteMapping("/adherent/ppr/{ppr}")
    public int deleteByAdherentPpr(@PathVariable String ppr) {
        return enfantService.deleteByAdherentPpr(ppr);
    }

    @DeleteMapping("/adherent/aff/{numAdhesion}")
    public int deleteByAdherentNumAdhesion(@PathVariable String numAdhesion) {
        return enfantService.deleteByAdherentNumAdhesion(numAdhesion);
    }
}
