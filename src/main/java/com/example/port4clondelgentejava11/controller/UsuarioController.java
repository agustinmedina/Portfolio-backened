package com.example.port4clondelgentejava11.controller;

import com.example.port4clondelgentejava11.model.Info;
import com.example.port4clondelgentejava11.service.UsuarioService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuario")

@CrossOrigin(origins = "http//localhost:4200")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }    
    
    @GetMapping ("/id/{id}")
    public ResponseEntity<Info> obtenerUsuario(@PathVariable("id") Long id){
    Info usuario = usuarioService.buscarUsuarioPorId(id);
    return new ResponseEntity <>(usuario, HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Info> editarUsuario(@RequestBody Info usuario){
        Info updateUsuario = usuarioService.editarUsuario(usuario);
        return new ResponseEntity<>(updateUsuario,HttpStatus.OK);
        //usuario updateUsuario = usuarioService.editarUsuario(usuario);
       // return new ResponseEntity<>(updateUsuario,HttpStatus.OK);
    }

    public UsuarioService getUsuarioService() {
        return usuarioService;
    }
    
}
