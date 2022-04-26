package com.example.pfebackend.service;

import com.example.pfebackend.bean.Moderateur;
import com.example.pfebackend.dao.ModerateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModerateurService {
    @Autowired
    private ModerateurDao moderateurDao;

    public Moderateur findByRef(String ref) {
        return moderateurDao.findByRef(ref);
    }

    public Moderateur findByCin(String cin) {
        return moderateurDao.findByCin(cin);
    }

    public List<Moderateur> findByQualite(String qualite) {
        return moderateurDao.findByQualite(qualite);
    }

    public List<Moderateur> findAll() {
        return moderateurDao.findAll();
    }

    public int deleteByRef(String ref) {
        return moderateurDao.deleteByRef(ref);
    }

    public int deleteByCin(String cin) {
        return moderateurDao.deleteByCin(cin);
    }

    public int save(Moderateur moderateur) {
        moderateurDao.save(moderateur);
        return 1;
    }
}
