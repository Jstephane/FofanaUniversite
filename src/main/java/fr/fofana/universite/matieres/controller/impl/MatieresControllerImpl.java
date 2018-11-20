package fr.fofana.universite.matieres.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.fofana.universite.enseignants.domain.Enseignants;
import fr.fofana.universite.matieres.business.IMatieresBusiness;
import fr.fofana.universite.matieres.controller.IMatieresController;
import fr.fofana.universite.matieres.domain.Matieres;

@Controller
public class MatieresControllerImpl implements IMatieresController {

	@Autowired
	private IMatieresBusiness matieresBusiness;

	@Override
	@RequestMapping("/Matieres")
	public String getMatieres(Model model) {
		List<Matieres> liste = matieresBusiness.getMatieres();
		model.addAttribute("Matieres", liste);
		return "Matieres/Matieres";
	}

	@Override
	@GetMapping("/AjouterMatiereFormulaire")
	public String AjouterMatieresFormulaire(Model model) {

		List<Enseignants> liste = matieresBusiness.getEnseignant();
		model.addAttribute("Enseignants", liste);

		Matieres m = new Matieres();
		model.addAttribute("Matieres", m);

		return "Matieres/AjouterMatiereFormulaire";
	}

	@Override
	@PostMapping("/AjouterMatieres")
	public String AjouterMatieres(Model model, @ModelAttribute Matieres Matieres, @RequestParam Integer IdEnseignant) {

		Enseignants enseignant = matieresBusiness.getEnseignantById(IdEnseignant);
		Matieres.setEnseignant(enseignant);

		matieresBusiness.SaveMatieres(Matieres);
		return "redirect:/Matieres";

	}

	@Override
	@GetMapping("/SupprimerMatiere")
	public String SupprimerMatieres(@RequestParam Integer id) {

		matieresBusiness.SupprimerMatiere(id);
		;

		return "redirect:/Matieres";
	}

	@Override
	@GetMapping("/ModifierMatieres")
	public String ModifierMatieres(Model model, @RequestParam Integer id) {

		Matieres m = matieresBusiness.getMatiereById(id);

		model.addAttribute("Matieres", m);

		return "Matieres/ModifierMatiere";

	}

	@Override
	@PostMapping("/ModifierMatieres")
	public String ModifierMatieres(Model model, @ModelAttribute Matieres Matieres) {
		matieresBusiness.SaveMatieres(Matieres);
		return "redirect:/Matieres";

	}

	@Override
	@GetMapping(path = "/DetailsMatiere", name = "detail matiere")
	public String getMatiereById(Model model, Integer id) {

		model.addAttribute("matieresBusiness", matieresBusiness.getMatiereById(id));
		return "Matieres/DetailsMatiere";
	}

}