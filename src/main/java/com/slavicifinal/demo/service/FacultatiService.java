package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Facultati;
import com.slavicifinal.demo.repository.FacultatiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultatiService {


    private final FacultatiRepository facultatiRepository;

    @Autowired
    public FacultatiService(FacultatiRepository facultatiRepository) {
        this.facultatiRepository = facultatiRepository;
    }

    public Facultati saveFacultate(Facultati facultate) {
        return facultatiRepository.save(facultate);
    }

    public List<Facultati> saveFacultati(List<Facultati> facultati) {
        return facultatiRepository.saveAll(facultati);
    }

    public Facultati getfacultateById(Long id) {
        return facultatiRepository.findFacultatiById(id);
    }


    public Facultati getfacultateByNume(String nume) {
        return facultatiRepository.findFacultatiByNume(nume);
    }

    public Facultati getfacultateByDecan(String numeDecan) {
        return facultatiRepository.findFacultatiByDecan(numeDecan);
    }

    public Facultati getfacultateByProdecan(String numeproDecan) {
        return facultatiRepository.findFacultatiByProdecan1(numeproDecan);
    }

    public Facultati getfacultateByIdUser(Long idUser) {
        return facultatiRepository.findFacultatiByIduser(idUser);
    }

    public void deleteFacultateById(Long id) {
        facultatiRepository.deleteById(id);
    }

    public List<Facultati> getAllFacultati() {
        return facultatiRepository.findAll();
    }

}
