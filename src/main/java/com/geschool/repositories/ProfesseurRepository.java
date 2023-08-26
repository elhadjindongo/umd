/* Created by El Hadji M. NDONGO  */
/* on 26 08 2023 */
/* Project: geschool */

package com.geschool.repositories;

import com.geschool.modeles.Personne;
import com.geschool.modeles.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesseurRepository extends JpaRepository<Professeur,Long> {
}
