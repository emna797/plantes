package com.emna.plantes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.emna.plantes.dto.PlanteDTO;
import com.emna.plantes.entites.Famille;
import com.emna.plantes.entites.plante;
import com.emna.plantes.repos.FamilleRepository;
import com.emna.plantes.repos.PlanteRepository;

@Service
public class PlanteServiceImpl implements PlanteService {

	@Autowired
	PlanteRepository planteRepository;
	@Autowired
	FamilleRepository familleRepository;

	@Override
	public PlanteDTO savePlante(plante p) {
		return convertEntityToDto( planteRepository.save(p));
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
	public PlanteDTO getPlante(Long id) {
		return convertEntityToDto( planteRepository.findById(id).get());
	}

	@Override
	public List<PlanteDTO> getAllPlantes() {
		return planteRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
		/*List<plante> plt =  planteRepository.findAll(); 
		  List<PlanteDTO> listpltDto = new ArrayList<>(plt.size()); 
		  for (plante p : plt) 
			  listpltDto.add(convertEntityToDto(p)); 
		  return listpltDto;*/
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

	@Override
	public PlanteDTO convertEntityToDto(plante p) {
		/*PlanteDTO planteDTO = new PlanteDTO();
		planteDTO.setIdPlante(p.getIdPlante());
		planteDTO.setNomPlante(p.getNomPlante());
		planteDTO.setPrixPlante(p.getPrixPlante());
		planteDTO.setDateAjout(p.getDateAjout());
		planteDTO.setFamille(p.getFamille());
		return planteDTO;*/

		
		 return PlanteDTO.builder() .idPlante(p.getIdPlante())
		 .nomPlante(p.getNomPlante()) //.prixPlante(p.getPrixPlante())
		 .dateAjout(p.getDateAjout()).nomfam(p.getFamille().getNomFam()) //.famille(p.getFamille())
		 .build();  
		 
	}

}
