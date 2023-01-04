package prg.esame3;
import java.util.Scanner;

public class MacchinaCaffe implements Pulizia {
    private String model;
    private String type;
    private final static String CIALDE = "cialde";
    private final static String CAPSULE = "capsule";
    private int id;

    public MacchinaCaffe(String modello, String tipo, int identificativo) {
        setModel(modello);
        try {
            setType(tipo);
        } catch (InvalidCoffeeContainerException e) {
            System.out.println("si è verificato un problema.");
            e.printStackTrace();
        }
        setID(identificativo);
    }

    public void setModel(String modello) {
        this.model = modello;
    }

    public void setType(String tipo) throws InvalidCoffeeContainerException {
        if(!(tipo.toLowerCase().equals(CIALDE) || tipo.toLowerCase().equals(CAPSULE))) {
            throw new InvalidCoffeeContainerException();
        } else {
            this.type = tipo.toLowerCase();
        }
    }

    public void setID(int identificativo) {
        this.id = identificativo;
    }

    @Override
    public void pulisci() {
        System.out.println("Quante erogazioni a vuoto devo fare?");
    }
}

class InvalidCoffeeContainerException extends Exception {
    public InvalidCoffeeContainerException() {
        super("invalid coffee container type");
    }
}