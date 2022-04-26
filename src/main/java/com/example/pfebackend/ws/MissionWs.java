package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Mission;
import com.example.pfebackend.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/mission")
public class MissionWs {
    @Autowired
    private MissionService missionService;

    public Mission findByRef(String ref) {
        return missionService.findByRef(ref);
    }

    public List<Mission> findByVille(String ref) {
        return missionService.findByVille(ref);
    }

    public List<Mission> findByDateDebut(String dateDebut) {
        return missionService.findByDateDebut(dateDebut);
    }

    public List<Mission> findAll() {
        return missionService.findAll();
    }

    public int deleteByRef(String ref) {
        return missionService.deleteByRef(ref);
    }

    public int deleteByDateDebut(Date dateDebut) {
        return missionService.deleteByDateDebut(dateDebut);
    }

    public int deleteByVille(String ville) {
        return missionService.deleteByVille(ville);
    }

    public int save(Mission mission) {
        return missionService.save(mission);
    }
}
