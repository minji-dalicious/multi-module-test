package com.kurrant.multi.repository;

import com.kurrant.multi.domain.Apartment;
import com.kurrant.multi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByName(String name);
    List<User> findByApartment(Apartment apartment);
}
