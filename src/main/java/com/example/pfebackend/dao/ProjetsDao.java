package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Projets;
import com.example.pfebackend.bean.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProjetsDao extends JpaRepository<Projets, Long> {

    Projets findByRef(String ref);
    List<Projets> findByDateDebut(Date dateDebut);
    List<Projets> findByVille(String ville);
    List<Projets> findAll();

    int deleteByRef(String ref);

}
