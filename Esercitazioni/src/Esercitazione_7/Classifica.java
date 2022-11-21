package bin.es7;
import static java.lang.Math.random;
import java.util.Scanner;
import java.util.ArrayList;

public class Classifica{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String menu = "";
        ArrayList<Votante> votanti = new ArrayList<>();
        ArrayList<Partecipante> classifica = new ArrayList<>(15); 

        classifica.add(new Partecipante("Kobi Connelly"));
        classifica.add(new Partecipante("Ayoub Mackenzie"));
        classifica.add(new Partecipante("Connor Brooks"));
        classifica.add(new Partecipante("Stefania Dudley"));
        classifica.add(new Partecipante("Duncan Prosser"));
        classifica.add(new Partecipante("Gideon Pham"));
        classifica.add(new Partecipante("Solomon Goulding"));
        classifica.add(new Partecipante("Nolan Mccormick"));
        classifica.add(new Partecipante("Jordana Rose"));
        classifica.add(new Partecipante("Alisha Norris"));
        classifica.add(new Partecipante("Cassia Bonilla"));
        classifica.add(new Partecipante("Ailsa Hogg"));
        classifica.add(new Partecipante("Philippa Curtis"));
        classifica.add(new Partecipante("Kobie Metcalfe"));
        classifica.add(new Partecipante("Leja Cohen"));
        
       // while (!(menu.toUpperCase()).equals("X")){
         //   switch(menu.toUpperCase()){
           //     case "A":
                    System.out.print("\n" + "Arriva un nuovo voto da +39 ");
                    int tempNumb = 300_000_000 + (int) (random() * 100_000_000);
                    System.out.println(tempNumb);
                    Votante tempVotante = new Votante(tempNumb);
                    System.out.println("debug random " + tempVotante.getVoted());
                    votanti.add(tempVotante);
                    System.out.println("\n... Ha votato per " + (classifica.get(tempVotante.getVoted() - 1)).toString());

            //}
        //}
    }
}