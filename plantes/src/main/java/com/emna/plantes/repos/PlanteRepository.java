package com.emna.plantes.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emna.plantes.entites.Famille;
import com.emna.plantes.entites.plante;

public interface PlanteRepository extends JpaRepository<plante, Long> {
	
	 List<plante> findByNomPlante(String nom);
	 List<plante> findByNomPlanteContains(String nom);  
	 /*@Query("select p from plante p where p.nomPlante like %?1 and p.prixPlante > ?2") 
	 List<plante> findByNomPrix (String nom, Double prix);*/
	 @Query("select p from plante p where p.nomPlante like %:nom and p.prixPlante > :prix") 
	 List<plante> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix); 
	 @Query("select p from plante p where p.famille = ?1") 
	 List<plante> findByFamille (Famille famille);
	 List<plante> findByFamilleIdFam(Long id);
	 List<plante> findByOrderByNomPlanteAsc(); 
	 @Query("select p from plante p order by p.nomPlante ASC, p.prixPlante Desc") 
	 List<plante> trierPlantesNomsPrix ();
}
