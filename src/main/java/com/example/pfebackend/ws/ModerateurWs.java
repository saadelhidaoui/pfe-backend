package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Moderateur;
import com.example.pfebackend.service.ModerateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/moderateur")
public class ModerateurWs {
    @Autowired
    private ModerateurService moderateurService;

    @GetMapping("/ref/{ref}")
    public Moderateur findByRef(@PathVariable String ref) {
        return moderateurService.findByRef(ref);
    }

    @GetMapping("/cin/{cin}")
    public Moderateur findByCin(@PathVariable String cin) {
        return moderateurService.findByCin(cin);
    }

    @GetMapping("/qualite/{qualite}")
    public List<Moderateur> findByQualite(@PathVariable String qualite) {
        return moderateurService.findByQualite(qualite);
    }

    @GetMapping("/")
    public List<Moderateur> findAll() {
        return moderateurService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return moderateurService.deleteByRef(ref);
    }

    @DeleteMapping("/cin/{cin}")
    public int deleteByCin(@PathVariable String cin) {
        return moderateurService.deleteByCin(cin);
    }

    @PostMapping("/")
    public int save(Moderateur moderateur) {
        return moderateurService.save(moderateur);
    }
}
