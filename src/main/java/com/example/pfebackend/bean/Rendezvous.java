package com.example.pfebackend.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rendezvous {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id ;
    private String ref ;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateDebut ;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    private String description ;
    @Column(columnDefinition = "TEXT")
    private String pv;

    @ManyToOne
    private ProjetEnCours projetEnCours;

    @ManyToOne
    private Mission mission;

    public ProjetEnCours getProjetEnCours() {
        return projetEnCours;
    }

    public void setProjetEnCours(ProjetEnCours projetEnCours) {
        this.projetEnCours = projetEnCours;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

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

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDate(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
