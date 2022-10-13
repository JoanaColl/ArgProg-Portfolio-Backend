package com.portfolio.jc.service;

import com.portfolio.jc.entity.Experiencia;
import com.portfolio.jc.repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
    @Autowired
    IExperienciaRepository iexperienciaRepository;
    
    public List<Experiencia> list(){
        return iexperienciaRepository.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return iexperienciaRepository.findById(id);
    }
    
    public Optional<Experiencia> getByTituloEx(String tituloEx){
        return iexperienciaRepository.findByTituloEx(tituloEx);
    }
    
    public void save(Experiencia experiencia){
        iexperienciaRepository.save(experiencia);
    }
    
    public void delete(int id){
        iexperienciaRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return iexperienciaRepository.existsById(id);
    }
    
    public boolean existsByTituloEx(String tituloEx){
        return iexperienciaRepository.existsByTituloEx(tituloEx);
    }
}