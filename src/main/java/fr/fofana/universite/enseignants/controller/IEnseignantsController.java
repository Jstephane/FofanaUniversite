package fr.fofana.universite.enseignants.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import fr.fofana.universite.enseignants.domain.Enseignants;

public interface IEnseignantsController {

	public String getEnseignants(Model model);

	public String getEnseignantById(Model model, Integer id);

	public String AjouterEnseignantFormulaire(Model model, Integer id);

	public String AjouterEnseignant(Model model, Enseignants Enseignants);

	public String SupprimerEnseignant(Model model, Integer id);

	public String ModifierEnseignant(Model model, Integer id);

	public String modifierEnsEnseignant(Model model, @ModelAttribute Enseignants Enseignants);

}
