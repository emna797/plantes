package com.emna.plantes.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emna.plantes.entites.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);
}
