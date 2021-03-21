package com.slavicifinal.demo.controller;

import com.slavicifinal.demo.model.Tempmedii;
import com.slavicifinal.demo.service.TempmediiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tempmedii")
public class TempmediiController {

    private final TempmediiService tempmediiService;

    @Autowired
    public TempmediiController(TempmediiService tempmediiService) {
        this.tempmediiService = tempmediiService;
    }

    @GetMapping()
    public ResponseEntity<List<Tempmedii>> getAllUniversitati() {
        List<Tempmedii> TempMedieList = tempmediiService.getAllTempmedii();
        return new ResponseEntity<>(TempMedieList, HttpStatus.OK);
    }

    @GetMapping("/cauta-idStud/{idStud}")
    public ResponseEntity<Tempmedii> gettempMediiByIdStud(@PathVariable Long idStud) {
        Tempmedii tempmedii = tempmediiService.getTempmediiByIdstudent(idStud);
        return new ResponseEntity<>(tempmedii, HttpStatus.OK);
    }

    @GetMapping("/cauta/{id}")
    public ResponseEntity<Tempmedii> gettempMediiById(@PathVariable Long id) {
        Tempmedii tempmedii = tempmediiService.getTempmediiById(id);
        return new ResponseEntity<>(tempmedii, HttpStatus.OK);
    }

    @GetMapping("/cauta-credite/{credite}")
    public ResponseEntity<Tempmedii> gettempMediiByCredite(@PathVariable int credite) {
        Tempmedii tempmedie = tempmediiService.getTempmediiByCredite(credite);
        return new ResponseEntity<>(tempmedie, HttpStatus.OK);
    }

    @GetMapping("/cauta-medie/{medie}")
    public ResponseEntity<List<Tempmedii>> gettempMediiByMedie(@PathVariable double medie) {
        List<Tempmedii> TMList = tempmediiService.findTempmediisByMedie(medie);
        return new ResponseEntity<>(TMList, HttpStatus.OK);
    }


    @PostMapping("/adauga")
    public ResponseEntity<Tempmedii> adaugaTempMedii(@RequestBody Tempmedii tempmedii) {
        Tempmedii newTempMedii = tempmediiService.saveTempmedii(tempmedii);
        return new ResponseEntity<>(newTempMedii, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Tempmedii> updateTempMedii(@RequestBody Tempmedii tempmedii, @PathVariable Long id) {
        Tempmedii updateTempMedii = tempmediiService.updateTempMedii(tempmedii, id);
        return new ResponseEntity<>(updateTempMedii, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Tempmedii> deleteTempMediiById(@PathVariable Long id) {
        tempmediiService.deleteTempMediiById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
