package com.geschool.modeles;
/***********************************************************************
 * Module:  Bulletin.java
 * Author:  Ndongoel
 * Purpose: Defines the Class Bulletin
 ***********************************************************************/

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Bulletin {
   @Id
   @GeneratedValue
   private Long id;
   private String annee;
   @Enumerated
   private Semestre semestre;
   private double moyenne;
   private int rang;

   @OneToMany
   public List<Cours> cours;

   public Bulletin() {
   }

   public Bulletin(String annee, Semestre semestre, double moyenne, int rang, List<Cours> cours) {
      this.annee = annee;
      this.semestre = semestre;
      this.moyenne = moyenne;
      this.rang = rang;
      this.cours = cours;
   }

   public String getAnnee() {
      return annee;
   }

   public void setAnnee(String annee) {
      this.annee = annee;
   }

   public Semestre getSemestre() {
      return semestre;
   }

   public void setSemestre(Semestre semestre) {
      this.semestre = semestre;
   }

   public double getMoyenne() {
      return moyenne;
   }

   public void setMoyenne(double moyenne) {
      this.moyenne = moyenne;
   }

   public int getRang() {
      return rang;
   }

   public void setRang(int rang) {
      this.rang = rang;
   }

   public List<Cours> getCours() {
      return cours;
   }

   public void setCours(List<Cours> cours) {
      this.cours = cours;
   }
}