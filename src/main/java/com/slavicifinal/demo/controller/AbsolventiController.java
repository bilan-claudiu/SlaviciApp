package com.slavicifinal.demo.controller;

import com.slavicifinal.demo.model.Absolventi;
import com.slavicifinal.demo.service.AbsolventiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/absolventi")
public class AbsolventiController {

    private final AbsolventiService absolventiService;

    @Autowired
    public AbsolventiController(AbsolventiService absolventiService) {
        this.absolventiService = absolventiService;
    }

    @GetMapping()
    public ResponseEntity<List<Absolventi>> getAllAbsolvents() {
        List<Absolventi> absolvents = absolventiService.getAllAbsolventi();
        return new ResponseEntity<>(absolvents, HttpStatus.OK);
    }

    @GetMapping("/cauta/{id}")
    public ResponseEntity<Absolventi> getAbsolventById(@PathVariable Long id) {
        Absolventi absolvent = absolventiService.getAbsolventById(id);
        return new ResponseEntity<>(absolvent, HttpStatus.OK);
    }

    @GetMapping("/cauta-promotia/{promotia}")
    public ResponseEntity<Absolventi> getAbsolventByPromotia(@PathVariable String promotia) {
        Absolventi absolvent = absolventiService.getAbsolventByPromotia(promotia);
        return new ResponseEntity<>(absolvent, HttpStatus.OK);
    }

    @GetMapping("/cauta-cnp/{cnp}")
    public ResponseEntity<Absolventi> getAbsolventByCnp(@PathVariable String cnp) {
        Absolventi absolvent = absolventiService.getAbsolventByCnp(cnp);
        return new ResponseEntity<>(absolvent, HttpStatus.OK);
    }

    @GetMapping("/cauta-idPromotie/{idPromotie}")
    public ResponseEntity<Absolventi> getAbsolventByIdPromotie(@PathVariable Long idPromotie) {
        Absolventi absolvent = absolventiService.getAbsolventByIdPromotia(idPromotie);
        return new ResponseEntity<>(absolvent, HttpStatus.OK);
    }

    @GetMapping("/cauta-nume/{nume}")
    public ResponseEntity<Absolventi> getAbsolventByNume(@PathVariable String nume) {
        Absolventi absolvent = absolventiService.getAbsolventByNume(nume);
        return new ResponseEntity<>(absolvent, HttpStatus.OK);
    }

    @GetMapping("/cauta-lista-promotia/{promotia}")
    public ResponseEntity<List<Absolventi>> getAbsolventiByPromotie(@PathVariable String promotia) {
        List<Absolventi> absolventi = absolventiService.getAbsolventiListByPromotie(promotia);
        return new ResponseEntity<>(absolventi, HttpStatus.OK);
    }

    @PostMapping("/adauga")
    public ResponseEntity<Absolventi> adaugaAbsolvent(@RequestBody Absolventi absolvent) {
        Absolventi newabsolvent = absolventiService.saveAbsolvent(absolvent);
        return new ResponseEntity<>(newabsolvent, HttpStatus.CREATED);
    }

    @PostMapping("/adauga-grup")
    public ResponseEntity<List<Absolventi>> adaugaAbsolventi(@RequestBody List<Absolventi> absolventi) {
        List<Absolventi> absolventiList = absolventiService.saveAbsolventi(absolventi);
        return new ResponseEntity<>(absolventiList, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Absolventi> updateStudent(@RequestBody Absolventi absolvent,@PathVariable  Long id) {
        Absolventi updateAbsolvent = absolventiService.updateAbsolvent(absolvent,id);
        return new ResponseEntity<>(updateAbsolvent, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Absolventi> deleteAbsolventById(@PathVariable Long id) {
        absolventiService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}