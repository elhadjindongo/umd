package com.geschool.modeles; /***********************************************************************
 * Module:  Professeur.java
 * Author:  Ndongoel
 * Purpose: Defines the Class Professeur
 ***********************************************************************/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.*;

@Entity
public class Professeur extends Personne {
   @Id
   @GeneratedValue
   private Long id;
   private String specialite;

//   @OneToMany
//   public List<Cours> cours;

   public Professeur() {
   }

   public Professeur(String nom, String prenom,String telephone, String specialite, List<Cours> cours) {
      this.nom = nom;
      this.prenom = prenom;
      this.specialite = specialite;
//      this.cours = cours;
      this.telephone = telephone;
   }




   public String getSpecialite() {
      return specialite;
   }

   public void setSpecialite(String specialite) {
      this.specialite = specialite;
   }

//   public List<Cours> getCours() {
//      return cours;
//   }
//
//   public void setCours(List<Cours> cours) {
//      this.cours = cours;
//   }
}