package com.geschool.modeles; /***********************************************************************
 * Module:  Cours.java
 * Author:  Ndongoel
 * Purpose: Defines the Class Cours
 ***********************************************************************/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.*;

@Entity
public class Cours {
   @Id
   @GeneratedValue
   private Long id;
   private String module;
   private int nombreHeure;
   private String intitule;

   public Cours() {
   }

   public Cours(String module, int nombreHeure, String intitule) {
      this.module = module;
      this.nombreHeure = nombreHeure;
      this.intitule = intitule;
   }

   public String getModule() {
      return module;
   }

   public void setModule(String module) {
      this.module = module;
   }

   public int getNombreHeure() {
      return nombreHeure;
   }

   public void setNombreHeure(int nombreHeure) {
      this.nombreHeure = nombreHeure;
   }

   public String getIntitule() {
      return intitule;
   }

   public void setIntitule(String intitule) {
      this.intitule = intitule;
   }
}