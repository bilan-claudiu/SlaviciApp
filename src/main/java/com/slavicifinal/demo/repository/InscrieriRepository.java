package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Inscrieri;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InscrieriRepository extends JpaRepository<Inscrieri,Long> {

    Inscrieri findInscrieriById(Long id);

    Inscrieri findInscrieriByIduser(Long idUser);

    Inscrieri findInscrieriByNactual(String nactual);

    Inscrieri findInscrieriByCnp(String cnp);

    Inscrieri findInscrieriBySerieid(String serieId);

    Inscrieri findInscrieriByEmail(String email);

    Inscrieri findInscrieriByIdspecializare(String specializare);

    List<Inscrieri> findInscrieriByPromotia(String promotie);

    void deleteById(Long id);


}
