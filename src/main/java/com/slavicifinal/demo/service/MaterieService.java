package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Materie;
import com.slavicifinal.demo.repository.MaterieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

@Service
public class MaterieService {

    private final MaterieRepository materieRepository;

    @Autowired
    public MaterieService(MaterieRepository materieRepository) {
        this.materieRepository = materieRepository;
    }

    public Materie saveMaterie(Materie materie) {
        //automat generation of date and timestamp
        LocalDate now = LocalDate.now();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        materie.setDatamod(now);
        materie.setTimemod(sdf.format(timestamp));
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

    public Materie updateMaterie(Materie newMaterie, Long id) {
        return materieRepository.findById(id).map(materie -> {
            //generate date and time stamp
            LocalDate now = LocalDate.now();
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            materie.setDatamod(now);
            materie.setTimemod(sdf.format(timestamp));
            //update fields for materie
            materie.setCodMat(newMaterie.getCodMat());
            materie.setDenumMat(newMaterie.getDenumMat());
            materie.setOrecurs(newMaterie.getOrecurs());
            materie.setOresem(newMaterie.getOresem());
            materie.setOrelab(newMaterie.getOrelab());
            materie.setOrepgr(newMaterie.getOrepgr());
            materie.setOrepractica(newMaterie.getOrepractica());
            materie.setIduser(newMaterie.getIduser());
            return materieRepository.save(materie);
        }).orElseGet(() -> {
            newMaterie.setId(id);
            return materieRepository.save(newMaterie);
        });
    }

}
