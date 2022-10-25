package bin.es4;
import java.util.ArrayList;

public class Principale{
    public static void main(String args[]){
        ArrayList<Persona> miaLista = new ArrayList<>();
        Persona pers1 = new Persona("Gianmarco", "Parete", 25);
        Persona pers2 = new Persona("Stefano", "Congo", 61);
        Persona pers3 = new Persona("Mario", "Soprano", 45);
        Persona persDead = new Persona("Rosario", "Iodio", 104);
        miaLista.add(pers1);
        miaLista.add(pers2);
        miaLista.add(pers3);
        miaLista.add(persDead);
        System.out.printf("Dimensione lista = %5d\n", miaLista.size());

        System.out.println(miaLista.get(0).toString());

        // E' morto Rosario Iodio
        miaLista.remove(3);
        System.out.printf("Dimensione lista dopo remove = %5d\n", miaLista.size());

        for(int i = 0; i < miaLista.size(); ++i){
            //System.out.println(miaLista); // stampa tutti gli elementi nella lista, ma faccio come da consegna (non ha bisogno di for)
            System.out.println("\n    Elemento " + (i+1));
            System.out.println(miaLista.get(i).toString());
        }

        miaLista.clear();
        System.out.printf("Dimensione lista [cancellata] = %5d\n", miaLista.size());
    }
}