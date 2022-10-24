package com.kurrant.multi.repository;

import com.kurrant.multi.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
