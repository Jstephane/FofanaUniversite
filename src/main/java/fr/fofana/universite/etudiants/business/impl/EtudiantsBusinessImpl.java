package fr.fofana.universite.etudiants.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fr.fofana.universite.etudiants.Repository.IEtudiantsRepository;
import fr.fofana.universite.etudiants.business.IEtudiantsBusiness;
import fr.fofana.universite.etudiants.domain.Etudiants;

@Service
public class EtudiantsBusinessImpl implements IEtudiantsBusiness{
	
@Autowired
private IEtudiantsRepository EtudiantsRepository;


@Override
public List<Etudiants> getEtudiants() {
	
	List<Etudiants> ListeEtudiants =  EtudiantsRepository.findAll() ;
	
	return ListeEtudiants;

}


@Override
public Etudiants AjouterEtudiantsFormulaire(Etudiants Etudiants ) {
	
	
	
	return EtudiantsRepository.save(Etudiants); 
}

@Override
public void SaveEtudiants(Etudiants Etudiants) {
	EtudiantsRepository.save(Etudiants);
	
	System.out.println("L'Etudiant est enegistré!!");
}

@Override
public Etudiants getEtudiantById(Integer id) {
    
	Etudiants e = EtudiantsRepository.getOne(id);
	
	return e;
}

@Override
public void SupprimerEtudiant(Integer id) {
	EtudiantsRepository.deleteById(id);
	
	System.out.println("L'Etudiant est supprimé !!");
}


@Override
public void ModifierEtudiants (Etudiants Etudiants ) {

	EtudiantsRepository.save(Etudiants);
	
	
	System.out.println("L'Etudiant est modifié!!");
	
	
}



@Override
public void AjouterEtudiantsFormulaire() {
	// TODO Auto-generated method stub
	
}


}
