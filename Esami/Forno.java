package prg.esame3;
import java.util.Scanner;

public class Forno implements Pulizia {
    private String model;
    private int temp;
    private int id;

    public Forno(String modello, int temperatura, int identificativo) {
        setModel(modello);
        setTemp(temperatura);
        setID(identificativo);
    }

    public void setModel(String modello) {
        this.model = modello;
    }

    public void setTemp(int temperatura) {
        this.temp = temperatura;
    }

    public void setID(int identificativo) {
        this.id = identificativo;
    }

    @Override
    public void pulisci() {
        System.out.println("A quale temperatura devo pulire?");
    }
}