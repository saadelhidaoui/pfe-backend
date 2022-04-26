package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReclamationDao extends JpaRepository<Reclamation, Long> {

    Reclamation findByRef(String ref);
    List<Reclamation> findByAdherentCin(String cin);
    List<Reclamation> findByAdherentPpr(String ppr);
    List<Reclamation> findByAdherentNumAdhesion(String numAdhesion);
    List<Reclamation> findAll();

    int deleteByRef(String ref);
    int deleteByAdherentCin(String cin);
    int deleteByAdherentPpr(String ppr);
    int deleteByAdherentNumAdhesion(String numAdhesion);

}
