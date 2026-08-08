package com.example.port4clondelgentejava11.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Info implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;    
    private String apellido;    
    private String titulo;
    private String descripcion;
    private String fotoPerfil;

    public Info() {
    }

    public Info(Long id, String nombre, String apellido, String titulo, String descripcion, String fotoPerfil) {
        this.id = id;
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setTitulo(titulo);
        this.setDescripcion(descripcion);
        this.setFotoPerfil(fotoPerfil);
    }

    
    public String getFotoPerfil() {
        return fotoPerfil;
    }


    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
