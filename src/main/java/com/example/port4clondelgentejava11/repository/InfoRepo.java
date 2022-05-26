package com.example.port4clondelgentejava11.repository;

import com.example.port4clondelgentejava11.model.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InfoRepo extends JpaRepository<Info,Long> {
    
}
