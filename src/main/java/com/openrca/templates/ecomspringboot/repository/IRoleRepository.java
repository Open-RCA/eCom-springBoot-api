package com.openrca.templates.ecomspringboot.repository;

import com.openrca.templates.ecomspringboot.enums.ERoleName;
import com.openrca.templates.ecomspringboot.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface IRoleRepository extends JpaRepository<Role, Long>{

	Optional<Role> findByName(ERoleName roleName);

}
