package com.slavicifinal.demo.controller;

import com.slavicifinal.demo.model.Promotie;
import com.slavicifinal.demo.service.PromotieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promotie")
public class PromotieController {
    private final PromotieService promotieService;

    @Autowired
    public PromotieController(PromotieService promotieService) {
        this.promotieService = promotieService;
    }

    @GetMapping()
    public ResponseEntity<List<Promotie>> getAllPromotii() {
        List<Promotie> promotii = promotieService.getAllPromotii();
        return new ResponseEntity<>(promotii, HttpStatus.OK);
    }

    @GetMapping("/cauta/{id}")
    public ResponseEntity<Promotie> getPromotieById(@PathVariable Long id) {
        Promotie promotie = promotieService.getPromotieById(id);
        return new ResponseEntity<>(promotie, HttpStatus.OK);
    }

    @GetMapping("/cauta-nume/{nume}")
    public ResponseEntity<Promotie> getPromotieByNume(@PathVariable int nume) {
        Promotie promotie = promotieService.getPromotieByNume(nume);
        return new ResponseEntity<>(promotie, HttpStatus.OK);
    }

    @PostMapping("/adauga")
    public ResponseEntity<Promotie> adaugaPromotie(@RequestBody Promotie promotie) {
        Promotie newPromotie = promotieService.savePromotie(promotie);
        return new ResponseEntity<>(newPromotie, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Promotie> deletePromotieById(@PathVariable("id") Long id) {
        promotieService.deletePromotie(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Promotie> updatePromotie(@RequestBody Promotie promotie, @PathVariable Long id) {
        Promotie updatePromotie = promotieService.updatePromotie(promotie, id);
        return new ResponseEntity<>(updatePromotie, HttpStatus.OK);
    }
}
