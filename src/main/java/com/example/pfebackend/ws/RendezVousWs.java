package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Rendezvous;
import com.example.pfebackend.service.RendezVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/rendez-vous")
public class RendezVousWs {
    @Autowired
    private RendezVousService rendezVousService;

    @GetMapping("/ref/{ref}")
    public Rendezvous findByRef(@PathVariable String ref) {
        return rendezVousService.findByRef(ref);
    }

    @GetMapping("/dateDebut/{dateDebut}")
    public List<Rendezvous> findByDateDebut(@PathVariable Date dateDebut) {
        return rendezVousService.findByDateDebut(dateDebut);
    }

    @GetMapping("/")
    public List<Rendezvous> findAll() {
        return rendezVousService.findAll();
    }

    @DeleteMapping("ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return rendezVousService.deleteByRef(ref);
    }

    @PostMapping("/")
    public int save(@RequestBody Rendezvous rendezvous) {
        return rendezVousService.save(rendezvous);
    }
}
