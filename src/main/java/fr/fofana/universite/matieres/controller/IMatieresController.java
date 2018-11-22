package fr.fofana.universite.matieres.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import fr.fofana.universite.matieres.domain.Matieres;

public interface IMatieresController {

	public String getMatieres(Model model);

	public String AjouterMatieres(Model model, Matieres Matieres, Integer id);

	public String AjouterMatieresFormulaire(Model model);

	public String ModifierMatieres(Model model, Integer id);

	public String SupprimerMatieres(Integer id);

	public String ModifierMatieres(Model model, Matieres Matieres);

	public String getMatiereById(Model model, Integer id);

	public String ModifierMatieres(Model model, @ModelAttribute Matieres Matieres, @RequestParam Integer IdEnseignant);

}
