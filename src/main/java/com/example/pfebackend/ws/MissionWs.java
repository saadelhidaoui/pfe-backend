package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Mission;
import com.example.pfebackend.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/mission")
public class MissionWs {
    @Autowired
    private MissionService missionService;

    @GetMapping("/ref/{ref}")
    public Mission findByRef(@PathVariable String ref) {
        return missionService.findByRef(ref);
    }

    @GetMapping("/ville/{ville}")
    public List<Mission> findByVille(@PathVariable String ville) {
        return missionService.findByVille(ville);
    }

    @GetMapping("/dateDebute/{dateDebut}")
    public List<Mission> findByDateDebut(@PathVariable String dateDebut) {
        return missionService.findByDateDebut(dateDebut);
    }

    @GetMapping("/")
    public List<Mission> findAll() {
        return missionService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return missionService.deleteByRef(ref);
    }

    @DeleteMapping("/dateDebut/{dateDebut}")
    public int deleteByDateDebut(Date dateDebut) {
        return missionService.deleteByDateDebut(dateDebut);
    }

    @DeleteMapping("/ville/{ville}")
    public int deleteByVille(String ville) {
        return missionService.deleteByVille(ville);
    }

    @PostMapping("/")
    public int save(Mission mission) {
        return missionService.save(mission);
    }
}
