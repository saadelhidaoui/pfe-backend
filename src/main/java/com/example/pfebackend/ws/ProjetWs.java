package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Projets;
import com.example.pfebackend.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/projets")
public class ProjetWs {
    @Autowired
    private ProjetService projetService;

    @GetMapping("/ref/{ref}")
    public Projets findByRef(@PathVariable String ref) {
        return projetService.findByRef(ref);
    }

    @GetMapping("/dateDebut/{dateDebut}")
    public List<Projets> findByDateDebut(@PathVariable Date dateDebut) {
        return projetService.findByDateDebut(dateDebut);
    }

    @GetMapping("/ville/{ville}")
    public List<Projets> findByVille(@PathVariable String ville) {
        return projetService.findByVille(ville);
    }

    @GetMapping("/")
    public List<Projets> findAll() {
        return projetService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return projetService.deleteByRef(ref);
    }

    @PostMapping("/")
    public int save(@RequestBody Projets projets) {
        return projetService.save(projets);
    }
}
