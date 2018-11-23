package fr.fofana.universite.enseignants.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.fofana.universite.enseignants.Repository.IEnseignantRepository;
import fr.fofana.universite.enseignants.business.IEnseignantsBusisness;
import fr.fofana.universite.enseignants.domain.Enseignants;

@Service
public class enseignantsbusisnessImpl implements IEnseignantsBusisness {

	@Autowired
	private IEnseignantRepository EnseignantRepository;

	@Override
	public List<Enseignants> getenseignants() {

		List<Enseignants> ListeEnseignant = EnseignantRepository.findAll();

		return ListeEnseignant;
	}

	@Override
	public Enseignants ajouterenseignantFormulaire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveenseignants(Enseignants Enseignant) {
		EnseignantRepository.save(Enseignant);

	}

	@Override
	public Enseignants getenseignantById(Integer id) {

		Enseignants e = EnseignantRepository.getOne(id);

		return e;
	}

	@Override
	public void supprimerenseignant(Integer id) {
		EnseignantRepository.deleteById(id);

	}

	@Override

	public void modifierenseignant(Enseignants Enseignants) {

		EnseignantRepository.save(Enseignants);

	}

	@Override
	public void saveenseignants(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void savenseignants(Integer id) {
		// TODO Auto-generated method stub

	}

}