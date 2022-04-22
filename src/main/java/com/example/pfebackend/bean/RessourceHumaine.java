package com.example.pfebackend.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class RessourceHumaine extends Personne{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private Date dateRecrutement ;
    private String Poste ;
    private String diplomes ;
    private String formationsContinues ;
    private String situationMaritale ;
    private String ordreDeMission ;
    private double jourConges ;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateRecrutement() {
        return dateRecrutement;
    }

    public void setDateRecrutement(Date dateRecrutement) {
        this.dateRecrutement = dateRecrutement;
    }

    public String getPoste() {
        return Poste;
    }

    public void setPoste(String poste) {
        Poste = poste;
    }

    public String getDiplomes() {
        return diplomes;
    }

    public void setDiplomes(String diplomes) {
        this.diplomes = diplomes;
    }

    public String getFormationsContinues() {
        return formationsContinues;
    }

    public void setFormationsContinues(String formationsContinues) {
        this.formationsContinues = formationsContinues;
    }

    public String getSituationMaritale() {
        return situationMaritale;
    }

    public void setSituationMaritale(String situationMaritale) {
        this.situationMaritale = situationMaritale;
    }

    public String getOrdreDeMission() {
        return ordreDeMission;
    }

    public void setOrdreDeMission(String ordreDeMission) {
        this.ordreDeMission = ordreDeMission;
    }

    public double getJourConges() {
        return jourConges;
    }

    public void setJourConges(double jourConges) {
        this.jourConges = jourConges;
    }
}
