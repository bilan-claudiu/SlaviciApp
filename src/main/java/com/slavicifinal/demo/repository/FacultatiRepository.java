package com.slavicifinal.demo.repository;

        import com.slavicifinal.demo.model.Facultati;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultatiRepository extends JpaRepository<Facultati,Long> {

    Facultati findFacultatiById( Long id);
    Facultati findFacultatiByNume( String nume);
    Facultati findFacultatiByDecan ( String numeDecan);
    Facultati findFacultatiByProdecan1 ( String numeProdecan);
    Facultati findFacultatiByIduser ( Long idUser);

    void deleteById(Long id);
}
