package com.emna.plantes.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emna.plantes.entites.plante;
import com.emna.plantes.service.PlanteService;

@Controller
public class PlanteController {
	@Autowired
	PlanteService planteService;

	@RequestMapping("/ListePlantes")
	public String listePlantes(ModelMap modelMap,@RequestParam (name="page",defaultValue = "0") int page, 
			@RequestParam (name="size", defaultValue = "3 ") int size) {
		Page<plante> plant = planteService.getAllPlantesParPage(page, size); 
		modelMap.addAttribute("plantes", plant); 
		modelMap.addAttribute("pages", new int[plant.getTotalPages()]);  
		modelMap.addAttribute("currentPage", page);  
		modelMap.addAttribute("size", size); 
		return "listePlantes"; 
	}

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createPlante";
	}

	@RequestMapping("/savePlante")
	public String savePlante(@ModelAttribute("plante") plante plante, @RequestParam("date") String date,
			ModelMap modelMap) throws ParseException {

		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateAjout = dateformat.parse(date);
		plante.setDateAjout(dateAjout);

		plante savedPlante = planteService.savePlante(plante);

		String msg = "Plante enregistrée avec Id " + savedPlante.getIdPlante();
		modelMap.addAttribute("msg", msg);

		return "createPlante";
	}

	@RequestMapping("/supprimerPlante")
	public String supprimerPlante(@RequestParam("id") Long id, ModelMap modelMap,@RequestParam (name="page",defaultValue = "0") int page, 
			@RequestParam (name="size", defaultValue = "2") int size) {

		planteService.deletePlanteById(id);

		Page<plante> plantes = planteService.getAllPlantesParPage(page, size);

		modelMap.addAttribute("plantes", plantes);
		modelMap.addAttribute("pages", new int[plantes.getTotalPages()]);
		modelMap.addAttribute("currentPage", page);
		modelMap.addAttribute("size", size);
		return "listePlantes";
	}

	@RequestMapping("/modifierPlante")
	public String editerPlante(@RequestParam("id") Long id, ModelMap modelMap) {

		plante p = planteService.getPlante(id);
		modelMap.addAttribute("plante", p);

		return "editerPlante";
	}

	@RequestMapping("/updatePlante")
	public String updatePlante(@ModelAttribute("plante") plante plante, @RequestParam("date") String date,
			ModelMap modelMap) throws ParseException {

		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateAjout = dateformat.parse(date);
		plante.setDateAjout(dateAjout);

		planteService.updatePlante(plante);

		List<plante> plantes = planteService.getAllPlantes();
		modelMap.addAttribute("plantes", plantes);

		return "listePlantes";
	}

}
