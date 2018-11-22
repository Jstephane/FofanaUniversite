package fr.fofana.universite.enseignants.business;

import java.util.List;



import fr.fofana.universite.enseignants.domain.Enseignants;


public interface IEnseignantsBusisness {

	
	public List<Enseignants> getEnseignants ();

	public Enseignants getEnseignantById(Integer id);

	public Enseignants AjouterEnseignantFormulaire();



	public void SupprimerEnseignant(Integer id);

	

	void ModifierEnseignant(Enseignants Enseignants);

	public void saveEnseignants(Enseignants enseignants);

	void saveEnseignants(Integer id);




	
}
