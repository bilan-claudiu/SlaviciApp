package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Tempmedii;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempmediiRepository extends JpaRepository<Tempmedii, Long> {

    Tempmedii findTempmediiById(Long id);

    Tempmedii findTempmediiByIdstud(Long idstud);

    Tempmedii findTempmediiByMedie(float medie);

    Tempmedii findTempmediiByCredite(int credite);

    void deleteById(Long id);
}
