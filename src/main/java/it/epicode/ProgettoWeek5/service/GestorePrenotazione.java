package it.epicode.ProgettoWeek5.service;


//crea un controller per la gestione delle prenotazioni

import it.epicode.ProgettoWeek5.bean.Edificio;
import it.epicode.ProgettoWeek5.bean.Postazione;
import it.epicode.ProgettoWeek5.bean.Prenotazione;
import it.epicode.ProgettoWeek5.bean.Utente;
import it.epicode.ProgettoWeek5.repository.EdificioRepository;
import it.epicode.ProgettoWeek5.repository.PostazioneRepository;
import it.epicode.ProgettoWeek5.repository.PrenotazioneRepository;
import it.epicode.ProgettoWeek5.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service


public class GestorePrenotazione {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;
    @Autowired
    private PostazioneRepository postazioneRepository;
    @Autowired
    private UtenteRepository utenteRepository;
    @Autowired
    private EdificioRepository edificioRepository;

    public List<Prenotazione> findAllPrenotazioni() {
        return prenotazioneRepository.findAll();
    }

    public Prenotazione findPrenotazioneById(Long id) {
        return prenotazioneRepository.findById(id).orElse(null);
    }

    public Prenotazione savePrenotazione(Prenotazione p) {
        return prenotazioneRepository.save(p);
    }

    public void deletePrenotazione(Long id) {
        prenotazioneRepository.deleteById(id);
    }

    public List<Prenotazione> findPrenotazioniByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione) {
        return prenotazioneRepository.findByPostazioneAndDataPrenotazione(postazione, dataPrenotazione);
    }

    public List<Prenotazione> findPrenotazioniByUtente(Utente utente) {
        return prenotazioneRepository.findByUtente(utente);
    }

//    public List<Prenotazione> findPrenotazioniByEdificio(Edificio edificio) {
//        return prenotazioneRepository.findByPostazione_Edificio(edificio);
//    }

    public List<Prenotazione> findPrenotazioniByPostazione(Postazione postazione) {
        return prenotazioneRepository.findByPostazione(postazione);
    }

    public List<Prenotazione> findPrenotazioniByDataPrenotazione(LocalDate dataPrenotazione) {
        return prenotazioneRepository.findByDataPrenotazione(dataPrenotazione);
    }

    public List<Prenotazione> findPrenotazioniByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione) {
        return prenotazioneRepository.findByUtenteAndDataPrenotazione(utente, dataPrenotazione);
    }



    public void menuPrenotazioni() {
        System.out.println("1. Visualizza tutte le prenotazioni");
        System.out.println("2. Visualizza prenotazioni per postazione e data");
        System.out.println("3. Visualizza prenotazioni per utente");
        System.out.println("4. Visualizza prenotazioni per edificio");
        System.out.println("5. Visualizza prenotazioni per postazione");
        System.out.println("6. Visualizza prenotazioni per data");
        System.out.println("7. Visualizza prenotazioni per utente e data");
        System.out.println("8. Inserisci nuova prenotazione");
        System.out.println("9. Modifica prenotazione");
        System.out.println("10. Cancella prenotazione");
        System.out.println("11. Esci");
    }

public void visualizzaTuttePrenotazioni() {
        List<Prenotazione> prenotazioni = findAllPrenotazioni();
        for (Prenotazione p : prenotazioni) {
            System.out.println(p);
        }
    }

    public void visualizzaPrenotazioniPerPostazioneEData(Postazione postazione, LocalDate dataPrenotazione) {
        List<Prenotazione> prenotazioni = findPrenotazioniByPostazioneAndDataPrenotazione(postazione, dataPrenotazione);
        for (Prenotazione p : prenotazioni) {
            System.out.println(p);
        }
    }

    public void visualizzaPrenotazioniPerUtente(Utente utente) {
        List<Prenotazione> prenotazioni = findPrenotazioniByUtente(utente);
        for (Prenotazione p : prenotazioni) {
            System.out.println(p);
        }
    }

//    public void visualizzaPrenotazioniPerEdificio(Edificio edificio) {
//        List<Prenotazione> prenotazioni = findPrenotazioniByEdificio(edificio);
//        for (Prenotazione p : prenotazioni) {
//            System.out.println(p);
//        }
//    }

    public void visualizzaPrenotazioniPerPostazione(Postazione postazione) {
        List<Prenotazione> prenotazioni = findPrenotazioniByPostazione(postazione);
        for (Prenotazione p : prenotazioni) {
            System.out.println(p);
        }
    }

    public void visualizzaPrenotazioniPerData(LocalDate dataPrenotazione) {
        List<Prenotazione> prenotazioni = findPrenotazioniByDataPrenotazione(dataPrenotazione);
        for (Prenotazione p : prenotazioni) {
            System.out.println(p);
        }
    }

    public void visualizzaPrenotazioniPerUtenteEData(Utente utente, LocalDate dataPrenotazione) {
        List<Prenotazione> prenotazioni = findPrenotazioniByUtenteAndDataPrenotazione(utente, dataPrenotazione);
        for (Prenotazione p : prenotazioni) {
            System.out.println(p);
        }
    }

    public void inserisciNuovaPrenotazione(Prenotazione p) {
        savePrenotazione(p);
    }

    public void modificaPrenotazione(Prenotazione p) {
        savePrenotazione(p);
    }

    public void cancellaPrenotazione(Long id) {
        deletePrenotazione(id);
    }

    public void esci() {
        System.exit(0);
    }

}