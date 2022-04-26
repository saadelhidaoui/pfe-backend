package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Rendezvous;
import com.example.pfebackend.service.RendezVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/rendez-vous")
public class RendezVousWs {
    @Autowired
    private RendezVousService rendezVousService;

    public Rendezvous findByRef(String ref) {
        return rendezVousService.findByRef(ref);
    }

    public List<Rendezvous> findByDateDebut(Date dateDebut) {
        return rendezVousService.findByDateDebut(dateDebut);
    }

    public List<Rendezvous> findAll() {
        return rendezVousService.findAll();
    }

    public int deleteByRef(String ref) {
        return rendezVousService.deleteByRef(ref);
    }

    public int save(Rendezvous rendezvous) {
        return rendezVousService.save(rendezvous);
    }
}
