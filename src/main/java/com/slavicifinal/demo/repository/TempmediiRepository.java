package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Tempmedii;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TempmediiRepository extends JpaRepository<Tempmedii, Long> {

    Tempmedii findTempmediiById(Long id);

    Tempmedii findTempmediiByIdstud(Long idstud);

    Tempmedii findTempmediiByCredite(int credite);

    List<Tempmedii> findTempmediisByMedie(double medie);

    void deleteById(Long id);


}
