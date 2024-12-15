package com.dictionaryapp.korea.repository;

import com.dictionaryapp.korea.usermodels.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository <Role, Long>{
    Optional<Role> findByRoleName(String roleName);
}
