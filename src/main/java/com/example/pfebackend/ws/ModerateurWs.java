package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Moderateur;
import com.example.pfebackend.service.ModerateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/moderateur")
public class ModerateurWs {
    @Autowired
    private ModerateurService moderateurService;

    public Moderateur findByRef(String ref) {
        return moderateurService.findByRef(ref);
    }

    public Moderateur findByCin(String cin) {
        return moderateurService.findByCin(cin);
    }

    public List<Moderateur> findByQualite(String qualite) {
        return moderateurService.findByQualite(qualite);
    }

    public List<Moderateur> findAll() {
        return moderateurService.findAll();
    }

    public int deleteByRef(String ref) {
        return moderateurService.deleteByRef(ref);
    }

    public int deleteByCin(String cin) {
        return moderateurService.deleteByCin(cin);
    }

    public int save(Moderateur moderateur) {
        return moderateurService.save(moderateur);
    }
}
