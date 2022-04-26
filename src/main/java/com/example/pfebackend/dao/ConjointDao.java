package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Conjoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConjointDao extends JpaRepository<Conjoint, Long> {
    Conjoint findByCin(String cin);
    Conjoint findByNom(String nom);
    List<Conjoint> findByAdherentCin(String cin);
    List<Conjoint> findByAdherentPpr(String ppr);
    List<Conjoint> findByAdherentNumAdhesion(String numAdhesion);

    int deleteByAdherentCin(String cin);
    int deleteByCin(String cin);
    List<Conjoint> findAll();

}
