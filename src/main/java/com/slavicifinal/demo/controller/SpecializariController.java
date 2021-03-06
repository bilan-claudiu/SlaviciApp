package com.slavicifinal.demo.controller;


import com.slavicifinal.demo.model.Specializari;
import com.slavicifinal.demo.service.SpecializariService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specializare")
public class SpecializariController {


    @Autowired
    private SpecializariService specializariService;


    @GetMapping()
    public ResponseEntity<List<Specializari>> getAllSpecializari() {
        List<Specializari> specializari = specializariService.getAllSpecializari();
        return new ResponseEntity<>(specializari, HttpStatus.OK);
    }

    @GetMapping("/cauta-nume/{nume}")
    public ResponseEntity<Specializari> getSpecializareByNume(@PathVariable String nume) {
        Specializari specializare = specializariService.getSpecializariByNume(nume);
        return new ResponseEntity<Specializari>(specializare, HttpStatus.OK);
    }

    @GetMapping("/cauta/{id}")
    public ResponseEntity<Specializari> getSpecializareById(@PathVariable Long id) {
        Specializari specializare = specializariService.getSpecializareById(id);
        return new ResponseEntity<Specializari>(specializare, HttpStatus.OK);
    }

    @GetMapping("/cauta-idFac/{idFacultate}")
    public ResponseEntity<Specializari> getSpecializareByIdFacultate(@PathVariable Long idFacultate) {
        Specializari specializare = specializariService.getSpecializariByIdFacultate(idFacultate);
        return new ResponseEntity<Specializari>(specializare, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Specializari> updateSpecializare(@RequestBody Specializari specializare, @PathVariable Long id) {
        Specializari updateSpecializare = specializariService.updateSpecializare(specializare, id);
        return new ResponseEntity<>(updateSpecializare, HttpStatus.OK);
    }

    @PostMapping("/adauga")
    public ResponseEntity<Specializari> adaugaSpecializare(@RequestBody Specializari specializare) {
        Specializari newSpecializare = specializariService.saveSpecializare(specializare);
        return new ResponseEntity<>(newSpecializare, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Specializari> deleteSpecializareById(@PathVariable("id") Long id) {
        specializariService.deleteSpecializareById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
