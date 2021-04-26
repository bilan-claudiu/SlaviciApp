package com.slavicifinal.demo.controller;

import com.slavicifinal.demo.model.Inscrieri;
import com.slavicifinal.demo.service.InscrieriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscrieri")
public class InscrieriController {

    private final InscrieriService inscrieriService;

    @Autowired
    public InscrieriController(InscrieriService inscrieriService) {
        this.inscrieriService = inscrieriService;
    }

    @GetMapping()
    public ResponseEntity<List<Inscrieri>> getAllInscrieri() {
        List<Inscrieri> inscrieriList = inscrieriService.getAllInscrieri();
        return new ResponseEntity<>(inscrieriList, HttpStatus.OK);
    }

    @GetMapping("/promotia/{promotia}")
    public ResponseEntity<List<Inscrieri>> getAllInscrieriByPromotie(@PathVariable String promotia) {
        List<Inscrieri> incrieriBypromotie = inscrieriService.getInscrieresByPromotie(promotia);
        return new ResponseEntity<>(incrieriBypromotie, HttpStatus.OK);
    }

    @GetMapping("/cauta/{id}")
    public ResponseEntity<Inscrieri> getInscriereById(@PathVariable Long id) {
        Inscrieri inscriere = inscrieriService.getInscriereById(id);
        return new ResponseEntity<>(inscriere, HttpStatus.OK);
    }

    @GetMapping("/cauta-iduser/{idUser}")
    public ResponseEntity<Inscrieri> getInscriereByIdUser(@PathVariable Long idUser) {
        Inscrieri inscriere = inscrieriService.getInsciereByIduser(idUser);
        return new ResponseEntity<>(inscriere, HttpStatus.OK);
    }

    @GetMapping("/cauta-cnp/{cnp}")
    public ResponseEntity<Inscrieri> getInscriereByCnp(@PathVariable String cnp) {
        Inscrieri inscriere = inscrieriService.getInscriereByCnp(cnp);
        return new ResponseEntity<>(inscriere, HttpStatus.OK);
    }

    @GetMapping("/cauta-nume/{nactual}")
    public ResponseEntity<Inscrieri> getInscriereByNume(@PathVariable String nactual) {
        Inscrieri inscriere = inscrieriService.getInsciereByNume(nactual);
        return new ResponseEntity<>(inscriere, HttpStatus.OK);
    }

    @GetMapping("/cauta-serieId/{serieId}")
    public ResponseEntity<Inscrieri> getInscriereBySerieId(@PathVariable String serieId) {
        Inscrieri inscriere = inscrieriService.getInscriereBySerieId(serieId);
        return new ResponseEntity<>(inscriere, HttpStatus.OK);
    }

    @GetMapping("/cauta-specializare/{specializare}")
    public ResponseEntity<Inscrieri> getInscriereByIdSpecializare(@PathVariable String specializare) {
        Inscrieri inscriere = inscrieriService.getInscriereByIdSpecializare(specializare);
        return new ResponseEntity<>(inscriere, HttpStatus.OK);
    }

    @PostMapping("/adauga")
    public ResponseEntity<Inscrieri> adaugaStudent(@RequestBody Inscrieri inscriere) {
        Inscrieri newInscriere = inscrieriService.saveInscrirere(inscriere);
        return new ResponseEntity<>(newInscriere, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Inscrieri> updateStudent(@RequestBody Inscrieri inscriere, @PathVariable Long id) {
        Inscrieri updateInscriere = inscrieriService.updateInscriere(inscriere, id);
        return new ResponseEntity<>(updateInscriere, HttpStatus.OK);
    }

    @PostMapping("/adauga-grup")
    public ResponseEntity<List<Inscrieri>> adaugaInscriere(@RequestBody List<Inscrieri> inscrieri) {
        List<Inscrieri> inscrieriList = inscrieriService.saveInscriere(inscrieri);
        return new ResponseEntity<>(inscrieriList, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Inscrieri> deleteInscriereById(@PathVariable Long id) {
        inscrieriService.deleteInscriereById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
