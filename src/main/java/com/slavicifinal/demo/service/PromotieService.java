package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Promotie;
import com.slavicifinal.demo.repository.PromotieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotieService {
    private final PromotieRepository promotieRepository;

    @Autowired
    public PromotieService(PromotieRepository promotieRepository) {
        this.promotieRepository = promotieRepository;
    }

    public Promotie savePromotie (Promotie promotie){
        return promotieRepository.save(promotie);
    }

    public List<Promotie> savePromotii(List <Promotie> promotiiList){
        return promotieRepository.saveAll(promotiiList);
    }

    public Promotie getPromotieById (Long id){
        return promotieRepository.findPromotieById(id);
    }

    public Promotie getPromotieByNume (int nume){
        return promotieRepository.findPromotieByNume(nume);
    }

    public List<Promotie> getAllPromotii (){
        return promotieRepository.findAll();
    }

    public void deletePromotie ( Long id){
        promotieRepository.deleteById(id);
    }

    public Promotie updatePromotie ( Promotie newPromotie, Long id){
        return promotieRepository.findById(id).map(promotie -> {
            promotie.setNume(newPromotie.getNume());
            return promotieRepository.save(promotie);
        }).orElseGet(() -> {
            newPromotie.setId(id);
            return promotieRepository.save(newPromotie);
        });
    }
}
