package fr.fofana.universite.matieres.business;

import java.util.List;

import fr.fofana.universite.enseignants.domain.Enseignants;
import fr.fofana.universite.matieres.domain.Matieres;

public interface IMatieresBusiness {

	public List<Matieres> getMatieres();

	public void SaveMatieres(Matieres matieres);

	public Matieres AjouterMatieresFormulaire(Matieres Matieres);

	public void ModifierMatiere(Matieres Matieres);

	public void SupprimerMatiere(Integer id);

	public Matieres getMatiereById(Integer id);

	public void ModifierMatieres(Matieres Matieres);

	public List<Enseignants> getEnseignant();

	public Enseignants getEnseignantById(Integer idEnseignant);

}
