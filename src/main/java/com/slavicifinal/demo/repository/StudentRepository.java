package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

    Student findByName(String name);
    Student findStudentById ( Long id);
    Student findByCNP ( Long CNP);
    void deleteStudentByCNP(Long CNP);
    void deleteById(Long id);
}

