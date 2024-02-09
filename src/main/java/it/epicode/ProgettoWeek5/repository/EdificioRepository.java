package it.epicode.ProgettoWeek5.repository;

import it.epicode.ProgettoWeek5.bean.Edificio;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {


    EntityManager session = null;

    Edificio findByNome(String nome);

    Edificio findByCitta(String citta);

    Edificio findByIndirizzo(String indirizzo);

    @Query("FROM Edificio WHERE nome = :nome")
    List<Edificio> findWithCustomQuery(String nome);
}
