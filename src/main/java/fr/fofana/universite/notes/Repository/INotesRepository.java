package fr.fofana.universite.notes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.fofana.universite.notes.domain.Notes;
import fr.fofana.universite.notes.domain.NotesPK;

@Repository
public interface INotesRepository extends JpaRepository<Notes, NotesPK> {

}
