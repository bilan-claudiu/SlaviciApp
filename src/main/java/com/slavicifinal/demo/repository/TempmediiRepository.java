package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Tempmedii;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TempmediiRepository extends JpaRepository<Tempmedii, Long> {

    Tempmedii findTempmediiById(Long id);

    Tempmedii findTempmediiByIdstud(Long idstud);

    Tempmedii findTempmediiByCredite(int credite);

    List<Tempmedii> findTempmediisByMedie(double medie);

    void deleteById(Long id);


}
