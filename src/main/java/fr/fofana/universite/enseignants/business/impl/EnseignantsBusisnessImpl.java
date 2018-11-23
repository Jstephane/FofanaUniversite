package fr.fofana.universite.enseignants.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.fofana.universite.enseignants.Repository.IEnseignantRepository;
import fr.fofana.universite.enseignants.business.IEnseignantsBusisness;
import fr.fofana.universite.enseignants.domain.Enseignants;

@Service
public class EnseignantsBusisnessImpl implements IEnseignantsBusisness {

	@Autowired
	private IEnseignantRepository EnseignantRepository;

	@Override
	public List<Enseignants> getEnseignants() {

		List<Enseignants> ListeEnseignant = EnseignantRepository.findAll();

		return ListeEnseignant;
	}

	@Override
	public Enseignants AjouterEnseignantFormulaire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEnseignants(Enseignants Enseignant) {
		EnseignantRepository.save(Enseignant);

	}

	@Override
	public Enseignants getEnseignantById(Integer id) {

		Enseignants e = EnseignantRepository.getOne(id);

		return e;
	}

	@Override
	public void SupprimerEnseignant(Integer id) {
		EnseignantRepository.deleteById(id);

	}

	@Override

	public void ModifierEnseignant(Enseignants Enseignants) {

		EnseignantRepository.save(Enseignants);

	}

	@Override
	public void saveEnseignants(Integer id) {
		// TODO Auto-generated method stub

	}

}
