package fr.fofana.universite.notes.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.fofana.universite.notes.Repository.INotesRepository;
import fr.fofana.universite.notes.business.INotesBusiness;
import fr.fofana.universite.notes.domain.Notes;

@Service
public class NotesBusinessImpl implements INotesBusiness {

	@Autowired
	private INotesRepository iNoteRepository;

	@Override
	public List<Notes> getNotes() {
		List<Notes> liste = iNoteRepository.findAll();
		return liste;
	}

}
