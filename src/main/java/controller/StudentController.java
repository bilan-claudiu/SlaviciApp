package controller;


import com.slavicifinal.demo.model.Student;
import service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/adaugaStudent")
    public Student addNewStudent(@RequestBody Student newStudent) {
        return studentService.saveStudent(newStudent);
    }

    @PostMapping("/adauga-grup")
    public List<Student> addNewStudents(@RequestBody List<Student> studentList) {
        return studentService.saveStudenti(studentList);
    }


    @GetMapping("/lista-studenti")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/cautaNume/{nume}")
    public Student getStudentByName(@PathVariable String name) {
        return studentService.getStudentByName(name);
    }

    @GetMapping("/cautaCNP/{CNP}")
    public Student getStudentByCNP(@PathVariable String CNP) {
        return studentService.getStudentByCNP(CNP);
    }

    @PatchMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/stergeId")
    public Student deleteStudentById(@PathVariable int id) {
        return studentService.deleteStudentById(id);
    }

    @DeleteMapping("/stergeCNP")
    public Student deleteStudentByCNP(@PathVariable String CNP) {
        return studentService.getStudentByCNP(CNP);
    }


}

