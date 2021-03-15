package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Confani;
import com.slavicifinal.demo.repository.ConfaniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

@Service
public class ConfaniService {

    private final ConfaniRepository confaniRepository;

    @Autowired
    public ConfaniService(ConfaniRepository confaniRepository) {
        this.confaniRepository = confaniRepository;
    }

    public Confani saveConfani(Confani confani) {
        LocalDate now = LocalDate.now();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        confani.setDatamod(now);
        confani.setTimemod(sdf.format(timestamp));
        return confaniRepository.save(confani);
    }

    public List<Confani> getAllConfani() {
        return confaniRepository.findAll();
    }

    public Confani getConfaniById(Long id) {
        return confaniRepository.findConfaniById(id);
    }

    public Confani getConfaniByPromotie(String promotia) {
        return confaniRepository.findConfaniByPromotie(promotia);
    }

    public Confani getConfaniByAnStudiu(int anStudiu) {
        return confaniRepository.findConfaniByAnstudiu(anStudiu);
    }

    public Confani getConfaniBySpecializare(String specializare) {
        return confaniRepository.findConfaniBySpecializare(specializare);
    }

    public Confani getConfaniByTipDisciplina(int tipDisciplina) {
        return confaniRepository.findConfaniByTipdisciplina(tipDisciplina);
    }

    public Confani getConfaniByFormaExamen(int formaExamen) {
        return confaniRepository.findConfaniByFormaex(formaExamen);
    }

    public Confani getConfaniByIduser(Long idUser) {
        return confaniRepository.findConfaniByIduser(idUser);
    }

    public void deleteConfaniById(Long id) {
        confaniRepository.deleteById(id);
    }


    public Confani updateConfani(Confani newConfan, Long id) {
        return confaniRepository.findById(id).map(confani -> {

            //automat generate datamood and timemood
            LocalDate now = LocalDate.now();
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            confani.setDatamod(now);
            confani.setTimemod(sdf.format(timestamp));
            confani.setIdmaterie(newConfan.getIdmaterie());
            confani.setPromotie(newConfan.getPromotie());
            confani.setSpecializare(newConfan.getSpecializare());
            confani.setAnstudiu(newConfan.getAnstudiu());
            confani.setSemestru((newConfan.getSemestru()));
            confani.setTipdisciplina(newConfan.getTipdisciplina());
            confani.setFormaex((newConfan.getFormaex()));
            confani.setObservatii(newConfan.getObservatii());
            confani.setIduser(newConfan.getIduser());

            return confaniRepository.save(confani);
        }).orElseGet(() -> {
            newConfan.setId(id);
            return confaniRepository.save(newConfan);
        });
    }

}


