package com.example.pfebackend.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ListePrincipale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
