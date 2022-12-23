package bin.es11;
import java.util.ArrayList;

public class VectorInteger implements Comparable<VectorInteger> {
    private ArrayList<Integer> dati;

    public VectorInteger(){
        this(10);
    }

    public VectorInteger(int size) {
        dati = new ArrayList<>();
        for (int i = 0; i < size; ++i) {
            dati.add(0);
        }
    }

    public void set(int index, int value) {
        if(index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        dati.set(index, value);
    }

    public int get(int index) {
        if(index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return dati.get(index);
    }

    public int size() {
        return dati.size();
    }
    public VectorInteger somma(VectorInteger altro) {
        if(this.size() != altro.size()) {
            throw new IllegalArgumentException();
        }
        VectorInteger ris = new VectorInteger(size());
        for(int i = 0; i < size(); ++i) {
            ris.set(i, this.get(i) + altro.get(i));
        }
        return ris;
    }

    public VectorInteger differenza(VectorInteger altro) {
        if(this.size() != altro.size()) {
            throw new IllegalArgumentException();
        }
        VectorInteger ris = new VectorInteger(size());
        for(int i = 0; i < size(); ++i) {
            ris.set(i, this.get(i) - altro.get(i));
        }
        return ris;
    }

    public int prodottoScalare(VectorInteger altro) { // throws SizeExc
        return 0;
    }

    public VectorInteger prodottoPerScalare(int scalare) {
        return null;
    }

    public double modulo() {
        double ris = 0.0D;
        for(int i = 0; i < size(); ++i) {
            ris += get(i) * get(i);
        }
        return Math.sqrt(ris);
    }

    public boolean equals(Object altro) {
        if(altro == this) {
            return true;
        }
        if(! (altro instanceof VectorInteger)) {
            return false;
        }
        VectorInteger v = (VectorInteger)altro;
        return this.dati.equals(v.dati);
    }

    public int hashCode() {
        int h = 0;
        for(int i = 0; i < size(); ++i) {
            h += get(i);
        }
        return h;
    }

    public int compareTo(VectorInteger altro) {
        if(this.equals(altro)) {
            return 0;
        }
        if(this.modulo() > altro.modulo()){
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return dati.toString();
    }
}