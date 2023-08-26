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

import java.util.ArrayList;
import java.util.List;

@RestController
public class EtudiantController {

    @Autowired
private EtudiantRepository etudiantRepository;

    @GetMapping("/etudiants")
    List<Etudiant> afficherListeDesEtudiant() {
        Etudiant samba = new Etudiant("THIAM","Samba","77 324 12 34", Niveau.L3,"Informatique","Thies Stade Lat Dior",null,null);
        etudiantRepository.save(samba);
        return etudiantRepository.findAll();
    }
}
