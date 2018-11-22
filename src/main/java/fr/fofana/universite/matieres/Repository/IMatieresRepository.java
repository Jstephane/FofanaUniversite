package fr.fofana.universite.matieres.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.fofana.universite.matieres.domain.Matieres;


@Repository
public interface IMatieresRepository extends JpaRepository<Matieres , Integer> {

}
