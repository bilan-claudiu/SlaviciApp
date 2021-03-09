package com.slavicifinal.demo.service;


import com.slavicifinal.demo.model.Note;
import com.slavicifinal.demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
        LocalDate now = LocalDate.now();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        newNota.setDatamod(now);
        newNota.setTimemod(sdf.format(timestamp));

        if (newNota.getNotac() >= 5 && newNota.getNotaa() >= 5) {
            newNota.setNotaf((newNota.getNotac() + newNota.getNotaa()) / 2);
        } else {
            newNota.setNotaf(0);
        }
        return noteRepository.save(newNota);


    }

    public Note updateNota(Note newNota, Long id) {
        return noteRepository.findById(id).map(nota -> {
            //automat generate datamood and timemood
            LocalDate now = LocalDate.now();
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            nota.setDatamod(now);
            nota.setTimemod(sdf.format(timestamp));

            //update note fields
            nota.setIdconfani(newNota.getIdconfani());
            nota.setIdstud(newNota.getIdstud());
            nota.setIduser(newNota.getIduser());
            nota.setNotaa(newNota.getNotaa());
            nota.setNotac(newNota.getNotac());
            nota.setNotaf(newNota.getNotaf());
            //check if note are valid(>5)
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