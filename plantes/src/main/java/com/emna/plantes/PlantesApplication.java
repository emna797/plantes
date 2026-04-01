package com.emna.plantes;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.password.PasswordEncoder;

import com.emna.plantes.entites.Role;
import com.emna.plantes.entites.User;
import com.emna.plantes.entites.plante;
import com.emna.plantes.service.PlanteService;
import com.emna.plantes.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class PlantesApplication implements CommandLineRunner {

	@Autowired
	PlanteService planteService;
	/*@Autowired
	PasswordEncoder passwordEncoder;*/
	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(PlantesApplication.class, args);
	}

	/*@PostConstruct
	void init_users() {
		// ajouter les rôles
		userService.addRole(new Role(null, "ADMIN"));
		userService.addRole(new Role(null, "AGENT"));
		userService.addRole(new Role(null, "USER"));

		// ajouter les users
		userService.saveUser(new User(null, "admin", "123", true, null));
		userService.saveUser(new User(null, "emna", "123", true, null));
		userService.saveUser(new User(null, "user1", "123", true, null));

		// ajouter les rôles aux users
		userService.addRoleToUser("admin", "ADMIN");

		userService.addRoleToUser("emna", "USER");
		userService.addRoleToUser("emna", "AGENT");

		userService.addRoleToUser("user1", "USER");
	}*/

	@Override
	public void run(String... args) throws Exception {
		// System.out.println("Password Encoded BCRYPT :******************** ");
		// System.out.println(passwordEncoder.encode("123"));
		/*
		 * planteService.savePlante(new plante("Jasmin", 18.5, new Date()));
		 * planteService.savePlante(new plante("Lavande", 20.0, new Date()));
		 * planteService.savePlante(new plante("Tournesol", 10.0, new Date()));
		 */

	}

}
