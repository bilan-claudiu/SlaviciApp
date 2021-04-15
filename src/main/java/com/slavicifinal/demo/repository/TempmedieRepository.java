package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Tempmedie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TempmedieRepository extends JpaRepository<Tempmedie, Long> {
    Tempmedie findTempmedieById(Long id);

   Tempmedie findTempmedieByMedie(float medie);

    Tempmedie findTempmedieByNume(String nume);

    Tempmedie findTempmedieByIdStud(Long idStud);

    Tempmedie findTempmedieByInitiale(String initiale);
    List<Tempmedie> findTempmediesByMedie(float medie);

    void deleteById(Long id);

}
