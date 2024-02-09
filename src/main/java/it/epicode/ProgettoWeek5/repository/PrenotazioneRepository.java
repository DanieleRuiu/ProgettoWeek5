package it.epicode.ProgettoWeek5.repository;

import it.epicode.ProgettoWeek5.bean.Edificio;
import it.epicode.ProgettoWeek5.bean.Postazione;
import it.epicode.ProgettoWeek5.bean.Prenotazione;
import it.epicode.ProgettoWeek5.bean.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);

    PrenotazioneRepository prenotazioneRepository = null;


    List<Prenotazione> findByUtente(Utente utente);

    List<Prenotazione> findByPostazione_Edificio(Edificio edificio);

    List<Prenotazione> findByPostazione(Postazione postazione);

    List<Prenotazione> findByDataPrenotazione(LocalDate dataPrenotazione);

    List<Prenotazione> findByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);

    @Query("SELECT p FROM Prenotazione p WHERE p.utente = ?1")
    List<Prenotazione> findByUtenteQuery(Utente utente);
}

