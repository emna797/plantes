package com.emna.plantes.service;

import com.emna.plantes.entites.Role;
import com.emna.plantes.entites.User;

public interface UserService {
	void deleteAllusers();

	void deleteAllRoles();

	User saveUser(User user);

	User findUserByUsername(String username);

	Role addRole(Role role);

	User addRoleToUser(String username, String rolename);

}
