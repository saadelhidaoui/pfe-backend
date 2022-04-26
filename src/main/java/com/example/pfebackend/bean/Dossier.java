package com.example.pfebackend.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Dossier  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String reference ;
    private double numArrivee ;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateArrivee ;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateEnvoi ;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateReception;
    private String Notes ;
    private Boolean recu ;
    private Boolean envoye ;
    private String chargeCas ;
    private String niveauImport ;
    private String typeDossier ;
    private String etat ;
    private String arrive ;
    private String resultat ;
    @ManyToOne
    private Adherent adherent ;
    @ManyToOne
    private Moderateur moderateur;

    public Moderateur getModerateur() {
        return moderateur;
    }

    public void setModerateur(Moderateur moderateur) {
        this.moderateur = moderateur;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public double getNumArrivee() {
        return numArrivee;
    }

    public void setNumArrivee(double numArrivee) {
        this.numArrivee = numArrivee;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Date getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public Boolean getRecu() {
        return recu;
    }

    public void setRecu(Boolean recu) {
        this.recu = recu;
    }

    public Boolean getEnvoye() {
        return envoye;
    }

    public void setEnvoye(Boolean envoye) {
        this.envoye = envoye;
    }

    public String getChargeCas() {
        return chargeCas;
    }

    public void setChargeCas(String chargeCas) {
        this.chargeCas = chargeCas;
    }

    public String getNiveauImport() {
        return niveauImport;
    }

    public void setNiveauImport(String niveauImport) {
        this.niveauImport = niveauImport;
    }

    public String getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }
}
