package com.slavicifinal.demo.controller;


import com.slavicifinal.demo.model.Note;
import com.slavicifinal.demo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/note-student/{studentId}")
    public ResponseEntity<List<Note>> cautaNote(@PathVariable Long studentId) {
        List<Note> rezultat = noteService.getNote(studentId);
        return new ResponseEntity<>(rezultat, HttpStatus.OK);
    }

    @PostMapping("/adauga")
    public ResponseEntity<Note> adaugaNota(@RequestBody Note nota) {
        Note newNota = noteService.saveNota(nota);
        return new ResponseEntity<>(newNota, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Note> updateNota(@RequestBody Note nota, @PathVariable Long id) {
        Note newNota = noteService.updateNota(nota, id);
        return new ResponseEntity<>(newNota, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Note> deleteNota(@PathVariable Long id) {
        noteService.deleteNota(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}