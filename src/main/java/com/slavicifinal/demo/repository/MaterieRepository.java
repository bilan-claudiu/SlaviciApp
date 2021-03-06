package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Materie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterieRepository extends JpaRepository<Materie,Long>{

    Materie findMaterieById(Long id);
    Materie findMaterieByIduser(Long id);
    void deleteById(Long id);


}
