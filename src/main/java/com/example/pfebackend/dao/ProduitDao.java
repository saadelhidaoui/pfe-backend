package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Produit;
import com.example.pfebackend.bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {


    List<Produit> findAll();

}
