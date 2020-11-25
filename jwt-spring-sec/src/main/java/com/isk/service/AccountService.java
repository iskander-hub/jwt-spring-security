package com.isk.service;

import com.isk.entities.AppRole;
import com.isk.entities.AppUser;

public interface AccountService {
   
	public AppUser saveUser(AppUser user);
	public AppRole saveRole(AppRole role);
	public void addRoleToUser(String username,String roleName);
	public AppUser findUserByUsername(String username);
}
