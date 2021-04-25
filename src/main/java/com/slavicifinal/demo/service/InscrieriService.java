package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Inscrieri;
import com.slavicifinal.demo.repository.InscrieriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

@Service
public class InscrieriService {

    private final InscrieriRepository inscrieriRepository;

    @Autowired
    public InscrieriService(InscrieriRepository inscrieriRepository) {
        this.inscrieriRepository = inscrieriRepository;
    }

    public Inscrieri saveInscrirere(Inscrieri inscriere) {

        // automat generated local date and time stamp
        LocalDate now = LocalDate.now();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        inscriere.setDatamod(now);
        inscriere.setTimemod(sdf.format(timestamp));

        return inscrieriRepository.save(inscriere);
    }

    public List<Inscrieri> saveInscriere(List<Inscrieri> inscrieriList) {
        return inscrieriRepository.saveAll(inscrieriList);
    }

    // get inscriere by id
    public Inscrieri getInscriereById(Long id) {
        return inscrieriRepository.findInscrieriById(id);
    }

    public Inscrieri getInsciereByIduser(Long idUser) {
        return inscrieriRepository.findInscrieriByIduser(idUser);
    }

    public Inscrieri getInscriereByCnp(String cnp) {
        return inscrieriRepository.findInscrieriByCnp(cnp);
    }

    public Inscrieri getInsciereByNume(String nactual) {
        return inscrieriRepository.findInscrieriByNactual(nactual);
    }

    public Inscrieri getInscriereBySerieId(String serieId) {
        return inscrieriRepository.findInscrieriBySerieid(serieId);
    }

    public Inscrieri getInscrireByEmail(String email) {
        return inscrieriRepository.findInscrieriByEmail(email);
    }

    public Inscrieri getInscriereByIdSpecializare(String idSpecializare) {
        return inscrieriRepository.findInscrieriByIdspecializare(idSpecializare);
    }

    public List<Inscrieri> getInscrieresByPromotie(String promotia) {
        return inscrieriRepository.findInscrieriByPromotia(promotia);
    }
    public void deleteInscriereById(Long id) {
        inscrieriRepository.deleteById(id);
    }

    public List<Inscrieri> getAllInscrieri() {
        return inscrieriRepository.findAll();
    }

