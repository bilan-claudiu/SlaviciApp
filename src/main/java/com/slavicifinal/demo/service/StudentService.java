package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Specializari;
import com.slavicifinal.demo.model.Student;
import com.slavicifinal.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> saveStudents(List<Student> studentList) {
        return studentRepository.saveAll(studentList);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findStudentById(id);
    }

    public Student getStudentByIduser(Long idUser) {
        return studentRepository.findStudentByIduser(idUser);
    }

    public Student getStudentByCnp(String cnp) {
        return studentRepository.findStudentByCnp(cnp);
    }

    public Student getStudentByNume(String nactual) {
        return studentRepository.findStudentByNactual(nactual);
    }

    public Student getStudentBySerieId(String serieId) {
        return studentRepository.findStudentBySerieid(serieId);
    }

    public Student getStudentByEmail(String email) {
        return studentRepository.findStudentByEmail(email);
    }

    public Student getStudentByIdSpecializare(String idSpecializare) {
        return studentRepository.findStudentByIdspecializare(idSpecializare);
    }

    public List<Student> getStudentsByPromotie(String promotia) {
        return studentRepository.findStudentsByPromotia(promotia);
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteStudentById(id);
    }


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
