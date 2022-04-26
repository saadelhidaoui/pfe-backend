package com.example.pfebackend.service;

import com.example.pfebackend.bean.Conventions;
import com.example.pfebackend.dao.ConventionsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ConventionService {
    @Autowired
    private ConventionsDao conventionsDao;

    public Conventions findByRef(String ref) {
        return conventionsDao.findByRef(ref);
    }

    public Conventions findByOrganisme(String organisme) {
        return conventionsDao.findByOrganisme(organisme);
    }

    public List<Conventions> findByDateDebut(Date dateDebut) {
        return conventionsDao.findByDateDebut(dateDebut);
    }

    public List<Conventions> findAll() {
        return conventionsDao.findAll();
    }

    public int deleteByRef(String ref) {
        return conventionsDao.deleteByRef(ref);
    }

    public int deleteByOrganisme(String organisme) {
        return conventionsDao.deleteByOrganisme(organisme);
    }

    public int deleteByDateDebut(Date dateDebut) {
        return conventionsDao.deleteByDateDebut(dateDebut);
    }

    public int save(Conventions conventions) {
        conventionsDao.save(conventions);
        return 1;
    }
}
