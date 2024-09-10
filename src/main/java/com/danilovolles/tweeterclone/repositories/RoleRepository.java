package com.danilovolles.tweeterclone.repositories;

import com.danilovolles.tweeterclone.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
