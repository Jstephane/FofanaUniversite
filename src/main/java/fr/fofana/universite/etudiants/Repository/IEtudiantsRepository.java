package fr.fofana.universite.etudiants.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.fofana.universite.etudiants.domain.Etudiants;



@Repository
public interface IEtudiantsRepository extends JpaRepository<Etudiants, Integer>  {


 
}