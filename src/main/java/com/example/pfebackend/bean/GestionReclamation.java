package com.example.pfebackend.bean;

import javax.persistence.*;

@Entity
public class GestionReclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;

    @ManyToOne
    private Moderateur moderateur;
    @ManyToOne
    private Reclamation reclamation;

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
}
