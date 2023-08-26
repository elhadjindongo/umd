/* Created by El Hadji M. NDONGO  */
/* on 26 08 2023 */
/* Project: geschool */

package com.geschool.controlleurs;

import com.geschool.modeles.Etudiant;
import com.geschool.modeles.Niveau;
import com.geschool.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonneController {

    @Autowired
private EtudiantRepository etudiantRepository;

    @GetMapping("/personnes")
    List<Etudiant> afficherListeDesPersone() {
        return etudiantRepository.findAll();
    }
}
