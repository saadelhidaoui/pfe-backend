package com.example.pfebackend.bean;

import javax.persistence.*;

@Entity
public class PieceJointDossier {
@Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String libelle ;
    private String path ;
    private String typePiece ;
    @OneToOne
    private Dossier dossier ;

    public Dossier getDossier() {
        return dossier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTypePiece() {
        return typePiece;
    }

    public void setTypePiece(String typePiece) {
        this.typePiece = typePiece;
    }
}
