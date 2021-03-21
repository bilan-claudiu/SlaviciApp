package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Tempmedii;
import com.slavicifinal.demo.repository.TempmediiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TempmediiService {
    private final TempmediiRepository tempmediiRepository;

    @Autowired
    public TempmediiService(TempmediiRepository tempmediiRepository) {
        this.tempmediiRepository = tempmediiRepository;
    }

    public Tempmedii saveTempmedii(Tempmedii tempmedii) {
        return tempmediiRepository.save(tempmedii);
    }

    public List<Tempmedii> getAllTempmedii() {
        return tempmediiRepository.findAll();
    }

    public Tempmedii getTempmediiById(Long id) {
        return tempmediiRepository.findTempmediiById(id);
    }

    public Tempmedii getTempmediiByIdstudent(Long idStudent) {
        return tempmediiRepository.findTempmediiByIdstud(idStudent);
    }

    public List<Tempmedii> findTempmediisByMedie(double medie) {
        return tempmediiRepository.findTempmediisByMedie(medie);
    }

    public Tempmedii getTempmediiByCredite(int credite) {
        return tempmediiRepository.findTempmediiByCredite(credite);
    }

    public void deleteTempMediiById(Long id) {
        tempmediiRepository.deleteById(id);
    }

    public Tempmedii updateTempMedii(Tempmedii newTempMedii, Long id) {
        return tempmediiRepository.findById(id).map(tempmedii -> {
            tempmedii.setCredite(newTempMedii.getCredite());
            tempmedii.setIdstud(newTempMedii.getIdstud());
            tempmedii.setMedie(newTempMedii.getMedie());
            return tempmediiRepository.save(tempmedii);
        }).orElseGet(() -> {
            newTempMedii.setId(id);
            return tempmediiRepository.save(newTempMedii);
        });
    }


}
