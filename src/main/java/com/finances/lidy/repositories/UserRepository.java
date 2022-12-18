package com.finances.lidy.repositories;

import com.finances.lidy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
