/* Created by El Hadji M. NDONGO  */
/* on 26 08 2023 */
/* Project: geschool */

package com.geschool.modeles;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Personne {
    @Id
    @GeneratedValue
    private Long id;
    protected String nom;
    protected String prenom;
    protected String telephone;
}
