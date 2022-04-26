package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Moderateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModerateurDao extends JpaRepository<Moderateur, Long> {


    Moderateur  findByRef(String ref);
    Moderateur findByCin(String cin);
    List<Moderateur> findByQualite(String qualite);
    List<Moderateur> findAll();

    int deleteByRef(String ref);
    int deleteByCin(String cin);


}
