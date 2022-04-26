package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Conventions;
import com.example.pfebackend.service.ConventionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/convention")
public class ConventionWs {
    @Autowired
    private ConventionService conventionService;

    public Conventions findByRef(String ref) {
        return conventionService.findByRef(ref);
    }

    public Conventions findByOrganisme(String organisme) {
        return conventionService.findByOrganisme(organisme);
    }

    public List<Conventions> findByDateDebut(Date dateDebut) {
        return conventionService.findByDateDebut(dateDebut);
    }

    public List<Conventions> findAll() {
        return conventionService.findAll();
    }

    public int deleteByRef(String ref) {
        return conventionService.deleteByRef(ref);
    }

    public int deleteByOrganisme(String organisme) {
        return conventionService.deleteByOrganisme(organisme);
    }

    public int deleteByDateDebut(Date dateDebut) {
        return conventionService.deleteByDateDebut(dateDebut);
    }

    public int save(Conventions conventions) {
        return conventionService.save(conventions);
    }
}
