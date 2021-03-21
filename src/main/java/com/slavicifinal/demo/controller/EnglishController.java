package com.slavicifinal.demo.controller;

import com.slavicifinal.demo.model.English;
import com.slavicifinal.demo.service.EnglishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/english")
public class EnglishController {

    private final EnglishService englishService;

    @Autowired
    public EnglishController(EnglishService englishService) {
        this.englishService = englishService;
    }

    @PostMapping("/adauga")
    public ResponseEntity<English> adaugaEnglish(@RequestBody English english) {
        English newEnglish = englishService.saveEnglish(english);
        return new ResponseEntity<>(newEnglish, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<English>> getAllEnglish() {
        List<English> englishes = englishService.getAllEnglish();
        return new ResponseEntity<>(englishes, HttpStatus.OK);
    }

    @GetMapping("/cauta/{id}")
    public ResponseEntity<English> getEnglishById(@PathVariable Long id) {
        English english = englishService.getEnglishById(id);
        return new ResponseEntity<>(english, HttpStatus.OK);
    }

    @GetMapping("/cauta-idden/{idden}")
    public ResponseEntity<English> getSpecializareByIdden(@PathVariable Long idden) {
        English english = englishService.getEnglishByIdden(idden);
        return new ResponseEntity<English>(english, HttpStatus.OK);
    }

    @GetMapping("/cauta-tabel/{tabel}")
    public ResponseEntity<English> getEnglishBytabel(@PathVariable String tabel) {
        English english = englishService.getEnglishByTabel(tabel);
        return new ResponseEntity<English>(english, HttpStatus.OK);
    }

    @GetMapping("/cauta-traducere/{traducere}")
    public ResponseEntity<English> getEnglishByTraducere(@PathVariable String traducere) {
        English english = englishService.getEnglishByTraducere(traducere);
        return new ResponseEntity<English>(english, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<English> updateSpecializare(@RequestBody English english, @PathVariable Long id) {
        English updateEnglish = englishService.updateEnglish(english, id);
        return new ResponseEntity<>(updateEnglish, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<English> deleteSpecializareById(@PathVariable("id") Long id) {
        englishService.deleteEnglishById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
