package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdherentDao extends JpaRepository<Adherent, Long> {

    Adherent findByCin(String cin);
    Adherent findByPpr(String ppr);
    Adherent findByNom(String nom);
    Adherent findByNumAdhesion(String numAdhesion);
    List<Adherent> findAll();

    int deleteByCin(String cin);
    int deleteByPpr(String ppr);
    int deleteByNumAdhesion(String numAdhesion);
}
