package com.example.pfebackend.bean;

import javax.persistence.*;

@Entity
public class Reclamation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String ref ;
    @Column(columnDefinition = "TEXT")
    private String description ;

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

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
