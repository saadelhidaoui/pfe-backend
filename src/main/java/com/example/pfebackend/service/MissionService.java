package com.example.pfebackend.service;

import com.example.pfebackend.bean.Mission;
import com.example.pfebackend.dao.MissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MissionService {
    @Autowired
    private MissionDao missionDao;

    public Mission findByRef(String ref) {
        return missionDao.findByRef(ref);
    }

    public List<Mission> findByVille(String ville) {
        return missionDao.findByVille(ville);
    }

    public List<Mission> findByDateDebut(String dateDebut) {
        return missionDao.findByDateDebut(dateDebut);
    }

    public List<Mission> findAll() {
        return missionDao.findAll();
    }

    public int deleteByRef(String ref) {
        return missionDao.deleteByRef(ref);
    }

    public int deleteByDateDebut(Date dateDebut) {
        return missionDao.deleteByDateDebut(dateDebut);
    }

    public int deleteByVille(String ville) {
        return missionDao.deleteByVille(ville);
    }

    public int save(Mission mission) {
        missionDao.save(mission);
        return 1;
    }
}
