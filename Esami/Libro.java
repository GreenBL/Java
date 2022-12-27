package prg.esame1;
import java.io.IOException;

public class Libro {
    private String titolo, autore;
    private int annoPubblicazione;

    public Libro() throws Exception {
        this("-", "-", "1971");
    }

    public Libro(String title, String author, String pubYear) throws Exception {
        set("title", title);
        set("author", author);
        set("year", pubYear);
    }

    public void set(String type, String input) throws Exception {
        switch(type) {
            case "title":
                setTitle(input);
                break;

            case "author":
                setAuthor(input);
                break;
            
            case "year":
                    setPubYear(Integer.parseInt(input));
                break;
            default:
                throw new IOException("invalid type");
        }
    }

    private void setTitle(String title) {
        this.titolo = title;
    }

    private void setAuthor(String author) {
        this.autore = author;
    }

    private void setPubYear(int year) throws Exception {
        if(year < 0 || year > 2023) {
            throw new Exception("year range not valid");
        }
        this.annoPubblicazione = year;
    }

    public String toString() {
        return titolo + autore + annoPubblicazione;
    }
}