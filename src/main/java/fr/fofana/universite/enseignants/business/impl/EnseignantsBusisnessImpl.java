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
	private IEnseignantRepository EnseignantRepository ;

	
	
	@Override
	public List<Enseignants> getEnseignants() {
		
		List<Enseignants> ListeEnseignant =  EnseignantRepository.findAll() ;
		
		return ListeEnseignant;
		
//		
//		List<Enseignants> ListeEnseignant = new ArrayList<>();
//		Enseignants E1 = new Enseignants( 1 ,"10","Bertrand","Pierre","1955-11-13","M","ASS","2009-06-01");
//		Enseignants E2 = new Enseignants( 5 ,"14","Vincent","Paul","1975-02-19","M","PR","2006-11-13");
//		Enseignants E3 = new Enseignants( 9 ,"18","Knightley","Keira","1978-06-12","F","ASS","2002-05-02");
//		Enseignants E4 = new Enseignants( 14 ,"69652","Walters","Walters","1969-01-17","M","MCF","2006-09-18");
//		Enseignants E5 = new Enseignants( 19 ,"92596","Ursa","Perez","1978-03-26","F","PR","2009-06-01");
//
//
//		ListeEnseignant.add(E1);
//		ListeEnseignant.add(E2);
//		ListeEnseignant.add(E3);
//		ListeEnseignant.add(E4);
//		ListeEnseignant.add(E5);
//
//		return ListeEnseignant;
	}

//	@Override
//	public Enseignants getEnseignantById(Integer id) {	
//		
//		List<Enseignants> Liste = getEnseignants();
//		Enseignants e1 = null;
//		for (int i = 0; i < Liste.size(); i++) {
//			Enseignants enseignant = Liste.get(i);
//			if(enseignant.getId() == id) {
//				e1 = enseignant;
//			}
//		}
//		
//		return e1;
//
//	}

	@Override
	public Enseignants AjouterEnseignantFormulaire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEnseignants(Enseignants Enseignant) {
		EnseignantRepository.save(Enseignant);
		
		System.out.println("L'Enseignant est enegistré!!");
	}

	@Override
	public Enseignants getEnseignantById(Integer id) {
	    
		Enseignants e = EnseignantRepository.getOne(id);
		
		return e;
	}

	@Override
	public void SupprimerEnseignant(Integer id) {
		EnseignantRepository.deleteById(id);
		
		System.out.println("L'Enseignant est supprimé !!");
	}
	
	@Override
	
	public void ModifierEnseignant (Enseignants Enseignants ) {
	
		EnseignantRepository.save(Enseignants);
		
		
		System.out.println("L'Enseignant est modifié!!");
		
		
}

	@Override
	public void saveEnseignants(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
}





