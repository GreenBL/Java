package magazzino;

public class Scarpa extends Articolo {
    private int misura;

    public Scarpa() throws ShoeSizeException {
        super(0, "default-shoe", "default-shoebrand", 0);
        setMisura(34);
    }

    public Scarpa(int size, int code, String descript, String brand, int cost) throws ShoeSizeException {
        super(code, descript, brand, cost);
        setMisura(size);
    }

    public void setMisura(int size) throws ShoeSizeException {
        if(size < 34 || size > 48) {
            throw new ShoeSizeException();
        }
        this.misura = size;
    }

    public int getMisura() {
        return this.misura;
    }

    public int compareTo(Articolo altro) {
        if(this.getCost() > altro.getCost()) {
            return 1;
        }
        
        if(this.getCost() == altro.getCost()) {
            return 0;
        }
        return -1;
    }
    
    public boolean equals(Object obj) {
        Scarpa altro = (Scarpa)obj;
        return super.equals(obj) && this.getMisura() == altro.getMisura();
    }

    public String toString() {
        return "Scarpa\n" + this.getMisura() + "\n" + super.toString();
    }
}

class ShoeSizeException extends Exception {
    public ShoeSizeException() {
        super("invalid shoe size range (34 - 48)");
    }
}