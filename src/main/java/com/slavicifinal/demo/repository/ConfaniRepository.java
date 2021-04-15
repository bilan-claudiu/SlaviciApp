package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Confani;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConfaniRepository extends JpaRepository<Confani, Long> {

    Confani findConfaniById(Long id);

   List< Confani> findConfaniByPromotie(String promotie);


    Confani findConfaniBySpecializare(String specializare);

    Confani findConfaniByAnstudiu(int anStudiu);

    Confani findConfaniByTipdisciplina(int tipDisciplina);

    Confani findConfaniByFormaex(int formaExamen);

    Confani findConfaniByIduser(Long idUser);

    void deleteById(Long id);
}
