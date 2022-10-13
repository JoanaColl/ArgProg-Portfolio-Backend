package com.portfolio.jc.service;

import com.portfolio.jc.entity.Proyecto;
import com.portfolio.jc.repository.IProyectoRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService {
    @Autowired
    IProyectoRepository iproyectoRepository;
    
    public List<Proyecto> list(){
        return iproyectoRepository.findAll();
    }
    
    public Optional<Proyecto> getOne(int id){
        return iproyectoRepository.findById(id);
    }
    
    public Optional<Proyecto> getByTituloPr(String tituloPr){
        return iproyectoRepository.findByTituloPr(tituloPr);
    }
    
    public void save(Proyecto proyecto){
        iproyectoRepository.save(proyecto);
    }
    
    public void delete(int id){
        iproyectoRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return iproyectoRepository.existsById(id);
    }
    
    public boolean existsByTituloPr(String tituloPr){
        return iproyectoRepository.existsByTituloPr(tituloPr);
    }
}