package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Carte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CarteDao extends JpaRepository<Carte, Long> {

    Carte findByRef(String ref);
    Carte findByAdherentPpr(String ppr);
    Carte findByAdherentNumAdhesion(String numAdhesion);
    Carte findByAdherentCin(String cin);
    List<Carte> findByDateArrivee(Date dateArrivee);
    List<Carte> findByDateDepart(Date dateDepart);
    List<Carte> findAll();

}
