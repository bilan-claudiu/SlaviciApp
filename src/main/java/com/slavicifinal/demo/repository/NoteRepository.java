package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

    //ist<Note> findNoteByIdstud(Long studId);

    void deleteById(Long id);
}