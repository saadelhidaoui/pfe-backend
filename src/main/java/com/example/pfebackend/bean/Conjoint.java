package com.example.pfebackend.bean;

import org.springframework.jmx.export.annotation.ManagedAttribute;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Conjoint extends Personne{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @ManyToOne
    private Adherent adherent ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }
}
