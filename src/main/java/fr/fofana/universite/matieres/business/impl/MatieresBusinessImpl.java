package fr.fofana.universite.matieres.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import fr.fofana.universite.enseignants.business.IEnseignantsBusisness;
import fr.fofana.universite.enseignants.domain.Enseignants;
import fr.fofana.universite.matieres.Repository.IMatieresRepository;
import fr.fofana.universite.matieres.business.IMatieresBusiness;
import fr.fofana.universite.matieres.domain.Matieres;

@Service
public class MatieresBusinessImpl implements IMatieresBusiness {

	@Autowired
	private IMatieresRepository MatieresRepository;

	@Autowired
	private IEnseignantsBusisness enseignantBusiness;

	@Override
	public List<Matieres> getMatieres() {

		List<Matieres> ListeMatieres = MatieresRepository.findAll();

		return ListeMatieres;

	}

	@Override
	public Matieres AjouterMatieresFormulaire(Matieres Matieres) {

		return MatieresRepository.save(Matieres);
	}

	@Override
	public void SaveMatieres(Matieres Matieres) {
		MatieresRepository.save(Matieres);

		System.out.println("La matière est enegistrée!!");
	}

	@Override
	public Matieres getMatiereById(Integer id) {

		Matieres m = MatieresRepository.getOne(id);

		return m;
	}

	@Override
	public void SupprimerMatiere(Integer id) {
		MatieresRepository.deleteById(id);

		System.out.println("La Matière est supprimée !!");
	}

	@Override
	public void ModifierMatiere(Matieres Matieres) {

		MatieresRepository.save(Matieres);

		System.out.println("La Matière est modifiée!!");

	}

	@Override
	public void ModifierMatieres(Matieres Matieres) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Enseignants> getEnseignant() {

		List<Enseignants> enseignant = enseignantBusiness.getenseignants();
		return enseignant;
	}

	@Override
	public Enseignants getEnseignantById(Integer idEnseignant) {
		Enseignants enseignant = enseignantBusiness.getenseignantById(idEnseignant);
		return enseignant;
	}

	@Override
	public String ModifierMatieres(Model model, Matieres Matieres, Integer IdEnseignant) {
		// TODO Auto-generated method stub
		return null;
	}

}
