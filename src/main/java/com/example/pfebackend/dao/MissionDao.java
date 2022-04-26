package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Adherent;
import com.example.pfebackend.bean.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MissionDao extends JpaRepository<Mission, Long> {

    Mission findByRef(String ref);
    List<Mission> findByVille(String ref);
    List<Mission> findByDateDebut(String dateDebut);
    List<Mission> findAll();

    int deleteByRef(String ref);
    int deleteByDateDebut(Date dateDebut);
    int deleteByVille(String ville);

}
