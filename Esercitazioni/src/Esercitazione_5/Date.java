package bin.es5;

public class Date{
    private int day, month, year;
    int[] monthDayTable = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] monthTable = {"Gennaio",
                           "Febbraio",
                           "Marzo",
                           "Aprile",
                           "Maggio",
                           "Giugno",
                           "Luglio",
                           "Agosto",
                           "Settembre",
                           "Ottobre",
                           "Novembre",
                           "Dicembre"};


    public Date(int g, int a){
        int tempWeek = g / 7
        this.setDay(g);
        this.setYear(a);
    }
    public Date(int g, int m, int a){

    }
    public Date(int g, String m, int a){

    }

    public void setMonth(int newMonth){
        if(newMonth <= 12){
            this.month = newMonth;
        } else {
            System.out.println("Errore: Assumo Gennaio");
            this.setMonth(0);
        }
    }

    public void setDay(int newDay){
        if(newDay <= monthDayTable[this.getMonth() + 1]){
            this.day = newDay;
        } else {
            System.out.println("Errore: Assumo Giorno 1");
            this.setDay(1);
        }
    }

    public void setYear(int newYear){
        if(newYear > 0){
            this.year = newYear;
        } else {
            System.out.println("Errore: Assumo Anno 1970");
            this.setYear(1970);
        }
    }
}