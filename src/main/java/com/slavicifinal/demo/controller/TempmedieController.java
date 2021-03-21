package com.slavicifinal.demo.controller;

import com.slavicifinal.demo.model.Tempmedie;
import com.slavicifinal.demo.service.TempmedieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tempmedie")
public class TempmedieController {

    private final TempmedieService tempmedieService;

    @Autowired
    public TempmedieController(TempmedieService tempmedieService) {
        this.tempmedieService = tempmedieService;
    }

    @GetMapping()
    public ResponseEntity<List<Tempmedie>> getAllTempmedie() {
        List<Tempmedie> tempmedieList = tempmedieService.getAllTempMedie();
        return new ResponseEntity<>(tempmedieList, HttpStatus.OK);
    }

    @GetMapping("/cauta/{id}")
    public ResponseEntity<Tempmedie> getTempmedieById(@PathVariable Long id) {
        Tempmedie tempmedie = tempmedieService.getTempmedieById(id);
        return new ResponseEntity<>(tempmedie, HttpStatus.OK);
    }

    @GetMapping("/cauta-idStud/{idStud}")
    public ResponseEntity<Tempmedie> getTempmedieByIdStud(@PathVariable Long idStud) {
        Tempmedie tempmedie = tempmedieService.getTempmedieByIdStudent(idStud);
        return new ResponseEntity<>(tempmedie, HttpStatus.OK);
    }

    @GetMapping("/cauta-nume/{nume}")
    public ResponseEntity<Tempmedie> getTempMedieByNume(@PathVariable String nume) {
        Tempmedie tempmedie = tempmedieService.getTempmedieByNume(nume);
        return new ResponseEntity<>(tempmedie, HttpStatus.OK);
    }

    @GetMapping("/cauta-initiale/{initiale}")
    public ResponseEntity<Tempmedie> getTempMedieByInitiale(@PathVariable String initiale) {
        Tempmedie tempmedie = tempmedieService.getTempmedieByInitiale(initiale);
        return new ResponseEntity<>(tempmedie, HttpStatus.OK);
    }

    @PostMapping("/adauga")
    public ResponseEntity<Tempmedie> adaugaTempMedie(@RequestBody Tempmedie tempmedie) {
        Tempmedie newtempMedie = tempmedieService.saveTempMedie(tempmedie);
        return new ResponseEntity<>(newtempMedie, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Tempmedie> updateTempMedie(@RequestBody Tempmedie tempmedie, @PathVariable Long id) {
        Tempmedie updateTempMedie = tempmedieService.updateTempmedie(tempmedie, id);
        return new ResponseEntity<>(updateTempMedie, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Tempmedie> deleteTempmedieById(@PathVariable Long id) {
        tempmedieService.deleteTempMedieById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
