package repository;

import com.slavicifinal.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByName(String name);
    Student findById ( int id);
    Student findByCNP ( String CNP);
    Student deleteByCNP(String CNP);
    Student deleteById(int id);
}
