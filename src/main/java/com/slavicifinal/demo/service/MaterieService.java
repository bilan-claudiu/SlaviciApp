package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Materie;
import com.slavicifinal.demo.repository.MaterieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterieService {

    private final MaterieRepository materieRepository;

    @Autowired
    public MaterieService(MaterieRepository materieRepository) {
        this.materieRepository = materieRepository;
    }

    public Materie saveMaterie(Materie materie) {
        return materieRepository.save(materie);
    }

    public List<Materie> saveMaterii(List<Materie> materiiList) {
        return materieRepository.saveAll(materiiList);
    }

    public Materie getMaterieById(Long id) {
        return materieRepository.findMaterieById(id);
    }


    public Materie getMaterieByIdUser(Long idUser) {
        return materieRepository.findMaterieByIduser(idUser);
    }

    public List<Materie> getAllMaterii() {
        return materieRepository.findAll();
    }

    public void deleteMaterieById(Long id) {
        materieRepository.deleteById(id);
    }


    public Materie updateMaterie(Materie newMaterie,  Long id) {
        return materieRepository.findById(id).map(materie -> {
            materie.setCod_mat(newMaterie.getCod_mat());
            materie.setDenum_mat(newMaterie.getDenum_mat());
            return materieRepository.save(materie);
        }).orElseGet(() -> {
            newMaterie.setId(id);
            return materieRepository.save(newMaterie);
        });
    }

}
