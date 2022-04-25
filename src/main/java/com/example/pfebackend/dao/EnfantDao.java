package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Adherent;
import com.example.pfebackend.bean.Enfant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnfantDao extends JpaRepository<Enfant, Long> {

    Enfant findByNom(String nom);
    List<Enfant> findAll();

}
