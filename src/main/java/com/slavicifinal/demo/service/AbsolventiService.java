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

    public void deleteById(Long id) {
        absolventiRepository.deleteById(id);
    }

    public Absolventi updateAbsolvent(Absolventi newAbsolvent, Long id) {
        return absolventiRepository.findById(id).map(absolventi -> {
            absolventi.setAn_volum(newAbsolvent.getAn_volum());
            absolventi.setAnfinal(newAbsolvent.getAnfinal());
            absolventi.setAnul1(newAbsolvent.getAnul1());
            absolventi.setAnul2(newAbsolvent.getAnul2());
            absolventi.setAnul3(newAbsolvent.getAnul3());
            absolventi.setAnul4(newAbsolvent.getAnul4());
            absolventi.setAnul5(newAbsolvent.getAnul5());
            absolventi.setC1(newAbsolvent.getC1());
            absolventi.setC2(newAbsolvent.getC2());
            absolventi.setC3(newAbsolvent.getC3());
            absolventi.setC4(newAbsolvent.getC4());
            absolventi.setCnp(newAbsolvent.getCnp());
            absolventi.setCredite(newAbsolvent.getCredite());
            absolventi.setDatanastere(newAbsolvent.getDatanastere());
            absolventi.setIdStud(newAbsolvent.getIdStud());
            absolventi.setIdpromotie(newAbsolvent.getIdpromotie());
            absolventi.setInitiale(newAbsolvent.getInitiale());
            absolventi.setLicenta(newAbsolvent.getLicenta());
            absolventi.setLocnastere(newAbsolvent.getLocnastere());
            absolventi.setM1(newAbsolvent.getM1());
            absolventi.setM2(newAbsolvent.getM2());
            absolventi.setM3(newAbsolvent.getM3());
            absolventi.setM4(newAbsolvent.getM4());
            absolventi.setMama(newAbsolvent.getMama());
            absolventi.setMedia(newAbsolvent.getMedia());
            absolventi.setNr_mat(newAbsolvent.getNr_mat());
            absolventi.setNume(newAbsolvent.getNume());
            absolventi.setNumenastere(newAbsolvent.getNumenastere());
            absolventi.setObservatii(newAbsolvent.getObservatii());
            absolventi.setPozpromotie(newAbsolvent.getPozpromotie());
            absolventi.setPrenume(newAbsolvent.getPrenume());
            absolventi.setPromotia(newAbsolvent.getPromotia());
            absolventi.setSexul(newAbsolvent.getSexul());
            absolventi.setTata(newAbsolvent.getTata());
            absolventi.setTotalpromotie(newAbsolvent.getTotalpromotie());
            absolventi.setVolumul(newAbsolvent.getVolumul());

            return absolventiRepository.save(absolventi);
        }).orElseGet(() -> {
            newAbsolvent.setId(id);
            return absolventiRepository.save(newAbsolvent);
        });
    }

}
