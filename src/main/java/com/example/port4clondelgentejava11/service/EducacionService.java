package com.example.port4clondelgentejava11.service;


import java.util.List;
import javax.transaction.Transactional;
import com.example.port4clondelgentejava11.model.Educacion;
import com.example.port4clondelgentejava11.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class EducacionService {

    private final  EducacionRepo educacionRepo;

    @Autowired
    public EducacionService (EducacionRepo educacionRepo){
        this.educacionRepo = educacionRepo;
    }
    
    public Educacion addEducation (Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public List<Educacion> buscarEducaciones (){
        return educacionRepo.findAll();        
    }
    public Educacion editarEducacion (Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public void borrarEducacion (Long id){
        educacionRepo.deleteById(id);
    }
}
