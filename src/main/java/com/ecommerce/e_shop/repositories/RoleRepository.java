package com.ecommerce.e_shop.repositories;

import com.ecommerce.e_shop.model.AppRole;
import com.ecommerce.e_shop.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
