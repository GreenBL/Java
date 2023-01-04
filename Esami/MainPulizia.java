package prg.esame3;
import java.util.ArrayList;
import java.util.Collection;

public class MainPulizia {
    public static void main(String[] args) {
        Collection<Pulizia> lista = new ArrayList<>();

        lista.add(new Forno("Grande Forno", 300, 2053));
        lista.add(new MacchinaCaffe("Caffettiera Smart", "capsule", 5532));
        lista.add(new Forno("Piccolo Forno", 100, 8842));

        for(Pulizia ogg : lista) {
            ogg.pulisci();
        }
    }
}