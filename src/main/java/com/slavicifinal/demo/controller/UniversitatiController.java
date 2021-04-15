package com.slavicifinal.demo.controller;


import com.slavicifinal.demo.model.Universitati;
import com.slavicifinal.demo.service.UniversitatiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universitati")
public class UniversitatiController {

    private final UniversitatiService universitatiService;

    @Autowired
    public UniversitatiController(UniversitatiService universitatiService) {
        this.universitatiService = universitatiService;
    }

    @GetMapping()
    public ResponseEntity<List<Universitati>> getAllUniversitati() {
        List<Universitati> univList = universitatiService.getAllUniversitati();
        return new ResponseEntity<>(univList, HttpStatus.OK);
    }

    @GetMapping("/cauta/{id}")
    public ResponseEntity<Universitati> getUniversitatiById(@PathVariable Long id) {
        Universitati universitate = universitatiService.getUniversitateaById(id);
        return new ResponseEntity<>(universitate, HttpStatus.OK);
    }

    @GetMapping("/cauta-nume/{nume}")
    public ResponseEntity<Universitati> getUnivByNume(@PathVariable String nume) {
        Universitati universitate = universitatiService.getUniversitateaByNume(nume);
        return new ResponseEntity<>(universitate, HttpStatus.OK);
    }

    @GetMapping("/cauta-numespec/{numespec}")
    public ResponseEntity<Universitati> getUnivByNumeSpec(@PathVariable String numespec) {
        Universitati universitate = universitatiService.getUniversitateaByNumeSpec(numespec);
        return new ResponseEntity<>(universitate, HttpStatus.OK);
    }

    @GetMapping("/cauta-specializare/{specializare}")
    public ResponseEntity<Universitati> getUnivByNumeSpec(@PathVariable int specializare) {
        Universitati universitate = universitatiService.getUniversitateaBySpecializare(specializare);
        return new ResponseEntity<>(universitate, HttpStatus.OK);
    }

    @PostMapping("/adauga")
    public ResponseEntity<Universitati> adaugaUser(@RequestBody Universitati universitatea) {
        Universitati newUniversitate = universitatiService.saveUniversitate(universitatea);
        return new ResponseEntity<>(newUniversitate, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Universitati> updateUniversitate(@RequestBody Universitati universitate, @PathVariable Long id) {
        Universitati updateUniv = universitatiService.updateUniversitatea(universitate, id);
        return new ResponseEntity<>(updateUniv, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Universitati> deleteUnivById(@PathVariable Long id) {
        universitatiService.deleteUnivById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
