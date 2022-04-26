package com.example.pfebackend.service;

import com.example.pfebackend.bean.Reclamation;
import com.example.pfebackend.dao.ReclamationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReclamationService {
    @Autowired
    private ReclamationDao reclamationDao;
    @Autowired
    private AdherentService adherentService;

    public Reclamation findByRef(String ref) {
        return reclamationDao.findByRef(ref);
    }

    public List<Reclamation> findByAdherentCin(String cin) {
        return reclamationDao.findByAdherentCin(cin);
    }

    public List<Reclamation> findByAdherentPpr(String ppr) {
        return reclamationDao.findByAdherentPpr(ppr);
    }

    public List<Reclamation> findByAdherentNumAdhesion(String numAdhesion) {
        return reclamationDao.findByAdherentNumAdhesion(numAdhesion);
    }

    public List<Reclamation> findAll() {
        return reclamationDao.findAll();
    }

    public int deleteByRef(String ref) {
        return reclamationDao.deleteByRef(ref);
    }

    public int deleteByAdherentCin(String cin) {
        return reclamationDao.deleteByAdherentCin(cin);
    }

    public int deleteByAdherentPpr(String ppr) {
        return reclamationDao.deleteByAdherentPpr(ppr);
    }

    public int deleteByAdherentNumAdhesion(String numAdhesion) {
        return reclamationDao.deleteByAdherentNumAdhesion(numAdhesion);
    }

    public int save(Reclamation reclamation) {
        reclamationDao.save(reclamation);
        return 1;
    }
}
