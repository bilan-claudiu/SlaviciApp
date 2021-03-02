package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Specializari;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecializariRepository extends JpaRepository<Specializari, Long> {

    Specializari findSpecializariById(Long id);
    Specializari findSpecializariByNume(String nume);
    Specializari findSpecializariByIdfacultate(Long id);

    void deleteById(Long id);
}
