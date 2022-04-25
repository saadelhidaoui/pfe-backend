package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Adherent;
import com.example.pfebackend.bean.Conjoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConjointDao extends JpaRepository<Conjoint, Long> {


    Conjoint findByNom(String nom);

    List<Conjoint> findAll();

}
