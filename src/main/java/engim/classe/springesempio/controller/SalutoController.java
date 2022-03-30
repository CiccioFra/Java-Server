package engim.classe.springesempio.controller;

import java.util.concurrent.atomic.AtomicLong;

import engim.classe.springesempio.model.Saluto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // @RestController fa capire a Spring è una classe controller di un server
public class SalutoController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    //ogni volta che chiamo un server creo un processo che esegue un processo
    //la variabile AtomicLong/Int/ecc gestisce più chiamate sullo stessa variabile,
    //mette dei monitor: variabile di stato che segna se la variabile è già in uso, ha una coda di accesso alla variabile

    @GetMapping("/greeting")    // @GetMapping mettiamo l'url dove noi vogliamo consultare sta roba
    public Saluto greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
            // passiamo i valori per la API
        return new Saluto(counter.incrementAndGet(), String.format(template, name));
        // String.format -> posso mettere %s per completare dopo, così è scritto più comodo ma uguale
        //
    }
}

