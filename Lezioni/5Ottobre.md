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


## `Identificatori`
+ Nomi di metodi, classi, oggetti, variabili, costanti, ecc.
+ Non possono coincidere con le parole chiave di Java
+ Primo carattere A - Z, a - z, _ , $
+ Secondo e successivi A - Z, a - z, _, $, 0 - 9

### Convenzioni sui nomi
+ Nomi significativi
+ Classi
    + Usare il singolare
    + Iniziano con lettera maiuscola
    + Maiuscolo per separare le parole
+ Variabili e metodi
    + Iniziano con lettera minuscola
    + Variabili -> sostantivi (es. numeroLati)
    + Metodi -> verbi (es. stampaPerimetro)
+ Costanti
    + Tutte maiuscole
    + `_` per separare le parole (es: PI_GRECO)
+ Package
    + Tutte minuscole (es: it.lacascia.prg)

## `Tipi di dati primitivi`
+ Soltanto 8 tipi:
    + `interi` : byte, short, int, long
    + `floating point` : float e double
    + `testuale` : char
    + `logico-booleano` : boolean
+ Non ci sono gli unsigned come in C

| Tipo      | Intervallo di rappresentazione |
| --------- | -----------------------------  |
| byte      |   8 bit                        |
| short     |   16 bit                       |
| int       |   32 bit                       |
| long      |   64 bit                       |

## `Letterali interi`
+ Decimali, binari, ottali, esadecimali
+ Esempio:
    ``` java
    byte b = 10; // notazione decimale: b vale 10
    short s = 022; // notazione ottale: s vale 18
    long l = 0x12acd; // notazione esadecimale: l vale 76493

    int i = 1000000000;
    // notazione decimale: i vale 1000000000

    int n = 0b1010...0101
    // notazione binaria: n vale - 1589272251
    ``` 
+ `Nota: assegnazione fuori range -> errore di compilazione`

## Promozioni di tipo
    ``` java
    byte b = 200; // ERRORE

    byte b = 50; // OK

    byte b = 50 * 2; // OK

    byte b = 50;
    b = b * 2; // ERRORE
    ```
Anche se 100 può stare in una variabile di tipo byte potrebbe segnalare un errore!


