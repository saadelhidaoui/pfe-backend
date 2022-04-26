package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Adherent;
import com.example.pfebackend.bean.Enfant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnfantDao extends JpaRepository<Enfant, Long> {

    Enfant findByRef(String ref);
    List<Enfant> findByAdherentCin(String cin);
    List<Enfant> findByAdherentPpr(String ppr);
    List<Enfant> findByAdherentNumAdhesion(String numAdhesion);
    List<Enfant> findAll();

    int deleteByRef(String ref);
    int deleteByAdherentCin(String cin);
    int deleteByAdherentPpr(String ppr);
    int deleteByAdherentNumAdhesion(String numAdhesion);

}
