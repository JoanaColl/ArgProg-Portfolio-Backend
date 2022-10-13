package com.portfolio.jc.service;

import com.portfolio.jc.entity.Educacion;
import com.portfolio.jc.repository.IEducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    @Autowired
    IEducacionRepository ieducacionRepository;
    
    //Mostrar
    public List<Educacion> list(){
        return ieducacionRepository.findAll();
    }
    
    //Buscar ID
    public Optional<Educacion> getOne(int id){
        return ieducacionRepository.findById(id);
    }
    
    //Buscar tituloEd
    public Optional<Educacion> getByTituloEd(String tituloEd){
        return ieducacionRepository.findByTituloEd(tituloEd);
    }
    
    //Guardar
    public void save(Educacion educacion){
        ieducacionRepository.save(educacion);
    }
    
    //Eliminar ID
    public void delete(int id){
        ieducacionRepository.deleteById(id);
    }
    
    //Existe ID?
    public boolean existsById(int id){
        return ieducacionRepository.existsById(id);
    }
    
    //Existe nombre
    public boolean existsByTituloEd(String tituloEd){
        return ieducacionRepository.existsByTituloEd(tituloEd);
    }
}