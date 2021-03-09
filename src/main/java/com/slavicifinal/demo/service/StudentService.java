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
            student.setDataelid(newStudent.getDataelid());
            student.setDataexpid(newStudent.getDataexpid());
            student.setDezabilitati(newStudent.getDezabilitati());
            student.setDnastere(newStudent.getDnastere());
            student.setDomiciliua(newStudent.getDomiciliua());
            student.setDomiciliuc(newStudent.getDomiciliuc());
            student.setDomiciliuj(newStudent.getDomiciliuj());
            student.setDomiciliul(newStudent.getDomiciliul());
            student.setDomiciliut(newStudent.getDomiciliut());
            student.setEliberatid(newStudent.getEliberatid());
            student.setEmail(newStudent.getEmail());
            student.setEtnie(newStudent.getEtnie());
            student.setExportweb(newStudent.getExportweb());
            student.setForma(newStudent.getForma());
            student.setIdspecializare(newStudent.getIdspecializare());
            student.setIduser(newStudent.getIduser());
            student.setInformare(newStudent.getInformare());
            student.setJnastere(newStudent.getJnastere());
            student.setLiceu_anabs(newStudent.getLiceu_anabs());
            student.setLiceu_anemis(newStudent.getLiceu_anemis());
            student.setLiceu_bac(newStudent.getLiceu_bac());
            student.setLiceu_denumire(newStudent.getLiceu_denumire());
            student.setLiceu_diploma(newStudent.getLiceu_diploma());
            student.setLiceu_durata(newStudent.getLiceu_durata());
            student.setLiceu_emis(newStudent.getLiceu_emis());
            student.setLiceu_forma(newStudent.getLiceu_forma());
            student.setLiceu_judet(newStudent.getLiceu_judet());
            student.setLiceu_localit(newStudent.getLiceu_localit());
            student.setLiceu_matricola(newStudent.getLiceu_matricola());
            student.setLiceu_media(newStudent.getLiceu_media());
            student.setLiceu_numar(newStudent.getLiceu_numar());
            student.setLiceu_profil(newStudent.getLiceu_profil());
            student.setLiceu_serie(newStudent.getLiceu_serie());
            student.setLiceu_tara(newStudent.getLiceu_tara());
            student.setLiceu_vizare(newStudent.getLiceu_vizare());
            student.setLnastere(newStudent.getLnastere());
            student.setNactual(newStudent.getNactual());
            student.setNationalitate(newStudent.getNationalitate());
            student.setNnastere(newStudent.getNnastere());
            student.setNr_mat(newStudent.getNr_mat());
            student.setNrid(newStudent.getNrid());
            student.setObservatii(newStudent.getObservatii());
            student.setPmama(newStudent.getPmama());
            student.setPoza(newStudent.getPoza());
            student.setPrenume(newStudent.getPrenume());
            student.setPromotia(newStudent.getPromotia());
            student.setPtata(newStudent.getPtata());
            student.setSerieid(newStudent.getSerieid());
            student.setSexul(newStudent.getSexul());
            student.setSocial(newStudent.getSocial());
            student.setStagiumilitar(newStudent.getStagiumilitar());
            student.setTelefon(newStudent.getTelefon());
            student.setTipid(newStudent.getTipid());
            student.setTipstudent(newStudent.getTipstudent());
            student.setTnastere(newStudent.getTnastere());
            student.setUniv_anabs(newStudent.getUniv_anabs());
            student.setUniv_anemis(newStudent.getUniv_anemis());
            student.setUniv_denumire(newStudent.getUniv_denumire());
            student.setUniv_diploma(newStudent.getUniv_diploma());
            student.setUniv_durata(newStudent.getUniv_durata());
            student.setUniv_emis(newStudent.getUniv_emis());
            student.setUniv_facultate(newStudent.getUniv_facultate());
            student.setUniv_forma(newStudent.getUniv_forma());
            student.setUniv_judet(newStudent.getUniv_judet());
            student.setUniv_localit(newStudent.getUniv_localit());
            student.setUniv_matricola(newStudent.getUniv_matricola());
            student.setUniv_numar(newStudent.getUniv_numar());
            student.setUniv_serie(newStudent.getUniv_serie());
            student.setUniv_specializare(newStudent.getUniv_specializare());
            student.setUniv_tara(newStudent.getUniv_tara());
            student.setUniv_taxa(newStudent.getUniv_taxa());
            student.setUniv_titlu(newStudent.getUniv_titlu());
            student.setUniv_vizare(newStudent.getUniv_vizare());
            student.setVolumul(newStudent.getVolumul());
            student.setWork(newStudent.getWork());


            return studentRepository.save(student);
        }).orElseGet(() -> {
            newStudent.setId(id);
            return studentRepository.save(newStudent);
        });

    }
}