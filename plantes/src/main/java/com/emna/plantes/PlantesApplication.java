package com.emna.plantes;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emna.plantes.entites.plante;
import com.emna.plantes.service.PlanteService;

@SpringBootApplication
public class PlantesApplication  implements CommandLineRunner {

	@Autowired
	PlanteService planteService;
	public static void main(String[] args) {
		SpringApplication.run(PlantesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		planteService.savePlante(new plante("Jasmin", 18.5, new Date()));
		planteService.savePlante(new plante("Lavande", 20.0, new Date()));
		planteService.savePlante(new plante("Tournesol", 10.0, new Date()));
		
	}

}
