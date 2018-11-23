package fr.fofana.universite.enseignants.business;

import java.util.List;

import fr.fofana.universite.enseignants.domain.Enseignants;

public interface IEnseignantsBusisness {

	public List<Enseignants> getenseignants();

	public Enseignants getenseignantById(Integer id);

	public Enseignants ajouterenseignantFormulaire();

	public void supprimerenseignant(Integer id);

	public void modifierenseignant(Enseignants Enseignants);

	public void saveenseignants(Enseignants enseignants);

	public void savenseignants(Integer id);

	void saveenseignants(Integer id);

}
