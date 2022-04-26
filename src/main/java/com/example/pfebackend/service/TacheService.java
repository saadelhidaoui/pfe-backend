package com.example.pfebackend.service;

import com.example.pfebackend.bean.Tache;
import com.example.pfebackend.dao.TacheDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacheService {
    @Autowired
    private TacheDao tacheDao;

    public Tache findByRef(String ref) {
        return tacheDao.findByRef(ref);
    }

    public List<Tache> findAll() {
        return tacheDao.findAll();
    }

    public int deleteByRef(String ref) {
        return tacheDao.deleteByRef(ref);
    }

    public int save(Tache tache) {
        tacheDao.save(tache);
        return 1;
    }
}
