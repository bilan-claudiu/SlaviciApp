package com.slavicifinal.demo.controller;

<<<<<<< HEAD
=======
import com.slavicifinal.demo.model.Absolventi;
import com.slavicifinal.demo.model.Facultati;
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
import com.slavicifinal.demo.model.Materie;
import com.slavicifinal.demo.service.MaterieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materie")
public class MaterieController {

    private final MaterieService materieService;

    @Autowired
    public MaterieController(MaterieService materieService) {
        this.materieService = materieService;
    }

    @GetMapping()
    public ResponseEntity<List<Materie>> getAllMaterii() {
        List<Materie> materiiList = materieService.getAllMaterii();
        return new ResponseEntity<>(materiiList, HttpStatus.OK);
    }

    @GetMapping("/cauta-id/{id}")
    public ResponseEntity<Materie> getMaterieById(@PathVariable Long id) {
        Materie materie = materieService.getMaterieById(id);
        return new ResponseEntity<>(materie, HttpStatus.OK);
    }

    @GetMapping("/cauta-idUser/{idUser}")
    public ResponseEntity<Materie> getMaterieByIdUser(@PathVariable Long idUser) {
        Materie materie = materieService.getMaterieByIdUser(idUser);
        return new ResponseEntity<>(materie, HttpStatus.OK);
    }

<<<<<<< HEAD
    @PostMapping("/adauga-materie")
=======
    @PostMapping("/adauga")
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
    public ResponseEntity<Materie> adaugaMaterie(@RequestBody Materie materie) {
        Materie newMaterie = materieService.saveMaterie(materie);
        return new ResponseEntity<>(newMaterie, HttpStatus.CREATED);
    }

<<<<<<< HEAD
    @PostMapping("/adauga-lista-Materii")
=======
    @PostMapping("/adauga-materii")
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
    public ResponseEntity<List<Materie>> adaugaMaterii(@RequestBody List<Materie> materii) {
        List<Materie> materieList = materieService.saveMaterii(materii);
        return new ResponseEntity<>(materieList, HttpStatus.CREATED);
    }

<<<<<<< HEAD
    @PutMapping("/update-materie")
    public ResponseEntity<Materie> updateMaterie(@RequestBody Materie materie) {
        Materie updateMaterie = materieService.saveMaterie(materie);
        return new ResponseEntity<>(updateMaterie, HttpStatus.OK);
    }

    @DeleteMapping("/delete-id/{id}")
=======
    @PutMapping("/update/{id}")
    public ResponseEntity<Materie> updateMaterie(@RequestBody Materie materie, @PathVariable Long id) {
        Materie updateMaterie = materieService.updateMaterie(materie, id);
        return new ResponseEntity<>(updateMaterie, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
    public ResponseEntity<Materie> deletematerieById(@PathVariable Long id) {
        materieService.deleteMaterieById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
<<<<<<< HEAD
=======


>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
}
