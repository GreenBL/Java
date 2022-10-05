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
    + Evita di scrivere il nome del package completo
+ Come fa una classe a usare classi che si trovano in altre cartelle/package?
+ Ruolo dell'IDE