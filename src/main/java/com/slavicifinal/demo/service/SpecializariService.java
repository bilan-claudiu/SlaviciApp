package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Specializari;
import com.slavicifinal.demo.repository.SpecializariRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

@Service
public class SpecializariService {

    private final SpecializariRepository specializariRepository;

    @Autowired
    public SpecializariService(SpecializariRepository specializariRepository) {
        this.specializariRepository = specializariRepository;
    }

    public Specializari saveSpecializare(Specializari specializare) {
        LocalDate now = LocalDate.now();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        specializare.setDatamod(now);
        specializare.setTimemod(sdf.format(timestamp));

        return specializariRepository.save(specializare);
    }

    public List<Specializari> saveSpecializari(List<Specializari> newSpecializari) {
        return specializariRepository.saveAll(newSpecializari);
    }

    public Specializari getSpecializareById(Long id) {
        return specializariRepository.findSpecializariById(id);
    }

    public Specializari getSpecializariByNume(String nume) {
        return specializariRepository.findSpecializariByNume(nume);
    }

    public Specializari getSpecializariByIdFacultate(Long idFacultate) {
        return specializariRepository.findSpecializariByIdfacultate(idFacultate);
    }

    public void deleteSpecializareById(Long id) {
        specializariRepository.deleteById(id);
    }

    public List<Specializari> getAllSpecializari() {
        return specializariRepository.findAll();
    }

    public Specializari updateSpecializare(Specializari newSpecializare, Long id) {
        return specializariRepository.findById(id).map(specializari -> {

            //automat generate datamood and timemood
            LocalDate now = LocalDate.now();
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            specializari.setDatamod(now);
            specializari.setTimemod(sdf.format(timestamp));
            specializari.setIdfacultate(newSpecializare.getIdfacultate());
            specializari.setIduser(newSpecializare.getIduser());
            specializari.setNume(newSpecializare.getNume());

            return specializariRepository.save(specializari);
        }).orElseGet(() -> {
            newSpecializare.setId(id);
            return specializariRepository.save(newSpecializare);
        });
    }

}
