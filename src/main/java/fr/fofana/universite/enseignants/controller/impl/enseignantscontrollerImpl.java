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
public class enseignantscontrollerImpl implements IEnseignantsController {

	@Autowired
	private IEnseignantsBusisness enseignantsBusisness;

	@Override
	@RequestMapping("/Enseignants")
	public String getenseignants(Model model) {
		List<Enseignants> liste = enseignantsBusisness.getenseignants();
		model.addAttribute("Enseignants", liste);
		return "Enseignants/Enseignants";
	}

	@Override
	@RequestMapping("/Enseignant")
	public String getenseignantById(Model model, @RequestParam Integer id) {

		Enseignants e = enseignantsBusisness.getenseignantById(id);

		model.addAttribute("enseignantsBusisness", e);

		return "Enseignants/DetailsEnseignant";

	}

	@Override
	@RequestMapping("/AjouterEnseignantFormulaire")
	public String ajouterenseignantformulaire(Model model, Integer id) {

		Enseignants e = new Enseignants();
		model.addAttribute("Enseignants", e);

		return "Enseignants/AjouterEnseignantFormulaire";
	}

	@Override
	@PostMapping("/AjouterEnseignant")
	public String ajouterenseignant(Model model, @ModelAttribute Enseignants Enseignants) {

		enseignantsBusisness.saveenseignants(Enseignants);
		return "redirect:/Enseignants";

	}

	@Override
	@GetMapping("/supprimerEnseignant")
	public String supprimerenseignant(Model model, @RequestParam Integer id) {

		enseignantsBusisness.supprimerenseignant(id);
		;

		return "redirect:/Enseignants";
	}

	@Override
	@GetMapping("/ModifierEnseignant")
	public String modifierenseignant(Model model, @RequestParam Integer id) {

		Enseignants e = enseignantsBusisness.getenseignantById(id);

		model.addAttribute("Enseignants", e);

		return "Enseignants/ModifierEnseignant";

	}

	@Override
	@PostMapping("/ModifierEnseignant")
	public String modifierensenseignant(Model model, @ModelAttribute Enseignants Enseignants) {
		enseignantsBusisness.saveenseignants(Enseignants);
		return "redirect:/Enseignants";

	}

	@Override
	public String ajouterenseignantFormulaire(Model model, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ejouterenseignant(Model model, Enseignants Enseignants) {
		// TODO Auto-generated method stub
		return null;
	}

}
