package bin.es9;
import bin.es7.Abbonato;
import bin.es7.AbbonatoPremium;

import bin.es5.Persona;
import bin.es6.Input;
import java.util.ArrayList;
import java.util.Scanner;

public class AbbonatoEterogeneo{
    public static void main(String args[]){
        ArrayList<Abbonato> clienti = new ArrayList<Abbonato>();
        Input input = Input.getInstance();
        Scanner scanner = new Scanner(System.in);
        String menu;
            while(!(menu = input.nextChoice()).equals("0")){
                switch(menu){
                    case "1": // Stampa lista degli abbonati
                        for(Persona p: clienti){
                            System.out.println(p.toString());
                        }
                        break;
                    case "2": // Aggiungi un abbonato/abbonato premium
                        String tempName = input.next("name");
                        String tempSurname = input.next("surname");
                        int tempAge = input.nextNumber(0,100);
                        System.out.print("\nPercentuale di sconto da assegnare all'abbonato: ");
                        double tempSconto = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("%");
                        System.out.println("Tipologia di abbonato:\n1. Standard\n2. Premium ");
                        switch(input.nextChoice()){
                            case "1":
                                clienti.add(new Abbonato(tempName, tempSurname, tempAge, tempSconto));
                                break;
                            case "2":
                                clienti.add(new AbbonatoPremium(tempName, tempSurname, tempAge, tempSconto));
                                break;
                            default:
                                System.out.println("Assumo abbonato standard");
                                clienti.add(new AbbonatoPremium(tempName, tempSurname, tempAge, tempSconto));
                        }
                        break;
                    case "3": // Elimina un abbonato
                        break;
                    case "4": // Inserisci acquisto cliente e calcola sconto
                        System.out.println("Quale cliente vuole fare l'acquisto?");
                        int tempIndex = 0;
                        tempIndex = scanner.nextInt() - 1;
                        clienti.get(tempIndex);
                        System.out.println("Cliente: " + (clienti.get(tempIndex)).toString());
                        scanner.nextLine();
                        System.out.print("Inserire spesa: ");
                        double tempSpesa = scanner.nextDouble();
                        double tempSpesaScontata = (clienti.get(tempIndex)).acquista(tempSpesa);
                        System.out.println("Il cliente ha speso " + tempSpesaScontata + " Su una spesa di " + tempSpesa); 
                        break;
                    case "5": // Spesa complessiva, bonus cliente
                        break;
                    default:
                }
            }
    }
}