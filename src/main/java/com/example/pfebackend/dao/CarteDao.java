package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Carte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarteDao extends JpaRepository<Carte, Long> {

    Carte findByAdherentCin(String cin);

    List<Carte> findAll();

}
