package com.portfolio.jc.service;

import com.portfolio.jc.entity.Skill;
import com.portfolio.jc.repository.ISkillRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillService {
    @Autowired
    ISkillRepository iskillRepository;
    
    public List<Skill> list(){
        return iskillRepository.findAll();
    }
    
    public Optional<Skill> getOne(int id){
        return iskillRepository.findById(id);
    }
    
    public Optional<Skill> getByNombreSk(String nombreSk){
        return iskillRepository.findByNombreSk(nombreSk);
    }
    
    public void save(Skill skill){
        iskillRepository.save(skill);
    }
    
    public void delete(int id){
        iskillRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return iskillRepository.existsById(id);
    }
    
    public boolean existsByNombreSk(String nombreSk){
        return iskillRepository.existsByNombreSk(nombreSk);
    }    
}