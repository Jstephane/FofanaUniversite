package fr.fofana.universite.notes.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.fofana.universite.notes.business.INotesBusiness;
import fr.fofana.universite.notes.controller.INotesController;
import fr.fofana.universite.notes.domain.Notes;

@Controller
public class NotesControllerImpl implements INotesController {

	@Autowired
	private INotesBusiness notesBusiness;

	@Override
	@RequestMapping("/Notes")
	public String getNotes(Model model) {
		List<Notes> liste = notesBusiness.getNotes();
		model.addAttribute("Notes", liste);
		return "Notes/Notes";

	}

}