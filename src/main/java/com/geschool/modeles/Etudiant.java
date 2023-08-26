package com.geschool.modeles;

import jakarta.persistence.*;

import java.util.List;

/***********************************************************************
 * Module:  Etudiant.java
 * Author:  Ndongoel
 * Purpose: Defines the Class Etudiant
 ***********************************************************************/

@Entity
public class Etudiant extends Personne {
    @Id
    @GeneratedValue
    private Long id;
    @Enumerated
    private Niveau niveau;
    private String filliere;
    private String adresse;
    @OneToMany
    public List<Bulletin> bulletin;
    @OneToMany
    public List<Paiement> paiement;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, String telephone, Niveau niveau, String filliere, String adresse, List<Bulletin> bulletin, List<Paiement> paiement) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.niveau = niveau;
        this.filliere = filliere;
        this.adresse = adresse;
        this.bulletin = bulletin;
        this.paiement = paiement;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", niveau=" + niveau +
                ", filliere='" + filliere + '\'' +
                ", adresse='" + adresse + '\'' +
                ", bulletin=" + bulletin +
                ", paiement=" + paiement +
                '}';
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public String getFilliere() {
        return filliere;
    }

    public void setFilliere(String filliere) {
        this.filliere = filliere;
    }


    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Bulletin> getBulletin() {
        return bulletin;
    }

    public void setBulletin(List<Bulletin> bulletin) {
        this.bulletin = bulletin;
    }

    public List<Paiement> getPaiement() {
        return paiement;
    }

    public void setPaiement(List<Paiement> paiement) {
        this.paiement = paiement;
    }
}