package com.devsuperiror.userdpt.repositories;

import com.devsuperiror.userdpt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
