package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Adherent;
import com.example.pfebackend.service.AdherentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/adherent")
public class AdherentWs {
    @Autowired
    private AdherentService adherentService;

    @GetMapping("cin/{cin}")
    public Adherent findByCin(@PathVariable String cin) {
        return adherentService.findByCin(cin);
    }

    @GetMapping("/ppr/{ppr}")
    public Adherent findByPpr(@PathVariable String ppr) {
        return adherentService.findByPpr(ppr);
    }

    @GetMapping("nom/{nom}")
    public Adherent findByNom(@PathVariable String nom) {
        return adherentService.findByNom(nom);
    }

    @GetMapping("/numAdhesion/{numAdhesion}")
    public Adherent findByNumAdhesion(@PathVariable String numAdhesion) {
        return adherentService.findByNumAdhesion(numAdhesion);
    }

    public List<Adherent> findAll() {
        return adherentService.findAll();
    }

    @DeleteMapping("/cin/{cin}")
    public int deleteByCin(@PathVariable String cin) {
        return adherentService.deleteByCin(cin);
    }

    @DeleteMapping("/ppr/{ppr}")
    public int deleteByPpr(@PathVariable String ppr) {
        return adherentService.deleteByPpr(ppr);
    }
@DeleteMapping("/numAdhesion/{numAdhesion}")
    public int deleteByNumAdhesion(@PathVariable String numAdhesion) {
        return adherentService.deleteByNumAdhesion(numAdhesion);
    }

    @GetMapping("/")
    public int save(@RequestBody Adherent adherent) {
        return adherentService.save(adherent);
    }
}
