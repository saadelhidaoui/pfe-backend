package com.example.pfebackend.service;

import com.example.pfebackend.bean.Rendezvous;
import com.example.pfebackend.dao.RendezvousDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RendezVousService {
    @Autowired
    private RendezvousDao rendezvousDao;

    public Rendezvous findByRef(String ref) {
        return rendezvousDao.findByRef(ref);
    }

    public List<Rendezvous> findByDateDebut(Date dateDebut) {
        return rendezvousDao.findByDateDebut(dateDebut);
    }

    public List<Rendezvous> findAll() {
        return rendezvousDao.findAll();
    }

    public int deleteByRef(String ref) {
        return rendezvousDao.deleteByRef(ref);
    }

    public int save(Rendezvous rendezvous) {
        rendezvousDao.save(rendezvous);
        return 1;
    }
}
