package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Adherent;
import com.example.pfebackend.bean.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactDao extends JpaRepository<Contact, Long> {

    Contact findByReference(String reference);
    Contact findByNom(String nom);
    List<Contact> findByVille(String ville);
    List<Contact> findByByQualite(String qualite);

    int deleteByReference(String reference);
    List<Contact> findAll();

}
