package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Adherent;
import com.example.pfebackend.bean.Conjoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConjointDao extends JpaRepository<Conjoint, Long> {
    Conjoint findByCin(String cin);
    Conjoint findByNom(String nom);
    List<Conjoint> findByAdherentCin(String cin);

    int deleteByAdherentCin(String cin);
    List<Conjoint> findAll();

}
