package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Tache;
import com.example.pfebackend.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/taches")
public class TacheWs {
    @Autowired
    private TacheService tacheService;

    public Tache findByRef(String ref) {
        return tacheService.findByRef(ref);
    }

    public List<Tache> findAll() {
        return tacheService.findAll();
    }

    public int deleteByRef(String ref) {
        return tacheService.deleteByRef(ref);
    }

    public int save(Tache tache) {
        return tacheService.save(tache);
    }
}
