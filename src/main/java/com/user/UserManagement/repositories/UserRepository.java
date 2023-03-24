package com.user.UserManagement.repositories;

import com.user.UserManagement.model.User;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface UserRepository extends Repository<User,Long> {
    User save(User user);


    Optional<User> findByUserId(Long Id);
}
