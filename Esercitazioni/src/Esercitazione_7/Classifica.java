package bin.es7;
import java.util.ArrayList;

public class Classifica{
    private static Classifica instance;
    private static int SCOREBOARD_SIZE = 15;
    private static ArrayList<Partecipante> scoreboard = new ArrayList<>(SCOREBOARD_SIZE);

    public static Classifica getInstance(){
        if(instance == null){
            instance = new Classifica();
        }
        return instance;
    }

    private Classifica(){
        scoreboard.add(new Partecipante("Kobi Connelly"));
        scoreboard.add(new Partecipante("Ayoub Mackenzie"));
        scoreboard.add(new Partecipante("Connor Brooks"));
        scoreboard.add(new Partecipante("Stefania Dudley"));
        scoreboard.add(new Partecipante("Duncan Prosser"));
        scoreboard.add(new Partecipante("Gideon Pham"));
        scoreboard.add(new Partecipante("Solomon Goulding"));
        scoreboard.add(new Partecipante("Nolan Mccormick"));
        scoreboard.add(new Partecipante("Jordana Rose"));
        scoreboard.add(new Partecipante("Alisha Norris"));
        scoreboard.add(new Partecipante("Cassia Bonilla"));
        scoreboard.add(new Partecipante("Ailsa Hogg"));
        scoreboard.add(new Partecipante("Philippa Curtis"));
        scoreboard.add(new Partecipante("Kobie Metcalfe"));
        scoreboard.add(new Partecipante("Leja Cohen"));
    }
    
    public static void aggiungiVoto(int who){
        (scoreboard.get(who)).addVote();
    }
    public static void stampaVoti(){
        for(Partecipante x: scoreboard){
            System.out.println(x.toString());
        }
    }




    
}