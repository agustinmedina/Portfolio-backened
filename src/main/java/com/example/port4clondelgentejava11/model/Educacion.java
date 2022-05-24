package com.example.port4clondelgentejava11.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;    
    private int fechaEdu;   
    private String descEdu;
    private String imagenEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, int fechaEdu, String descEdu, String imagenEdu) {
        this.idEdu = idEdu;
        this.setTituloEdu(tituloEdu);
        this.setFechaEdu(fechaEdu);
        this.setDescEdu(descEdu);
        this.setImagenEdu(imagenEdu);
    }
    
    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public int getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(int fechaEdu) {
        this.fechaEdu = fechaEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    
}
