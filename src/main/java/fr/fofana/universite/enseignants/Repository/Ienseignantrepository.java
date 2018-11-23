package fr.fofana.universite.enseignants.Repository; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.fofana.universite.enseignants.domain.Enseignants;

@Repository
public interface IEnseignantRepository extends JpaRepository<Enseignants, Integer>  {

	void save(Integer id);

}
