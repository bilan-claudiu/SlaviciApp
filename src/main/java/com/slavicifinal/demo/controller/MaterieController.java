package com.slavicifinal.demo.controller;

import com.slavicifinal.demo.model.Absolventi;
import com.slavicifinal.demo.model.Facultati;
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

    @PostMapping("/adauga")
    public ResponseEntity<Materie> adaugaMaterie(@RequestBody Materie materie) {
        Materie newMaterie = materieService.saveMaterie(materie);
        return new ResponseEntity<>(newMaterie, HttpStatus.CREATED);
    }

    @PostMapping("/adauga-materii")
    public ResponseEntity<List<Materie>> adaugaMaterii(@RequestBody List<Materie> materii) {
        List<Materie> materieList = materieService.saveMaterii(materii);
        return new ResponseEntity<>(materieList, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Materie> updateMaterie(@RequestBody Materie materie, @PathVariable Long id) {
        Materie updateMaterie = materieService.updateMaterie(materie, id);
        return new ResponseEntity<>(updateMaterie, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Materie> deletematerieById(@PathVariable Long id) {
        materieService.deleteMaterieById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
