package com.example.pfebackend.bean;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Adherent extends Personne{

    private Long id ;
    private String adresse ;
    private String ppr ;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance ;
    private String pprr ;
    private String cinConjoint ;
    private Long numAdhesion ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPpr() {
        return ppr;
    }

    public void setPpr(String ppr) {
        this.ppr = ppr;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getPprr() {
        return pprr;
    }

    public void setPprr(String pprr) {
        this.pprr = pprr;
    }

    public String getCinConjoint() {
        return cinConjoint;
    }

    public void setCinConjoint(String cinConjoint) {
        this.cinConjoint = cinConjoint;
    }

    public Long getNumAdhesion() {
        return numAdhesion;
    }

    public void setNumAdhesion(Long numAdhesion) {
        this.numAdhesion = numAdhesion;
    }
}
