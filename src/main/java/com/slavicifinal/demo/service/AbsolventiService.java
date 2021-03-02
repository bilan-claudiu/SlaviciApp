package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Absolventi;
import com.slavicifinal.demo.repository.AbsolventiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsolventiService {

    private final AbsolventiRepository absolventiRepository;

    @Autowired
    public AbsolventiService(AbsolventiRepository absolventiRepository) {
        this.absolventiRepository = absolventiRepository;
    }

    public Absolventi saveAbsolvent(Absolventi absolvent) {
        return absolventiRepository.save(absolvent);
    }

    public List<Absolventi> saveAbsolventi(List<Absolventi> absolventi) {
        return absolventiRepository.saveAll(absolventi);
    }

    public List<Absolventi> getAllAbsolventi() {
        return absolventiRepository.findAll();
    }

    public Absolventi getAbsolventById(Long id) {
        return absolventiRepository.findAbsolventiById(id);
    }

    public Absolventi getAbsolventByPromotia(String id) {
        return absolventiRepository.findAbsolventiByPromotia(id);
    }

    public Absolventi getAbsolventByCnp(String cnp) {
        return absolventiRepository.findAbsolventiByCnp(cnp);
    }

    public Absolventi getAbsolventByIdPromotia(Long id) {
        return absolventiRepository.findAbsolventiByIdpromotie(id);
    }

    public Absolventi getAbsolventByNume(String nume) {
        return absolventiRepository.findAbsolventiByNume(nume);
    }

    public List<Absolventi> getAbsolventiListByPromotie(String promotie) {
        return absolventiRepository.findAbsolventisByPromotia(promotie);
    }

    public void deleteAbsolventById(Long id) {
        absolventiRepository.deleteById(id);
    }

}
