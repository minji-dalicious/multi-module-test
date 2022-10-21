package com.kurrant.multi.repository;

import com.kurrant.multi.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Integer, User> {
}
