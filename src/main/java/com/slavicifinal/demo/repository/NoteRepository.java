package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

    List<Note> findNoteByIdstud(Long studId);

    void deleteById(Long id);
}
