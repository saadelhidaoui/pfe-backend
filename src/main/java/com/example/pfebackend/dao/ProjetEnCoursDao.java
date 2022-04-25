package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Reclamation;
import com.example.pfebackend.bean.ProjetEnCours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetEnCoursDao extends JpaRepository<ProjetEnCours, Long> {

    List<ProjetEnCours> findAll();


}
