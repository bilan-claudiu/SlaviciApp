package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Absolventi;
import com.slavicifinal.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AbsolventiRepository extends JpaRepository<Absolventi, Long> {
    Absolventi findAbsolventiById (Long id);
    Absolventi findAbsolventiByPromotia(String promotia);
    Absolventi findAbsolventiByCnp (String cnp);
    Absolventi findAbsolventiByIdpromotie(Long idpromotie);
    Absolventi findAbsolventiByNume(String nume);
    List<Absolventi> findAbsolventisByPromotia(String promotie);
    void deleteById(Long id);
}
