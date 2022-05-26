package com.example.port4clondelgentejava11.service;
import java.util.List;
import javax.transaction.Transactional;

import com.example.port4clondelgentejava11.model.Info;
import com.example.port4clondelgentejava11.repository.InfoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional

public class UsuarioService {

    private final InfoRepo usuarioRepo;

    @Autowired
    public UsuarioService(InfoRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }
          
    public Info addUser (Info usuario){
        //return usuarioRepo.save(usuario);
        return usuarioRepo.save(usuario);
    }
    public List<Info> buscarUsuario (){
      return usuarioRepo.findAll();
    }
    public Info editarUsuario(Info usuario){
      return usuarioRepo.save(usuario);
    }
    
    public void borrarUsuario(Long id){
      usuarioRepo.deleteById(id);
    }

    public Info buscarUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElse(null);
        //return usuarioRepo.findAll();
      }
    
}
