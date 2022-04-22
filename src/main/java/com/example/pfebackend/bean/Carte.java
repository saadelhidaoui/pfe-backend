package com.example.pfebackend.bean;

import javax.persistence.*;
import javax.print.Doc;
import java.util.Date;

@Entity
public class Carte {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private Date dateDepart ;
    private Date dateArrivee ;
    private Boolean etat ;
    @OneToOne
    private Adherent adherent ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
}
