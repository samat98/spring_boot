package ru.javamentor.s_boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javamentor.s_boot.model.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
}
