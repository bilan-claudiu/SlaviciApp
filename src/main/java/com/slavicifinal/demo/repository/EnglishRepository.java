package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.English;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnglishRepository extends JpaRepository<English,Long> {
    English findEnglishById(Long id);
    English findEnglishByIdden(Long id);
    English findEnglishByTabel (String tabel);
    English findEnglishByTraducere(String traducere);

    void deleteById(Long id);
}
