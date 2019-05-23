package com.Warehouse.repos;

import com.Warehouse.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {
    List<User> findBySurnameContaining(String tag);
    User findById(Long tag);
    User findByEmail(String tag);
    Integer deleteById(Long tag);
}
