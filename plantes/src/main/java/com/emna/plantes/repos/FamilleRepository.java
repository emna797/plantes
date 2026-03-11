package com.emna.plantes.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emna.plantes.entites.Famille;
import com.emna.plantes.entites.plante;

public interface FamilleRepository extends JpaRepository<Famille, Long> {

}