    public Inscrieri updateInscriere(Inscrieri newInscriere, Long id) {
        return inscrieriRepository.findById(id).map(inscriere -> {
            //automat generation of date and timestamp
            LocalDate now = LocalDate.now();
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            inscriere.setDatamod(now);
            inscriere.setTimemod(sdf.format(timestamp));

            //update fields for student
            inscriere.setAnfinal(newInscriere.getAnfinal());
            inscriere.setAnlic(newInscriere.getAnlic());
            inscriere.setAnpregatitor(newInscriere.getAnpregatitor());
            inscriere.setCetatenie(newInscriere.getCetatenie());
            inscriere.setCivila(newInscriere.getCivila());
            inscriere.setCnp(newInscriere.getCnp());
            inscriere.setDataelid(newInscriere.getDataelid());
            inscriere.setDataexpid(newInscriere.getDataexpid());
            inscriere.setDezabilitati(newInscriere.getDezabilitati());
            inscriere.setDnastere(newInscriere.getDnastere());
            inscriere.setDomiciliua(newInscriere.getDomiciliua());
            inscriere.setDomiciliuc(newInscriere.getDomiciliuc());
            inscriere.setDomiciliuj(newInscriere.getDomiciliuj());
            inscriere.setDomiciliul(newInscriere.getDomiciliul());
            inscriere.setDomiciliut(newInscriere.getDomiciliut());
            inscriere.setEliberatid(newInscriere.getEliberatid());
            inscriere.setEmail(newInscriere.getEmail());
            inscriere.setEtnie(newInscriere.getEtnie());
            inscriere.setExportweb(newInscriere.getExportweb());
            inscriere.setForma(newInscriere.getForma());
            inscriere.setIdspecializare(newInscriere.getIdspecializare());
            inscriere.setIduser(newInscriere.getIduser());
            inscriere.setInformare(newInscriere.getInformare());
            inscriere.setJnastere(newInscriere.getJnastere());
            inscriere.setLiceuAnabs(newInscriere.getLiceuAnabs());
            inscriere.setLiceuAnemis(newInscriere.getLiceuAnemis());
            inscriere.setLiceuBac(newInscriere.getLiceuBac());
            inscriere.setLiceuDenumire(newInscriere.getLiceuDenumire());
            inscriere.setLiceuDiploma(newInscriere.getLiceuDiploma());
            inscriere.setLiceuDurata(newInscriere.getLiceuDurata());
            inscriere.setLiceuEmis(newInscriere.getLiceuEmis());
            inscriere.setLiceuForma(newInscriere.getLiceuForma());
            inscriere.setLiceuJudet(newInscriere.getLiceuJudet());
            inscriere.setLiceuLocalit(newInscriere.getLiceuLocalit());
            inscriere.setLiceuMatricola(newInscriere.getLiceuMatricola());
            inscriere.setLiceuMedia(newInscriere.getLiceuMedia());
            inscriere.setLiceuNumar(newInscriere.getLiceuNumar());
            inscriere.setLiceuProfil(newInscriere.getLiceuProfil());
            inscriere.setLiceuSerie(newInscriere.getLiceuSerie());
            inscriere.setLiceuTara(newInscriere.getLiceuTara());
            inscriere.setLiceuVizare(newInscriere.getLiceuVizare());
            inscriere.setLnastere(newInscriere.getLnastere());
            inscriere.setNactual(newInscriere.getNactual());
            inscriere.setNationalitate(newInscriere.getNationalitate());
            inscriere.setNnastere(newInscriere.getNnastere());
            inscriere.setNrMat(newInscriere.getNrMat());
            inscriere.setNrid(newInscriere.getNrid());
            inscriere.setObservatii(newInscriere.getObservatii());
            inscriere.setPmama(newInscriere.getPmama());
            inscriere.setPoza(newInscriere.getPoza());
            inscriere.setPrenume(newInscriere.getPrenume());
            inscriere.setPromotia(newInscriere.getPromotia());
            inscriere.setPtata(newInscriere.getPtata());
            inscriere.setSerieid(newInscriere.getSerieid());
            inscriere.setSexul(newInscriere.getSexul());
            inscriere.setSocial(newInscriere.getSocial());
            inscriere.setStagiumilitar(newInscriere.getStagiumilitar());
            inscriere.setTelefon(newInscriere.getTelefon());
            inscriere.setTipid(newInscriere.getTipid());
            inscriere.setTipstudent(newInscriere.getTipstudent());
            inscriere.setTnastere(newInscriere.getTnastere());
            inscriere.setUnivAnabs(newInscriere.getUnivAnabs());
            inscriere.setUnivAnemis(newInscriere.getUnivAnemis());
            inscriere.setUnivDenumire(newInscriere.getUnivDenumire());
            inscriere.setUnivDiploma(newInscriere.getUnivDiploma());
            inscriere.setUnivDurata(newInscriere.getUnivDurata());
            inscriere.setUnivEmis(newInscriere.getUnivEmis());
            inscriere.setUnivFacultate(newInscriere.getUnivFacultate());
            inscriere.setUnivForma(newInscriere.getUnivForma());
            inscriere.setUnivJudet(newInscriere.getUnivJudet());
            inscriere.setUnivLocalit(newInscriere.getUnivLocalit());
            inscriere.setUnivMatricola(newInscriere.getUnivMatricola());
            inscriere.setUnivNumar(newInscriere.getUnivNumar());
            inscriere.setUnivSerie(newInscriere.getUnivSerie());
            inscriere.setUnivSpecializare(newInscriere.getUnivSpecializare());
            inscriere.setUnivTara(newInscriere.getUnivTara());
            inscriere.setUnivTaxa(newInscriere.getUnivTaxa());
            inscriere.setUnivTitlu(newInscriere.getUnivTitlu());
            inscriere.setUnivVizare(newInscriere.getUnivVizare());
            inscriere.setVolumul(newInscriere.getVolumul());
            inscriere.setWork(newInscriere.getWork());


            return inscrieriRepository.save(inscriere);
        }).orElseGet(() -> {
            newInscriere.setId(id);
            return inscrieriRepository.save(newInscriere);
        });

    }




}

