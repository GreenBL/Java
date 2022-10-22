import java.util.Scanner;
import java.util.ArrayList;

public class InteractiveList{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String menu = "";
        ArrayList<Persona> lista = new ArrayList<>();
        String tempName = "";
        String tempSurname = "";
        int tempAge = 0;
        int viewIndex = 0; // non essenziale
        boolean found = false;
        String info = "1. Inserisci Persona\n2. Cerca Persona per nome\n" + 
                      "3. Visualizza la lista\n4. Cancella la lista\n5. Esci dal programma";
        System.out.println(info);
        while(!((menu = scanner.next()).equals("5"))){
            switch(menu){
                case "1": // inserisci nuova persona
                    System.out.print("Inserisci il nome: ");
                    tempName = scanner.next();
                    System.out.print("\nInserisci il cognome: ");
                    tempSurname = scanner.next();
                    System.out.print("\nInserisci l'età: ");
                    if(scanner.hasNextInt()){
                        tempAge = scanner.nextInt();
                    } else {
                        System.out.println("Dato \"età\" non valido!");
                        System.out.println("Si prega di riprovare:\n");
                        scanner.next();
                        break;
                    }
                    lista.add(new Persona(tempName, tempSurname, tempAge));
                    System.out.println("Persona correttamente inserita nella lista!");
                    break;
                 case "2": // cerca
                    found = false;
                    System.out.print("\nInserisci il nome da cercare: ");
                    tempName = scanner.next();
                    for(Persona x: lista){
                        if((x.name).equals(tempName)){
                            found = true;
                        }
                    }
                    if(found == false){
                        System.out.println("Persona non trovata nella lista!");
                    } else {
                        System.out.println(tempName + " è presente nella lista!");
                    }
                    break;
                case "3": // stampa lista
                    if(lista.size() == 0){
                        System.out.println("La lista è vuota!");
                        break;
                    }
                    viewIndex = 0; // per stampare l'indice sopra 
                    System.out.println(""); // migliora la visibilità
                    for(Persona x: lista){
                        System.out.println((viewIndex++) +".\n"+ x.toString());
                    }
                    break;
                case "4": // clear list
                    lista.clear();
                    break;
                default:
                    System.out.println("\"" + menu + "\"" + " non è una scelta valida!");
            }
            System.out.println("\n" + info);
        }
    }
}