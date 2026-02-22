package com.emna.plantes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.emna.plantes.entites.plante;
import com.emna.plantes.repos.PlanteRepository;
@Service
public class PlanteServiceImpl implements PlanteService{

	@Autowired
	PlanteRepository planteRepository;
	
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
	}

}
