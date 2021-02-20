package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Specializari;
import com.slavicifinal.demo.repository.SpecializariRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecializariService {

    private final SpecializariRepository specializariRepository;

    @Autowired
    public SpecializariService(SpecializariRepository specializariRepository) {
        this.specializariRepository = specializariRepository;
    }

    public Specializari saveSpecializare (Specializari specializare){
        return specializariRepository.save(specializare);
    }

    public List<Specializari> saveSpecializari(List<Specializari> newSpecializari) {
        return specializariRepository.saveAll(newSpecializari);
    }

    public Specializari getSpecializareById ( Long id){
        return specializariRepository.findSpecializariById(id);
    }

    public Specializari getSpecializariByNume( String nume){
        return specializariRepository.findSpecializariByNume(nume);
    }

    public Specializari getSpecializariByIdFacultate( Long idFacultate){
        return specializariRepository.findSpecializariByIdfacultate(idFacultate);
    }

   public void deleteSpecializareById ( Long id){
        specializariRepository.deleteSpecializariById(id);
   }

   public List<Specializari> getAllSpecializari (){
        return specializariRepository.findAll();
   }


}
