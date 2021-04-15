package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Universitati;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversitatiRepository extends JpaRepository<Universitati, Long> {

    Universitati findUniversitatiById(Long id);

    Universitati findUniversitatiByNume(String nume);

    Universitati findUniversitatiBySpecializarea(int specializarea);

    Universitati findUniversitatiByNumespec(String numespec);


    void deleteById(Long id);
}
