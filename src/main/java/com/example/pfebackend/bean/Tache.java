package com.example.pfebackend.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Tache {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String ref ;
    private Date date ;
    @Column(columnDefinition = "TEXT")
    private String description ;
    private String etat ;
    private String nom ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
