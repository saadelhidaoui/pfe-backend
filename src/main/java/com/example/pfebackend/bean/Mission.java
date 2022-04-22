package com.example.pfebackend.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Mission {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private Date dateDebut;
    private Date DateFin;
    private String ville;
    @Column(columnDefinition = "TEXT")
    private String pv;



}
