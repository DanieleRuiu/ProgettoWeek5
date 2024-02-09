package it.epicode.ProgettoWeek5.bean;

import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
@Table(name = "prenotazione")
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataPrenotazione;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    @ManyToOne
        @JoinColumn(name = "postazione_id")
    private Postazione postazione;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(LocalDate dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Postazione getPostazione() {
        return postazione;
    }

    public void setPostazione(Postazione postazione) {
        this.postazione = postazione;
    }
    public Prenotazione() {
    }
    public Prenotazione(Long id, LocalDate dataPrenotazione, Utente utente, Postazione postazione) {
        this.id = id;
        this.dataPrenotazione = dataPrenotazione;
        this.utente = utente;
        this.postazione = postazione;
    }



    @Override
public String toString() {
        return "Prenotazione [id=" + id + ", dataPrenotazione=" + dataPrenotazione + ", utente=" + utente + ", postazione=" + postazione + "]";
    }


}