package fr.fofana.universite.matieres.controller;

import org.springframework.ui.Model;

import fr.fofana.universite.matieres.domain.Matieres;

public interface IMatieresController {

	String getMatieres(Model model);

	String AjouterMatieres(Model model, Matieres Matieres, Integer id);

	String AjouterMatieresFormulaire(Model model);

	String ModifierMatieres(Model model, Integer id);

	String SupprimerMatieres(Integer id);

	String ModifierMatieres(Model model, Matieres Matieres);

	String getMatiereById(Model model, Integer id);

}
