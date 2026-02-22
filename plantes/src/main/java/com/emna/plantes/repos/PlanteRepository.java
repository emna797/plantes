package com.emna.plantes.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emna.plantes.entites.plante;

public interface PlanteRepository extends JpaRepository<plante, Long> {
 
}
