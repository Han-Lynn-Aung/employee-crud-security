package com.example.employeecrudsecurity.repository;

import com.example.employeecrudsecurity.model.ERole;
import com.example.employeecrudsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByName(ERole name);
}
