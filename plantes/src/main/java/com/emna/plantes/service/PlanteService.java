package com.emna.plantes.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.emna.plantes.entites.Famille;
import com.emna.plantes.entites.plante;

public interface PlanteService {
	 plante savePlante(plante p); 
	  plante updatePlante(plante p); 
	  void deletePlante(plante p); 
	    void deletePlanteById(Long id); 
	    plante getPlante(Long id); 
	  List<plante> getAllPlantes(); 
	  Page<plante> getAllPlantesParPage(int page, int size);
	  List<plante> findByNomPlante(String nom); 
	  List<plante> findByNomPlanteContains(String nom); 
	  List<plante> findByNomPrix (String nom, Double prix); 
	  List<plante> findByFamille (Famille famille); 
	  List<plante> findByFamilleIdFam(Long id);
	  List<plante> findByOrderByNomPlanteAsc(); 
	  List<plante> trierPlantesNomsPrix();
	  List<Famille> getAllFamilles();  
}
