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

        // automat generated local date and time stamp
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

    // get student by id
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
            student.setLiceuAnabs(newStudent.getLiceuAnabs());
            student.setLiceuAnemis(newStudent.getLiceuAnemis());
            student.setLiceuBac(newStudent.getLiceuBac());
            student.setLiceuDenumire(newStudent.getLiceuDenumire());
            student.setLiceuDiploma(newStudent.getLiceuDiploma());
            student.setLiceuDurata(newStudent.getLiceuDurata());
            student.setLiceuEmis(newStudent.getLiceuEmis());
            student.setLiceuForma(newStudent.getLiceuForma());
            student.setLiceuJudet(newStudent.getLiceuJudet());
            student.setLiceuLocalit(newStudent.getLiceuLocalit());
            student.setLiceuMatricola(newStudent.getLiceuMatricola());
            student.setLiceuMedia(newStudent.getLiceuMedia());
            student.setLiceuNumar(newStudent.getLiceuNumar());
            student.setLiceuProfil(newStudent.getLiceuProfil());
            student.setLiceuSerie(newStudent.getLiceuSerie());
            student.setLiceuTara(newStudent.getLiceuTara());
            student.setLiceuVizare(newStudent.getLiceuVizare());
            student.setLnastere(newStudent.getLnastere());
            student.setNactual(newStudent.getNactual());
            student.setNationalitate(newStudent.getNationalitate());
            student.setNnastere(newStudent.getNnastere());
            student.setNrMat(newStudent.getNrMat());
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
            student.setUnivAnabs(newStudent.getUnivAnabs());
            student.setUnivAnemis(newStudent.getUnivAnemis());
            student.setUnivDenumire(newStudent.getUnivDenumire());
            student.setUnivDiploma(newStudent.getUnivDiploma());
            student.setUnivDurata(newStudent.getUnivDurata());
            student.setUnivEmis(newStudent.getUnivEmis());
            student.setUnivFacultate(newStudent.getUnivFacultate());
            student.setUnivForma(newStudent.getUnivForma());
            student.setUnivJudet(newStudent.getUnivJudet());
            student.setUnivLocalit(newStudent.getUnivLocalit());
            student.setUnivMatricola(newStudent.getUnivMatricola());
            student.setUnivNumar(newStudent.getUnivNumar());
            student.setUnivSerie(newStudent.getUnivSerie());
            student.setUnivSpecializare(newStudent.getUnivSpecializare());
            student.setUnivTara(newStudent.getUnivTara());
            student.setUnivTaxa(newStudent.getUnivTaxa());
            student.setUnivTitlu(newStudent.getUnivTitlu());
            student.setUnivVizare(newStudent.getUnivVizare());
            student.setVolumul(newStudent.getVolumul());
            student.setWork(newStudent.getWork());


            return studentRepository.save(student);
        }).orElseGet(() -> {
            newStudent.setId(id);
            return studentRepository.save(newStudent);
        });

    }
}