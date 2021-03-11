package com.slavicifinal.demo.controller;


import com.slavicifinal.demo.model.Facultati;
import com.slavicifinal.demo.service.FacultatiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facultati")
public class FacultatiController {

    @Autowired
    private FacultatiService facultatiService;

    @GetMapping()
    public ResponseEntity<List<Facultati>> getAllFacultati() {
        List<Facultati> facultati = facultatiService.getAllFacultati();
        return new ResponseEntity<>(facultati, HttpStatus.OK);
    }

    @GetMapping("/cauta-numeFac/{nume}")
    public ResponseEntity<Facultati> getFacultateByNume(@PathVariable String nume) {
        Facultati facultate = facultatiService.getfacultateByNume(nume);
        return new ResponseEntity<>(facultate, HttpStatus.OK);
    }

    @GetMapping("/cauta-nume-decan/{numeDecan}")
    public ResponseEntity<Facultati> getFacultateByDecan(@PathVariable String numeDecan) {
        Facultati facultate = facultatiService.getfacultateByDecan(numeDecan);
        return new ResponseEntity<>(facultate, HttpStatus.OK);
    }

    @GetMapping("/cauta-nume-prodecan/{prodecan}")
    public ResponseEntity<Facultati> getFacultateByProdecan(@PathVariable String prodecan) {
        Facultati facultate = facultatiService.getfacultateByProdecan(prodecan);
        return new ResponseEntity<>(facultate, HttpStatus.OK);
    }

    @GetMapping("/cauta-idFac/{id}")
    public ResponseEntity<Facultati> getFacultateById(@PathVariable Long id) {
        Facultati facultate = facultatiService.getfacultateById(id);
        return new ResponseEntity<>(facultate, HttpStatus.OK);
    }

    @GetMapping("/cauta-idUser/{idUser}")
    public ResponseEntity<Facultati> getFacultateByIdUser(@PathVariable Long idUser) {
        Facultati facultate = facultatiService.getfacultateByIdUser(idUser);
        return new ResponseEntity<>(facultate, HttpStatus.OK);
    }

    @PostMapping("/adauga-facultate")
    public ResponseEntity<Facultati> addNewFacultate(@RequestBody Facultati facultate) {
        Facultati newFacultate = facultatiService.saveFacultate(facultate);
        return new ResponseEntity<>(newFacultate, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Facultati> updateFacultate(@RequestBody Facultati facultate, @PathVariable Long id) {
        Facultati updateFac = facultatiService.updateFacultate(facultate, id);
        return new ResponseEntity<>(updateFac, HttpStatus.OK);
    }

    @PostMapping("/adauga-facultati")
    public ResponseEntity<List<Facultati>> addNewStudents(@RequestBody List<Facultati> facultatiList) {
        List<Facultati> facultati = facultatiService.saveFacultati(facultatiList);
        return new ResponseEntity<>(facultati, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Facultati> deleteFacultateById(@PathVariable Long id) {
        facultatiService.deleteFacultateById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
