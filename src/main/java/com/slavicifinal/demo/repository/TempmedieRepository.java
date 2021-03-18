package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Tempmedie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempmedieRepository extends JpaRepository<Tempmedie, Long> {
    Tempmedie findTempmedieById(Long id);

    Tempmedie findTempmedieByMedie(float medie);

    Tempmedie findTempmedieByNume(String nume);

    Tempmedie findTempmedieByIdStud(Long idStud);

    Tempmedie findTempmedieByInitiale(String initiale);

    void deleteById(Long id);

}
