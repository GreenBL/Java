package magazzino;
import java.util.ArrayList;
import java.util.Iterator;

public class Magazzino {
    private ArrayList<Articolo> articoli;

    public Magazzino(){
        articoli = new ArrayList<Articolo>();
    }

    public void aggiungi(Articolo art) {
        Iterator<Articolo> it = articoli.iterator();
        while(it.hasNext()) {
            if(it.next().getCode() == art.getCode()) {
                System.out.println("Codice gia' preso");
                return;
            }
        }
        articoli.add(art);
    }

    public void lookupDesc(String description) {
        Iterator<Articolo> it = articoli.iterator();
        while(it.hasNext()) {
            Articolo temp = it.next();
            if(temp.getDescription().equals(description)) {
                System.out.println(temp);
            }
        }
    }

    public void printShoes() {
        for(Articolo art : articoli) {
            if(art instanceof Scarpa) {
                System.out.println(art);
            }
        }
    }

    public void XXLCount() {
        for(Articolo art : articoli) {
            if(art instanceof Vestito) {
                Vestito vest = (Vestito)art;
                if(vest.getTaglia().equals("XXL")) {
                    System.out.println(art);
               } 
            }
        }
    }


} 