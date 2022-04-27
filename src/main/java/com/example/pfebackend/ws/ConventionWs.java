package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Conventions;
import com.example.pfebackend.service.ConventionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/convention")
public class ConventionWs {
    @Autowired
    private ConventionService conventionService;

    @GetMapping("/cin/{cin}")
    public Conventions findByRef(@PathVariable String ref) {
        return conventionService.findByRef(ref);
    }

    @GetMapping("/organisme/{organisme}")
    public Conventions findByOrganisme(@PathVariable String organisme) {
        return conventionService.findByOrganisme(organisme);
    }

    @GetMapping("/dateDebut/{dateDebut}")
    public List<Conventions> findByDateDebut(@PathVariable Date dateDebut) {
        return conventionService.findByDateDebut(dateDebut);
    }

    @GetMapping("/")
    public List<Conventions> findAll() {
        return conventionService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return conventionService.deleteByRef(ref);
    }

    @DeleteMapping("/organisme/{organisme}")
    public int deleteByOrganisme(@PathVariable String organisme) {
        return conventionService.deleteByOrganisme(organisme);
    }

    @DeleteMapping("/dateDebut/{dateDebut}")
    public int deleteByDateDebut(@PathVariable Date dateDebut) {
        return conventionService.deleteByDateDebut(dateDebut);
    }

    @PostMapping("/")
    public int save(@RequestBody Conventions conventions) {
        return conventionService.save(conventions);
    }
}
