package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Estivage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstivageDao extends JpaRepository<Estivage, Long> {

    Estivage findByRef(String ref);
    List<Estivage> findByAdherentPpr(String ppr);
    List<Estivage> findByAdherentNumAdhesion(String numAdhesion);
    List<Estivage> findByAdherentCin(String cin);
    List<Estivage> findByRegion(String region);
    List<Estivage> findByVille(String ville);
    List<Estivage> findByDateReception(String dateReception);
    List<Estivage> findByDateEnvoi(String dateEnvoi);
    List<Estivage> findByDateArrivee(String dateArrivee);
    List<Estivage> findByNumArrivee(String numArrivee);

    List<Estivage> findAll();
    int deleteByRef(String ref);
    int deleteByNumArrivee(String numArrivee);
    int deleteByAdherentNumAdhesion(String numAdhesion);
    int deleteByAdherentPpr(String ppr);
    int deleteByAdherentCin(String cin);


}
