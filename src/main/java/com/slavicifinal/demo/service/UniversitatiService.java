package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Absolventi;
import com.slavicifinal.demo.model.Universitati;
import com.slavicifinal.demo.repository.UniversitatiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversitatiService {

    private final UniversitatiRepository universitatiRepository;

    @Autowired
    public UniversitatiService(UniversitatiRepository universitatiRepository) {
        this.universitatiRepository = universitatiRepository;
    }

    public Universitati saveUniversitate(Universitati universitatea) {
        return universitatiRepository.save(universitatea);
    }

    public List<Universitati> saveUniversitati(List<Universitati> universitati) {
        return universitatiRepository.saveAll(universitati);
    }

    public List<Universitati> getAllUniversitati() {
        return universitatiRepository.findAll();
    }

    public Universitati getUniversitateaById(Long id) {
        return universitatiRepository.findUniversitatiById(id);
    }

    public Universitati getUniversitateaByNume(String nume) {
        return universitatiRepository.findUniversitatiByNume(nume);
    }

    public Universitati getUniversitateaByNumeSpec(String numeSpec) {
        return universitatiRepository.findUniversitatiByNumespec(numeSpec);
    }

    public Universitati getUniversitateaBySpecializare(int specializare) {
        return universitatiRepository.findUniversitatiBySpecializarea(specializare);
    }

    public void deleteUnivById(Long id) {
        universitatiRepository.deleteById(id);
    }

    public Universitati updateUniversitatea(Universitati newUniversitatea, Long id) {
        return universitatiRepository.findById(id).map(universitati -> {
            universitati.setAdeverinta(newUniversitatea.getAdeverinta());

            universitati.setCertificat(newUniversitatea.getCertificat());
            universitati.setCoperta(newUniversitatea.getCoperta());
            universitati.setNume(newUniversitatea.getNume());
            universitati.setNumespec(newUniversitatea.getNumespec());
            universitati.setNumespecen(newUniversitatea.getNumespecen());
            universitati.setPag1(newUniversitatea.getPag1());
            universitati.setPag2(newUniversitatea.getPag2());
            universitati.setPag3(newUniversitatea.getPag3());
            universitati.setPag4(newUniversitatea.getPag4());
            universitati.setPag5(newUniversitatea.getPag5());
            universitati.setPag6(newUniversitatea.getPag6());
            universitati.setPag7(newUniversitatea.getPag7());
            universitati.setSitp1(newUniversitatea.getSitp1());
            universitati.setSitp2(newUniversitatea.getSitp2());
            universitati.setSitp3(newUniversitatea.getSitp3());
            universitati.setSitp4(newUniversitatea.getSitp4());
            universitati.setSitp5(newUniversitatea.getSitp5());
            universitati.setSitp6(newUniversitatea.getSitp6());
            universitati.setSitp7(newUniversitatea.getSitp7());
            universitati.setSpecializarea(newUniversitatea.getSpecializarea());
            return universitatiRepository.save(universitati);
        }).orElseGet(() -> {
            newUniversitatea.setId(id);
            return universitatiRepository.save(newUniversitatea);
        });
    }


}
