package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Adherent;
import com.example.pfebackend.bean.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TacheDao extends JpaRepository<Tache, Long> {

    Tache findByRef(String ref);
    List<Tache> findAll();

    int deleteByRef(String ref);

}
