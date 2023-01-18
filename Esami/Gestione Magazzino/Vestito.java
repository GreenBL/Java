package magazzino;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Vestito extends Articolo {
        private String taglia;
        private static final String[] sizeTable = {"XS", "S", "M", "L", "XL", "XXL"};
        private static final ArrayList<String> listTable = new ArrayList<>();
        default {
            Collections.addAll(listTable, sizeTable);
        }

    public Vestito() throws DressSizeException {
        super(0, "default-dress", "default-dressbrand", 0);
        setTaglia("XS");
    }

    public Vestito(String size, int code, String descript, String brand, int cost) throws DressSizeException {
        super(code, descript, brand, cost);
        setTaglia(size);
    }

    public void setTaglia(String size) throws DressSizeException {
        size = size.toUpperCase();
        if(!(listTable.contains(size))) {
            throw new DressSizeException();
        }
        this.taglia = size;
    }

    public String getTaglia() {
        return this.taglia;
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
        Vestito altro = (Vestito)obj;
        return super.equals(obj) && this.getTaglia().equals(altro.getTaglia());
    }

    public String toString() {
        return "Vestito\n" + this.getTaglia() + "\n" + super.toString();
    }
}

class DressSizeException extends Exception {
    public DressSizeException() {
        super("invalid dress size (XS, S, M, L, XL, XXL)");
    }
}