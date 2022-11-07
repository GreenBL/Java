package bin.es6;
import java.util.Scanner;
import java.util.ArrayList;
import bin.es3.Persona;

public class PersonaList{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Input input = Input.getInstance();
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
        while(!((menu = input.nextChoice()).equals("5"))){
            switch(menu){
                case "1": // inserisci nuova persona
                    lista.add(new Persona(input.next("name"), input.next("surname"), input.nextNumber(0, 100)));
                    System.out.println("Persona correttamente inserita nella lista!");
                    break;
                 case "2": // cerca
                    found = false;
                    System.out.print("\nRicerca per nome\n");
                    tempName = input.next("name");
                    for(Persona x: lista){
                        if((x.name).equals(tempName)){
                            found = true;
                        }
                    }
                    if(found == false){
                        System.out.println("Persona non trovata nella lista!");
                    } else {
                        System.out.println(tempName + " presente nella lista!");
                    }
                    break;
                case "3": // stampa lista
                    if(lista.size() == 0){
                        System.out.println("La lista è vuota!");
                        break;
                    }
                    viewIndex = 1; // per stampare l'indice sopra 
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