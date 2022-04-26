package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Produit;
import com.example.pfebackend.bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {
    Produit findByRef(String ref);
    List<Produit> findByDateArrivee(Date dateArrivee);
    List<Produit> findAll();

    int deleteByRef(String ref);
}
