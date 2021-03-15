package com.slavicifinal.demo.controller;

import com.slavicifinal.demo.model.Confani;
import com.slavicifinal.demo.service.ConfaniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/confani")
public class ConfaniController {

    private final ConfaniService confaniService;

    @Autowired
    public ConfaniController(ConfaniService confaniService) {
        this.confaniService = confaniService;
    }

    @GetMapping()
    public ResponseEntity<List<Confani>> getAllConfani() {
        List<Confani> confaniList = confaniService.getAllConfani();
        return new ResponseEntity<>(confaniList, HttpStatus.OK);
    }

    @GetMapping("/cauta-id/{id}")
    public ResponseEntity<Confani> getMaterieById(@PathVariable Long id) {
        Confani confani = confaniService.getConfaniById(id);
        return new ResponseEntity<>(confani, HttpStatus.OK);
    }

    @GetMapping("/cauta-promotie/{promotie}")
    public ResponseEntity<Confani> getMaterieByPromotie(@PathVariable String promotie) {
        Confani confani = confaniService.getConfaniByPromotie(promotie);
        return new ResponseEntity<>(confani, HttpStatus.OK);
    }

    @GetMapping("/cauta-anstudiu/{anstudiu}")
    public ResponseEntity<Confani> getMaterieByAnStudiu(@PathVariable int anstudiu) {
        Confani confani = confaniService.getConfaniByAnStudiu(anstudiu);
        return new ResponseEntity<>(confani, HttpStatus.OK);
    }

    @GetMapping("/cauta-specializare/{specializare}")
    public ResponseEntity<Confani> getMaterieByAnStudiu(@PathVariable String specializare) {
        Confani confani = confaniService.getConfaniBySpecializare(specializare);
        return new ResponseEntity<>(confani, HttpStatus.OK);
    }

    @GetMapping("/cauta-disciplina/{disciplina}")
    public ResponseEntity<Confani> getMaterieByTipDisciplina(@PathVariable int disciplina) {
        Confani confani = confaniService.getConfaniByTipDisciplina(disciplina);
        return new ResponseEntity<>(confani, HttpStatus.OK);
    }

    @GetMapping("/cauta-formaEx/{formaEx}")
    public ResponseEntity<Confani> getMaterieByFormaExamen(@PathVariable int formEx) {
        Confani confani = confaniService.getConfaniByFormaExamen(formEx);
        return new ResponseEntity<>(confani, HttpStatus.OK);
    }

    @GetMapping("/cauta-id/{idUser}")
    public ResponseEntity<Confani> getMaterieByIdUser(@PathVariable Long idUser) {
        Confani confani = confaniService.getConfaniByIduser(idUser);
        return new ResponseEntity<>(confani, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Confani> updateMaterie(@RequestBody Confani confani, @PathVariable Long id) {
        Confani updateConfani = confaniService.updateConfani(confani, id);
        return new ResponseEntity<>(updateConfani, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Confani> deleteConfaniById(@PathVariable Long id) {
        confaniService.deleteConfaniById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
