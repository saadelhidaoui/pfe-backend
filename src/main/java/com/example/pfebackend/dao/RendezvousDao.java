package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Rendezvous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface RendezvousDao extends JpaRepository<Rendezvous, Long> {

    Rendezvous findByRef(String ref);
    List<Rendezvous> findByDateDebut(Date dateDebut);
    List<Rendezvous> findAll();

    int deleteByRef(String ref);

}
