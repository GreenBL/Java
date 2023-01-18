package magazzino;
import java.util.Objects;

public abstract class Articolo implements Comparable<Articolo> {
    private int codice;
    private String desc;
    private String marca;
    private int costo;

    public Articolo(int code, String descript, String brand, int cost) {
        setCode(code);
        setDescription(descript);
        setBrand(brand);
        setCost(cost);
    }

    public void setCode(int code) {
        this.codice = code;
    }

    public void setDescription(String descript) {
        this.desc = descript;
    }

    public void setBrand(String brand) {
        this.marca = brand;
    }

    public void setCost(int cost) {
        if(cost < 0) {
            this.costo = 0;
            return;
        }
        this.costo = cost;
    }

    public int getCode() {
        return this.codice;
    }

    public String getDescription() {
        return this.desc;
    }

    public String getBrand() {
        return this.marca;
    }

    public int getCost() {
        return this.costo;
    }

    public String toString() {
        return getCode() + "\n" + getDescription() + "\n" + getBrand() + "\n" + getCost() + "\n"; 
    }

    public int hashCode() {
        return Objects.hash(getCost());
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Articolo)) {
            return false;
        }
        if(obj == this) {
            return true;
        }
        Articolo altro = (Articolo)obj;
        return (this.getCode() == altro.getCode()) && (this.getDescription().equals(altro.getDescription())) &&
        (this.getBrand().equals(altro.getBrand())) && (this.getCost() == altro.getCost());
    }

    public abstract int compareTo(Articolo altro);

}