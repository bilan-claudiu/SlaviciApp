package com.slavicifinal.demo.service;


import com.slavicifinal.demo.model.Note;
import com.slavicifinal.demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getNote(Long studentId) {
        return noteRepository.findNoteByIdstud(studentId);
    }

    public Note saveNota(Note newNota) {
        if (newNota.getNotac() >= 5 && newNota.getNotaa() >= 5) {
            newNota.setNotaf((newNota.getNotac() + newNota.getNotaa()) / 2);
        } else {
            newNota.setNotaf(0);
        }

        return noteRepository.save(newNota);
    }

    public Note updateNota(Note newNota, Long id) {
        return noteRepository.findById(id).map(nota -> {
            nota.setIdstud(newNota.getIdstud());
            nota.setIdconfani(newNota.getIdconfani());
            nota.setNotaa(newNota.getNotaa());
            nota.setNotac(newNota.getNotac());
            if (newNota.getNotac() >= 5 && newNota.getNotaa() >= 5) {
                nota.setNotaf((newNota.getNotac() + newNota.getNotaa()) / 2);
            } else {
                nota.setNotaf(0);
            }

            return noteRepository.save(nota);
        }).orElseGet(() -> {
            newNota.setId(id);
            return noteRepository.save(newNota);
        });
    }

    public void deleteNota(Long id) {
        noteRepository.deleteById(id);
    }
}