# Programmazione 05/10/22
---
## Costruttori
+ Stesso nome della classe
+ Nessun tipo di ritorno
+ Possono avere parametri
+ Ce ne possono essere diversi per la stessa classe
+ Chiamati automaticamente in fase di istanziazione
``` java
    // Esempio
    public class Punto {
        public Punto(int a, int b){
            x = a;
            y = b;
        }
        public int x;
        public int y;
    }

    // main
    Punto punto1; // dichiarazione
    punto1 = new Punto(5, 6); // istanza
    punto1 = new Punto(); // Errore ??? (richiede argomenti)
``` 
``` java
    // Esempio con più costruttori
    public class Punto{
        public Punto(){
            // Questo costruttore non fa niente
        }
        public Punto(int a, int b){
            x = a;
            y = b;
        }
        public int x;
        public int y;
    }
```
### Costruttore di default
+ Inserito automaticamente dal compilatore
+ Solo se il programmatore non ne ha fornito uno esplicitamente!
---
## Packages
+ Organizzare il codice in cartelle
+ Il comando import
    + Evita di scrivere il nome del package completo (es. java.lang.String)
    + java.lang è sempre importato automaticamente dal compilatore
    + es: import java.util.ArrayList
+ Come fa una classe a usare classi che si trovano in altre cartelle/package?
+ Ruolo dell'IDE
---
## Altri componenti
+ Interfacce
    + Strumento utile per la progettazione
+ Enumerazioni
+ Annotazioni
+ Moduli (J9)
    + es: java.base
    + Si usa per progettare programmi di dimensioni elevate
+ Inizializzatori
+ Classi innestate
+ Espressioni lambda (J8)
    + "Funzioni senza nome"
---
# Identificatori, tipi di dati e array
+ Lo stile di codifica è molto analogo al linguaggio C. **Java è un linguaggio a schema libero.**
+ Ovviamente la tabulazione non è necessaria (se vuoi criptare un programma)
+ E' case sensitive come C
+ I commenti sono analoghi a C ma c'è una novità:
    + Javadoc /** ... */
        + I commenti Javadoc messi in una determinata posizione generano documentazione in HTML.


## Identificatori
+ Nomi di metodi, classi, oggetti, variabili, costanti, ecc.
+ Non possono coincidere con le parole chiave di Java
+ Primo carattere A - Z, a - z, _ , $
+ Secondo e successivi A - Z, a - z, _, $, 0 - 9



