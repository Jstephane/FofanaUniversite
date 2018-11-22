package fr.fofana.universite.etudiants.controller;

import org.springframework.ui.Model;

import fr.fofana.universite.etudiants.domain.Etudiants;

public interface IEtudiantsController {

	String getEtudiants(Model model);

	String getEtudiantById(Model model, Integer id);

	String AjouterEtudiantsFormulaire(Model model, Integer id);

	String SupprimerEtudiant(Model model, Integer id);

	String ModifierEtudiant(Model model, Integer id);

	String AjouterEtudiant(Model model, Etudiants Etudiants);

	String modifierEtudiants(Model model, Etudiants Etudiants);

}
