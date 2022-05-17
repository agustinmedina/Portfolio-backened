package com.example.port4clondelgentejava11.service;
import java.util.List;
import javax.transaction.Transactional;

import com.example.port4clondelgentejava11.model.Usuario;
import com.example.port4clondelgentejava11.repository.UsuarioRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional

public class UsuarioService {

    private final UsuarioRepo usuarioRepo;

    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }
          
    public Usuario addUser (Usuario usuario){
        //return usuarioRepo.save(usuario);
        return usuarioRepo.save(usuario);
    }
    public List<Usuario> buscarUsuario (){
      return usuarioRepo.findAll();
    }
    public Usuario editarUsuario(Usuario usuario){
      return usuarioRepo.save(usuario);
    }
    
    public void borrarUsuario(Long id){
      usuarioRepo.deleteById(id);
    }

    public Usuario buscarUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElse(null);
        //return usuarioRepo.findAll();
      }
    
}
