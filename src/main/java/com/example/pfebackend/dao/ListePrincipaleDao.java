package com.example.pfebackend.dao;

import com.example.pfebackend.bean.ListePrincipale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListePrincipaleDao extends JpaRepository<ListePrincipale, Long> {

    List<ListePrincipale> findAll();

}
