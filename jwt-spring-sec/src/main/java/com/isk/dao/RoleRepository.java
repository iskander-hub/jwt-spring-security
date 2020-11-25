package com.isk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isk.entities.AppRole;

public interface RoleRepository extends JpaRepository<AppRole,Long>{
	
	public AppRole findByRoleName(String roleName);

}
