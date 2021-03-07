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


<<<<<<< HEAD

=======
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
    @Autowired
    private SpecializariService specializariService;


    @GetMapping()
    public ResponseEntity<List<Specializari>> getAllSpecializari() {
        List<Specializari> specializari = specializariService.getAllSpecializari();
        return new ResponseEntity<>(specializari, HttpStatus.OK);
    }
<<<<<<< HEAD
    @GetMapping("/cauta-nume/{nume}")
    public ResponseEntity<Specializari> getSpecializareByNume ( @PathVariable String nume){
        Specializari specializare =  specializariService.getSpecializariByNume(nume);
        return new ResponseEntity<Specializari>(specializare, HttpStatus.OK);
    }

    @GetMapping("/cauta-id/{id}")
    public ResponseEntity<Specializari> getSpecializareById( @PathVariable Long id){
        Specializari specializare =  specializariService.getSpecializareById(id);
=======

    @GetMapping("/cauta-nume/{nume}")
    public ResponseEntity<Specializari> getSpecializareByNume(@PathVariable String nume) {
        Specializari specializare = specializariService.getSpecializariByNume(nume);
        return new ResponseEntity<Specializari>(specializare, HttpStatus.OK);
    }

    @GetMapping("/cauta/{id}")
    public ResponseEntity<Specializari> getSpecializareById(@PathVariable Long id) {
        Specializari specializare = specializariService.getSpecializareById(id);
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
        return new ResponseEntity<Specializari>(specializare, HttpStatus.OK);
    }

    @GetMapping("/cauta-idFac/{idFacultate}")
<<<<<<< HEAD
    public ResponseEntity<Specializari> getSpecializareByIdFacultate( @PathVariable Long idFacultate){
        Specializari specializare =  specializariService.getSpecializariByIdFacultate(idFacultate);
        return new ResponseEntity<Specializari>(specializare, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Specializari> updateSpecializare(@RequestBody Specializari specializare) {
        Specializari newSpecializare = specializariService.saveSpecializare(specializare);
        return new ResponseEntity<>(newSpecializare, HttpStatus.OK);
    }

    @PostMapping("/new")
=======
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
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
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
