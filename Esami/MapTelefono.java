package prg.esame2;
import java.util.TreeMap;
import java.util.Map;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

public class MapTelefono {
    Map<Integer, Telefono> map;
    ArrayList<Telefono> sortedList = new ArrayList<>();

    public MapTelefono() {
        map = new TreeMap<>();
    }

    public void add(Telefono tel) {
        int key = tel.getID();
        map.put(key, tel);
    }

    public void remove(int keyID) {
        map.remove(keyID);
    }

    public void print() {
        for(Map.Entry<Integer, Telefono> entry: map.entrySet()) {
            sortedList.add(entry.getValue());
        }
        Collections.sort(sortedList, new CustomComparator());
        for(Telefono tel : sortedList) {
            System.out.println(tel);
        }
    }
}

class CustomComparator implements Comparator<Telefono> {
    @Override
    public int compare(Telefono t1, Telefono t2) {
        return t1.compareTo(t2);
    }
}
