package fr.fofana.universite.etudiants.business;

import java.util.List;


import fr.fofana.universite.etudiants.domain.Etudiants;



public interface IEtudiantsBusiness {

	public List<Etudiants> getEtudiants();

	public Etudiants getEtudiantById(Integer id);

	public void SupprimerEtudiant(Integer id);

	public void SaveEtudiants(Etudiants etudiants);


	public void ModifierEtudiants(Etudiants Etudiants);

	public void AjouterEtudiantsFormulaire();

	Etudiants AjouterEtudiantsFormulaire(Etudiants etudiants);

}
