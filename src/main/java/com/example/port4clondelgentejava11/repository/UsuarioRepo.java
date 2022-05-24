package com.example.port4clondelgentejava11.repository;

import com.example.port4clondelgentejava11.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario,Long> {
    
}
