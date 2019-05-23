package com.Warehouse.repos;

import com.Warehouse.domain.enums.UserRole;
import com.Warehouse.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByEmail(String username);
    List<User> findByUserRoles(UserRole role);
}
