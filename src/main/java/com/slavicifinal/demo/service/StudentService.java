package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Student;
import com.slavicifinal.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {

        LocalDate now = LocalDate.now();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        student.setDatamod(now);
        student.setTimemod(sdf.format(timestamp));

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
        studentRepository.deleteById(id);
    }


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Student newStudent, Long id) {
        return studentRepository.findById(id).map(student -> {
           //automat generation of date and timestamp
            LocalDate now = LocalDate.now();
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            student.setDatamod(now);
            student.setTimemod(sdf.format(timestamp));

            //update fields for student
            student.setAnfinal(newStudent.getAnfinal());
            student.setAnlic(newStudent.getAnlic());
            student.setAnpregatitor(newStudent.getAnpregatitor());
            student.setCetatenie(newStudent.getCetatenie());
            student.setCivila(newStudent.getCivila());
            student.setCnp(newStudent.getCnp());


            return studentRepository.save(student);
        }).orElseGet(() -> {
            newStudent.setId(id);
            return studentRepository.save(newStudent);
        });

    }
}