/* Created by El Hadji M. NDONGO  */
/* on 26 08 2023 */
/* Project: geschool */

package com.geschool.controlleurs;

import com.geschool.modeles.Cours;
import com.geschool.modeles.Etudiant;
import com.geschool.repositories.CoursRepository;
import com.geschool.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursController {

    @Autowired
    private CoursRepository coursRepository;

    @GetMapping("/cours")
    List<Cours> afficherListeDesCours() {
        return coursRepository.findAll();
    }

    @PostMapping("/cours")
    Cours ajouterCours(@RequestBody Cours cours) {
        return coursRepository.save(cours);
    }

}
