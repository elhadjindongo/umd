package com.geschool.modeles; /***********************************************************************
 * Module:  Paiement.java
 * Author:  Ndongoel
 * Purpose: Defines the Class Paiement
 ***********************************************************************/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.*;
@Entity
public class Paiement {
   @Id
   @GeneratedValue
   private Long id;
   private String mois;
   private int montant;
   private String date;

   public Paiement() {
   }

   public Paiement(String mois, int montant, String date) {
      this.mois = mois;
      this.montant = montant;
      this.date = date;
   }

   public String getMois() {
      return mois;
   }

   public void setMois(String mois) {
      this.mois = mois;
   }

   public int getMontant() {
      return montant;
   }

   public void setMontant(int montant) {
      this.montant = montant;
   }

   public String getDate() {
      return date;
   }

   public void setDate(String date) {
      this.date = date;
   }
}