package fr.fofana.universite.etudiants.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import fr.fofana.universite.etudiants.business.IEtudiantsBusiness;
import fr.fofana.universite.etudiants.controller.IEtudiantsController;
import fr.fofana.universite.etudiants.domain.Etudiants;

@Controller
public class EtudiantsControllerImpl implements IEtudiantsController { 
	@Autowired	
	private IEtudiantsBusiness etudiantsBusisness;

	@Override
	@RequestMapping("/Etudiants")
	public String getEtudiants(Model model) {
		List<Etudiants> liste = etudiantsBusisness.getEtudiants();	
		model.addAttribute("Etudiants" , liste);
		return "Etudiants/Etudiants";
	}


	@Override
	@RequestMapping("/Etudiant")
	public String getEtudiantById ( Model model , @RequestParam Integer id){ 


		Etudiants e = etudiantsBusisness.getEtudiantById(id);

		model.addAttribute("etudiantsBusisness" ,e);


		return "Etudiants/DetailsEtudiant";


	}


	@Override
	@RequestMapping("/AjouterEtudiantFormulaire")
	public String AjouterEtudiantsFormulaire(Model model , Integer id) {

		Etudiants e = new Etudiants();
		model.addAttribute("Etudiants",e);

		return "Etudiants/AjouterEtudiantFormulaire";
	}

	@Override
	@PostMapping("/AjouterEtudiant")
	public String AjouterEtudiant(Model model , @ModelAttribute Etudiants Etudiants ) {

		etudiantsBusisness.SaveEtudiants(Etudiants);
		return "redirect:/Etudiants";


	}
	@Override
	@GetMapping("/SupprimerEtudiant")
	public String SupprimerEtudiant(Model model , @RequestParam Integer id) {

		etudiantsBusisness.SupprimerEtudiant(id);;

		return "redirect:/Etudiants";
	}


	@Override
	@GetMapping("/ModifierEtudiant")
	public String ModifierEtudiant(Model model , @RequestParam Integer id ) {

		Etudiants e = etudiantsBusisness.getEtudiantById(id);

		model.addAttribute("Etudiants" ,e);


		return "Etudiants/ModifierEtudiant";


	}
	
	@Override
	@PostMapping("/ModifierEtudiants")
	public String modifierEtudiants(Model model , @ModelAttribute Etudiants Etudiants ) {
		etudiantsBusisness.SaveEtudiants(Etudiants);
		return "redirect:/Etudiants";


	}

}

	
	
	


