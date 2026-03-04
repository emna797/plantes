package com.emna.plantes;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.emna.plantes.entites.Famille;
import com.emna.plantes.entites.plante;
import com.emna.plantes.repos.PlanteRepository;
import com.emna.plantes.service.PlanteService;

@SpringBootTest
class PlantesApplicationTests {

	@Autowired 
	private PlanteRepository planteRepository; 
	@Autowired 
	private PlanteService planteService ;
	@Test 
	public void testCreatePlante() { 
	plante plan = new plante("Orchidée", 25.0, new Date()); 
	planteRepository.save(plan); 
	}
	@Test 
	public void testFindPlante() 
	{ 
	plante p = planteRepository.findById(2L).get();     
	System.out.println(p); 
	} 
	@Test 
	public void testUpdatePlante() 
	{ 
	plante p = planteRepository.findById(2L).get(); 
	p.setPrixPlante(15.0); 
	planteRepository.save(p); 
	System.out.println(p);
	}
	@Test 
	public void testDeletePlante() 
	  { 
	   planteRepository.deleteById(3L);; 
	    
	  } 
	@Test 
	 public void testFindAllPlantes() 
	  { 
	   List<plante>  plants = planteRepository.findAll();   
	   for (plante p : plants) 
	   { 
	    System.out.println(p); 
	   }   
	  }
	@Test 
	public void testFindByNomPlanteContains() 
	{ 
	Page<plante>  plan = planteService.getAllPlantesParPage(0,2); 
	System.out.println(plan.getSize()); 
	System.out.println(plan.getTotalElements()); 
	System.out.println(plan.getTotalPages()); 
	plan.getContent().forEach(p -> {System.out.println(p.toString()); 
	});  
	/*ou bien 
	for (Produit p : prods) 
	{ 
	System.out.println(p); 
	} */
   }
	@Test 
	public void findByNomPlante() 
	{ 
	 List <plante> pls = planteRepository.findByNomPlante("Rose");
	 for( plante p:pls )
	    System.out.println(p); 
	}
	@Test
	public void findByNomPlanteContains () 
	{ 
	List<plante> pls=planteRepository.findByNomPlanteContains("o"); 
	for (plante p : pls) 
	{ 
	System.out.println(p); 
	} } 
	@Test
	public void testfindByNomPrix() 
	{ 
	List<plante>  pls = planteRepository.findByNomPrix("Tulipe", 12.5); 
	for (plante p : pls) 
	{ 
	System.out.println(p); 
	} 
	} 
	@Test 
	public void testfindByCategorie() 
	{ 
	Famille fam = new Famille(); 
	fam.setIdFam(1L);    
	List<plante>  pls = planteRepository.findByFamille(fam); 
	for (plante p : pls) 
	{ 
	System.out.println(p); 
	} 
	} 
	@Test 
	public void findByFamilleIdFam() 
	{    
	List<plante>  pls = planteRepository.findByFamilleIdFam(1L); 
	for (plante p : pls) 
	{ 
	System.out.println(p); 
	} 
	}
	@Test 
	 public void findByOrderByNomPlanteAsc() 
	  { 
	  List<plante>  pls =planteRepository.findByOrderByNomPlanteAsc();   
	   for (plante p : pls) 
	   { 
	    System.out.println(p); 
	   } 
	  }
	@Test 
	 public void testTrierProduitsNomsPrix() 
	  { 
	  List<plante>  pls = planteRepository.trierPlantesNomsPrix();
	   
	   for (plante p : pls) 
	   { 
	    System.out.println(p); 
	   } 
	  } 
	
}
