package it.epicode.ProgettoWeek5.bean;

import jakarta.persistence.*;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "utente")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String nomeCompleto;
    private String email;

    @ManyToMany
    @JoinTable(name = "prenotazione",
            joinColumns = @JoinColumn(name = "utente_id"),
            inverseJoinColumns = @JoinColumn(name = "postazione_id"))

    private List<Postazione> postazioni;


//    private final List<Prenotazione> prenotazioni;

public Utente() {}
    public Utente(Long id, String username, String nomeCompleto, String email) {
        this.id = id;
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
//        this.prenotazioni = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNomeCompleto() {

        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {

        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utente [id=" + id + ", username=" + username + ", nomeCompleto=" + nomeCompleto + ", email=" + email + "]";
    }

//    public List<Prenotazione> getPrenotazioni() {
//        return prenotazioni;
//    }


//    public void addPrenotazione(Prenotazione p) {
//        this.prenotazioni.add(p);
//    }

    public boolean isPostazioneDisponibile(Postazione postazione, Date data) {

        return true;
    }
}