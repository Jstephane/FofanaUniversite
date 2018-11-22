package fr.fofana.universite.enseignants.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.fofana.universite.enseignants.business.IEnseignantsBusisness;
import fr.fofana.universite.enseignants.controller.IEnseignantsController;
import fr.fofana.universite.enseignants.domain.Enseignants;



@Controller
public  class EnseignantsControllerImpl implements IEnseignantsController{

	@Autowired	
	private IEnseignantsBusisness enseignantsBusisness;

	@Override
	@RequestMapping("/Enseignants")
	public String getEnseignants(Model model) {
		List<Enseignants> liste = enseignantsBusisness.getEnseignants();	
		model.addAttribute("Enseignants" , liste);
		return "Enseignants/Enseignants";
	}


	@Override
	@RequestMapping("/Enseignant")
	public String getEnseignantById ( Model model , @RequestParam Integer id){ 


		Enseignants e = enseignantsBusisness.getEnseignantById(id);

		model.addAttribute("enseignantsBusisness" ,e);


		return "Enseignants/DetailsEnseignant";


	}


	@Override
	@RequestMapping("/AjouterEnseignantFormulaire")
	public String AjouterEnseignantFormulaire(Model model , Integer id) {

		Enseignants e = new Enseignants();
		model.addAttribute("Enseignants",e);

		return "Enseignants/AjouterEnseignantFormulaire";
	}

	@Override
	@PostMapping("/AjouterEnseignant")
	public String AjouterEnseignant(Model model , @ModelAttribute Enseignants Enseignants ) {

		enseignantsBusisness.saveEnseignants(Enseignants);
		return "redirect:/Enseignants";


	}
	@Override
	@GetMapping("/supprimerEnseignant")
	public String SupprimerEnseignant(Model model , @RequestParam Integer id) {

		enseignantsBusisness.SupprimerEnseignant(id);;

		return "redirect:/Enseignants";
	}


	@Override
	@GetMapping("/ModifierEnseignant")
	public String ModifierEnseignant(Model model , @RequestParam Integer id ) {

		Enseignants e = enseignantsBusisness.getEnseignantById(id);

		model.addAttribute("Enseignants" ,e);


		return "Enseignants/ModifierEnseignant";


	}
	
	@Override
	@PostMapping("/ModifierEnseignant")
	public String modifierEnsEnseignant(Model model , @ModelAttribute Enseignants Enseignants ) {
		enseignantsBusisness.saveEnseignants(Enseignants);
		return "redirect:/Enseignants";


	}

}
