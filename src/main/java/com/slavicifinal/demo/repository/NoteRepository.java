package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note,Long> {

    Note findNoteById(Long id);
    Note findNoteByIdconfani(Long idConfani);
    Note findNoteByIdstud(Long idStud);
    Note findNoteByNotaf( float notaf);
    Note findNoteByIduser(int iduser);
    void deleteById(Long id);
    void deleteByIduser(int iduser);
}
