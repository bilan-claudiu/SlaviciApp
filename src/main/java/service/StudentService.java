package service;


import com.slavicifinal.demo.model.Student;
import repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

    public List<Student> saveStudenti(List<Student> newStudenti) {
        return studentRepository.saveAll(newStudenti);
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id);
    }

    public Student getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    public Student getStudentByCNP(String CNP) {
        return studentRepository.findByCNP(CNP);
    }

    public Student deleteStudent(String CNP) {
        return studentRepository.deleteByCNP(CNP);
    }

    public Student deleteStudentById(int id) {
        return studentRepository.deleteById(id);
    }

    public List<Student> getAllStudents (){
        return studentRepository.findAll();
    }


    public Student updateStudent(Student student) {
        Student existingStudent = studentRepository.findById(student.getId());
        existingStudent.setNume(student.getNume());
        existingStudent.setPrenume((student.getPrenume()));
        existingStudent.setAn(student.getAn());
        existingStudent.setCNP(student.getCNP());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setSpecializare(student.getSpecializare());
        return studentRepository.save(existingStudent);
    }


}
