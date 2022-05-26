package com.example.port4clondelgentejava11.repository;

import com.example.port4clondelgentejava11.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository <Educacion,Long> {
    
}
