package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Conventions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ConventionsDao extends JpaRepository<Conventions, Long> {

    Conventions findByRef(String ref);
    Conventions findByOrganisme(String organisme);
    List<Conventions> findByDateDebut(Date dateDebut);
    List<Conventions> findAll();

    int deleteByRef(String ref);
    int deleteByOrganisme(String organisme);
    int deleteByDateDebut(Date dateDebut);

}
