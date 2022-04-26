package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Dossier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DossierDao extends JpaRepository<Dossier, Long> {

    Dossier findByReference(String reference);
    Dossier findByAdherentNumAdhesion(String numAdhesion);
    Dossier findByAdherentPpr(String ppr);
    Dossier findByAdherentCin(String cin);
    List<Dossier> findByDateArrivee(Date dateArrivee);
    List<Dossier> findByDateEnvoi(Date dateEnvoi);
    List<Dossier> findByDateReception(Date dateReception);
    List<Dossier> findByNiveauImport(String niveauImport);
    List<Dossier> findByTypeDossier(String typeDossier);

    List<Dossier> findAll();

    int deleteByReference(String reference);
    int deleteByAdherentCin(String cin);
    int deleteByAdherentPpr(String ppr);
    int deleteByAdherentNumAdhesion(String numAdhesion);

}
