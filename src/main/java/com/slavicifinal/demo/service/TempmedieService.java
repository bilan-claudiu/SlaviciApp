package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Tempmedie;
import com.slavicifinal.demo.repository.TempmedieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TempmedieService {
    private final TempmedieRepository tempmedieRepository;

    @Autowired
    public TempmedieService(TempmedieRepository tempmedieRepository) {
        this.tempmedieRepository = tempmedieRepository;
    }

    public Tempmedie saveTempMedie(Tempmedie tempMedie) {
        return tempmedieRepository.save(tempMedie);
    }

    public List<Tempmedie> getAllTempMedie() {
        return tempmedieRepository.findAll();
    }


    public List<Tempmedie> saveTempmedie(List<Tempmedie> tempMedie) {
        return tempmedieRepository.saveAll(tempMedie);
    }
    public Tempmedie getTempmedieById(Long id) {
        return tempmedieRepository.findTempmedieById(id);
    }

    public Tempmedie getTempmedieByIdStudent(Long idStudent) {
        return tempmedieRepository.findTempmedieByIdStud(idStudent);
    }

    public Tempmedie getTempmedieByNume(String nume) {
        return tempmedieRepository.findTempmedieByNume(nume);
    }

    public Tempmedie getTempmedieByInitiale(String initiale) {
        return tempmedieRepository.findTempmedieByInitiale(initiale);
    }

    public Tempmedie getTempmedieByMedie(float medie) {
        return tempmedieRepository.findTempmedieByMedie(medie);
    }

    public void deleteTempMedieById(Long id) {
        tempmedieRepository.deleteById(id);
    }

    public Tempmedie updateTempmedie(Tempmedie newTempMedie, Long id) {
        return tempmedieRepository.findById(id).map(tempmedie -> {
            tempmedie.setC1(newTempMedie.getC1());
            tempmedie.setC2(newTempMedie.getC2());
            tempmedie.setC3(newTempMedie.getC3());
            tempmedie.setC4(newTempMedie.getC4());
            tempmedie.setCredite(newTempMedie.getCredite());
            tempmedie.setIdStud(newTempMedie.getIdStud());
            tempmedie.setInitiale(newTempMedie.getInitiale());
            tempmedie.setM1(newTempMedie.getM1());
            tempmedie.setM2(newTempMedie.getM2());
            tempmedie.setM3(newTempMedie.getM3());
            tempmedie.setM4(newTempMedie.getM4());
            tempmedie.setMedie(newTempMedie.getMedie());
            tempmedie.setNume(newTempMedie.getNume());
            return tempmedieRepository.save(tempmedie);
        }).orElseGet(() -> {
            newTempMedie.setId(id);
            return tempmedieRepository.save(newTempMedie);
        });
    }
}