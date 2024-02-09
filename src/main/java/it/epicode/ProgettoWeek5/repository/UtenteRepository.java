package it.epicode.ProgettoWeek5.repository;

import it.epicode.ProgettoWeek5.bean.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {


    Utente findByUsername(String username);

    Utente findByEmail(String email);
@Query("SELECT u FROM Utente u WHERE u.username = ?1")
    Utente findByUsernameQuery(String username);


}