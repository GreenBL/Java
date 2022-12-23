package bin.es11;
import java.util.Scanner;

public class MainRubrica {
    public static void main(String[] args) {
        Rubrica miaRubrica = new Rubrica();
        Scanner input = new Scanner(System.in);
        String nome, cognome, telefono, indirizzo, qualifica, scelta;

        do {
            stampaMenu();
            scelta = input.next();
            switch(scelta) {
                case "a": // inserisci amico
                    System.out.print("Inserisci nome, cognome, telefono e indirizzo: ");
                    nome = input.next();
                    cognome = input.next();
                    telefono = input.next();
                    indirizzo = input.next();
                    miaRubrica.aggiungi(new Amico(nome, cognome, telefono, indirizzo));
                    break;

                case "b": // inserisci collega
                    System.out.print("Inserisci nome, cognome, telefono e qualifica: ");
                    nome = input.next();
                    cognome = input.next();
                    telefono = input.next();
                    qualifica = input.next();
                    miaRubrica.aggiungi(new Collega(nome, cognome, telefono, qualifica));
                    break;

                case "c":
                    miaRubrica.stampaAmici();
                    break;

                case "d":
                    miaRubrica.stampaColleghi();
                    break;

                case "e":
                    miaRubrica.stampa();
                    break;

                case "f":
                    System.out.print("Inserisci nome e cognome del contatto: ");
                    nome = input.next();
                    cognome = input.next();
                    Contatto f = miaRubrica.trova(nome, cognome);
                    if(f != null) {
                        System.out.println(f);
                    }
                    break;

                case "g":
                    miaRubrica.cancella();
                    break;

                case "h":
                    return;

                default:
                    System.out.println("Opzione non valida!");          
            }
        } while(true);
    }
    private static void stampaMenu() {
        String menu = "menu";
        System.out.println(menu);
    }
}
