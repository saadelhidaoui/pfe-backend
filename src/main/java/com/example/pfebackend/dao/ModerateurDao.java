package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Moderateur;
import com.example.pfebackend.bean.Moderateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModerateurDao extends JpaRepository<Moderateur, Long> {


    Moderateur findByNom(String nom);
    List<Moderateur> findAll();


}
