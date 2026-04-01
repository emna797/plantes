package com.emna.plantes.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.emna.plantes.dto.PlanteDTO;
import com.emna.plantes.entites.Famille;
import com.emna.plantes.entites.plante;

public interface PlanteService {
	PlanteDTO savePlante(plante p);

	plante updatePlante(plante p);

	void deletePlante(plante p);

	void deletePlanteById(Long id);

	PlanteDTO getPlante(Long id);

	List<PlanteDTO> getAllPlantes();

	Page<plante> getAllPlantesParPage(int page, int size);

	List<plante> findByNomPlante(String nom);

	List<plante> findByNomPlanteContains(String nom);

	List<plante> findByNomPrix(String nom, Double prix);

	List<plante> findByFamille(Famille famille);

	List<plante> findByFamilleIdFam(Long id);

	List<plante> findByOrderByNomPlanteAsc();

	List<plante> trierPlantesNomsPrix();

	List<Famille> getAllFamilles();

	PlanteDTO convertEntityToDto(plante p);
}
