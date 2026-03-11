package com.emna.plantes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.emna.plantes.entites.Famille;
import com.emna.plantes.entites.plante;
import com.emna.plantes.repos.FamilleRepository;
import com.emna.plantes.repos.PlanteRepository;
@Service
public class PlanteServiceImpl implements PlanteService{

	@Autowired
	PlanteRepository planteRepository;
	@Autowired 
	FamilleRepository familleRepository; 
	@Override
	public plante savePlante(plante p) {
		return planteRepository.save(p);
	}

	@Override
	public plante updatePlante(plante p) {
		return planteRepository.save(p);
	}

	@Override
	public void deletePlante(plante p) {
		planteRepository.delete(p);
		
	}

	@Override
	public void deletePlanteById(Long id) {
		planteRepository.deleteById(id);
		
	}

	@Override
	public plante getPlante(Long id) {
		return planteRepository.findById(id).get();
	}

	@Override
	public List<plante> getAllPlantes() {
		return planteRepository.findAll();
	}

	@Override
	public Page<plante> getAllPlantesParPage(int page, int size) {
		return planteRepository.findAll(PageRequest.of(page, size));
	};

	@Override
	public List<plante> findByNomPlante(String nom) {
		// TODO Auto-generated method stub
		return planteRepository.findByNomPlante(nom);
	}

	@Override
	public List<plante> findByNomPlanteContains(String nom) {
		// TODO Auto-generated method stub
		return planteRepository.findByNomPlanteContains(nom);
	}

	@Override
	public List<plante> findByNomPrix(String nom, Double prix) {
		// TODO Auto-generated method stub
		return planteRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<plante> findByFamille(Famille famille) {
		// TODO Auto-generated method stub
		return planteRepository.findByFamille(famille);
	}

	@Override
	public List<plante> findByFamilleIdFam(Long id) {
		// TODO Auto-generated method stub
		return planteRepository.findByFamilleIdFam(id);
	}

	@Override
	public List<plante> findByOrderByNomPlanteAsc() {
		// TODO Auto-generated method stub
		return planteRepository.findByOrderByNomPlanteAsc();
	}

	@Override
	public List<plante> trierPlantesNomsPrix() {
		// TODO Auto-generated method stub
		return planteRepository.trierPlantesNomsPrix();
	}
	
	@Override
	public List<Famille> getAllFamilles() {
		return familleRepository.findAll();
	}

}
