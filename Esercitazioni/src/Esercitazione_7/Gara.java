package bin.es7;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.Math.random;

public class Gara{
    public static void main(String args[]){
        Classifica classifica = Classifica.getInstance();
        ArrayList<Votante> votanti = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        String info = "\n4 PER USCIRE\n1. Simula arrivo voto\n2. Stampa voti totali dai numeri\n3. Stampa classifica\n";
        Votante tempVotante = null;
        Partecipante tempPartecipante = null;
        int tempVoto = 0;

        while((menu = scanner.nextInt()) != 4){
            switch(menu){
                case 1:
                    tempVotante = new Votante(347483647 + (int) (random() * 10));
                    if(votanti.contains(tempVotante)){
                        classifica.aggiungiVoto((votanti.get(votanti.indexOf(tempVotante))).vota());
                    } else {
                        votanti.add(tempVotante);
                        classifica.aggiungiVoto(tempVotante.getVoted());
                    }
                    break;
                case 2:
                    System.out.println(votanti);
                    break;
                case 3:
                    classifica.stampaVoti();
                    break;
                default:
            }
        }

    }
}