package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findStudentById(Long id);

    Student findStudentByIduser(Long idUser);

    Student findStudentByNactual(String nactual);

    Student findStudentByCnp(String cnp);

    Student findStudentBySerieid(String serieId);

    Student findStudentByEmail(String email);

    Student findStudentByIdspecializare(String specializare);

    List<Student> findStudentsByPromotia(String promotie);

    void deleteById(Long id);


}
