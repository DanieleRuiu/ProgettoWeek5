package it.epicode.ProgettoWeek5.repository;

import it.epicode.ProgettoWeek5.bean.Postazione;
import it.epicode.ProgettoWeek5.bean.TipoPostazione;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {


    List<Postazione> findByTipo(TipoPostazione tipo);



    List<Postazione> findByEdificio(String edificio);


//    @Query("SELECT p FROM Postazione p WHERE p.tipo = ?1")
//    List<Postazione> findByTipoQuery(TipoPostazione tipo);


}