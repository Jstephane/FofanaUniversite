package fr.fofana.universite.enseignants.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import fr.fofana.universite.enseignants.domain.Enseignants;

public interface IEnseignantsController {

	public String getenseignants(Model model);

	public String getenseignantById(Model model, Integer id);

	public String ajouterenseignantFormulaire(Model model, Integer id);

	public String ejouterenseignant(Model model, Enseignants Enseignants);

	public String supprimerenseignant(Model model, Integer id);

	public String modifierenseignant(Model model, Integer id);

	public String modifierensenseignant(Model model, @ModelAttribute Enseignants Enseignants);

	String ajouterenseignantformulaire(Model model, Integer id);

	String ajouterenseignant(Model model, Enseignants Enseignants);

}
