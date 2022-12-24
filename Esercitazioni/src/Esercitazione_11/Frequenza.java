package bin.es11;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;

public class Frequenza {
    public static void main(String[] args) {
        String testo = "Scrivete un programma che, utilizzando il metodo split su una stringa contenente il testo di questo esercizio, determina il numero totale di parole presenti nel testo e la parola che compare con maggiore frequenza. Potreste anche pensare di utilizzare una Map<String, Integer> per memorizzare la frequenza di ciascuna parola utilizzando la parola stessa come chiave. Stampate, infine, la frequenza di ciascuna parola mostrando le parole in ordine alfabetico.";
        Map<String, Integer> freqMap = new TreeMap<>();
        testo = testo.replaceAll(",", "");
        testo = testo.replaceAll("[.]", ""); 
        testo = testo.replaceAll("[<>]", " ");
        testo = testo.replaceAll("\\s\\s", " ");
        testo = testo.toLowerCase();

        String[] reformat = testo.split("\\s");

        int occurrences;

        for(int i = 0; i < reformat.length - 1; ++i) {
            occurrences = 0;
            for(int j = 0; j < reformat.length - 1; ++j) {
                if(reformat[i].equals(reformat[j])) {
                    occurrences++;
                }
            }
            freqMap.putIfAbsent(reformat[i], occurrences);
        }
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println( entry.getKey()+ " => " + entry.getValue());
        }
    }
}