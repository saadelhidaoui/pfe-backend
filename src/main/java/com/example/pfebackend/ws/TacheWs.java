package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Tache;
import com.example.pfebackend.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taches")
public class TacheWs {
    @Autowired
    private TacheService tacheService;

    @GetMapping("/ref/{ref}")
    public Tache findByRef(String ref) {
        return tacheService.findByRef(ref);
    }

    @GetMapping("/")
    public List<Tache> findAll() {
        return tacheService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return tacheService.deleteByRef(ref);
    }

    @PostMapping("/")
    public int save(@RequestBody Tache tache) {
        return tacheService.save(tache);
    }
}
