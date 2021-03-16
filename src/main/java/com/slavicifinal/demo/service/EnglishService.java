package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.English;
import com.slavicifinal.demo.repository.EnglishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnglishService {
    private final EnglishRepository englishRepository;

    @Autowired
    public EnglishService(EnglishRepository englishRepository) {
        this.englishRepository = englishRepository;
    }

    public English saveEnglish(English english) {
        return englishRepository.save(english);
    }

    public English getEnglishById(Long id) {
        return englishRepository.findEnglishById(id);
    }
    public English getEnglishByIdden(Long idden) {
        return englishRepository.findEnglishByIdden(idden);
    }

    public English getEnglishByTabel(String tabel) {
        return englishRepository.findEnglishByTabel(tabel);
    }

    public English getEnglishByTraducere(String traducere) {
        return englishRepository.findEnglishByTraducere(traducere);
    }

    public List<English> getAllEnglish() {
        return englishRepository.findAll();
    }

    public void deleteEnglishById(Long id) {
        englishRepository.deleteById(id);
    }
    public English updateEnglish(English newEnglish, Long id) {
        return englishRepository.findById(id).map(english -> {

            english.setIdden(newEnglish.getIdden());
            english.setTabel(newEnglish.getTabel());
            english.setTraducere((newEnglish.getTraducere()));

            return englishRepository.save(english);
        }).orElseGet(() -> {
            newEnglish.setId(id);
            return englishRepository.save(newEnglish);
        });
    }
}
