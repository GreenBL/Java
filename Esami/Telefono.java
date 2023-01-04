package prg.esame2;
import java.util.Objects;

public class Telefono implements Comparable<Telefono> {
    private int costo;
    private String modello;
    private int annoUscita;
    private static int globalID = 990125;
    private int localID;

    public Telefono() {
        this("DEFAULT", 1971, 999);
    }

    public Telefono(String model, int year, int cost) {
        ++globalID;
        localID = globalID;
        setModel(model);
        setYear(year);
        setCost(cost);
    }

    public void setModel(String model) {
        this.modello = model;
    }

    public String getModel() {
        return this.modello;
    }

    public void setYear(int year) {
        this.annoUscita = year;
    }

    public int getYear() {
        return this.annoUscita;
    }

    public void setCost(int cost) {
        this.costo = cost;
    }

    public int getCost() {
        return this.costo;
    }

    public int getID() {
        return this.localID;
    }

    public boolean equals(Object obj) {
        Telefono altro = (Telefono)obj;
        return this.getModel().equals(altro.getModel()) && this.getYear() == altro.getYear();
    }

    public int hashCode() {
        return Objects.hash(getModel(), getYear());
    }

    public int compareTo(Telefono altro) {
        if(this.getCost() == altro.getCost()) {
            return 0;
        }

        if(this.getCost() < altro.getCost()) {
            return -1;
        }
        
        return 1;       
    }

    public String toString() {
        return getModel() + " // $ " + getCost() + "{ ID=" + getID() + " }";
    }
}
