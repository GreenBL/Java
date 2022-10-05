# Programmazione 05/10/22
---
## Costruttori
+ Stesso nome della classe
+ Nessun tipo di ritorno
+ Possono avere parametri
+ Ce ne possono essere diversi per la stessa classe
+ Chiamati automaticamente in fase di istanziazione


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
    punto1 = new Punto(); // Errore ???