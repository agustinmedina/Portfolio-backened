package com.example.port4clondelgentejava11.repository;

import java.util.Optional;

import com.example.port4clondelgentejava11.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
   Optional<User>findByEmail(String email);
}
