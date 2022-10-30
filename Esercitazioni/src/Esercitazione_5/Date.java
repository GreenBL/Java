package bin.es5;

public class Date{
    private int day, month, year;
    private static int[] monthDayTable = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static String[] monthTable = {"Gennaio",
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
        int month = convertDaytoMonth(g);
        this.setMonth(month);
        this.setDay(g);
        this.setYear(a);
    }
    public Date(int g, int m, int a){
        this.setYear(a);
        this.setMonth(m);
        this.setDay(g);
    }
    public Date(int g, String m, int a){
        this.setYear(a);
        this.setMonth(parseMonthString(m));
        this.setDay(g);
    }

    public String toString(){
        return this.getDay() + " " + monthTable[this.getMonth() - 1] + " " + this.getYear();
    }

    public void stampa1(){
        int numberOfDays = 0;
        for(int i = 0; i < this.getMonth() - 1; ++i){
            numberOfDays = numberOfDays + monthDayTable[i];
        }
        numberOfDays = numberOfDays + this.getDay();
        System.out.printf("%d/%d\n", numberOfDays, this.getYear());
    }

    public boolean equals(Date data){
        return (this.getDay() == data.getDay()) && (this.getMonth() == data.getMonth()) && (this.getYear() == data.getYear());
    }

    public void stampa2(){
        String formatB = String.format("%d/%d/%d", this.getDay(), this.getMonth(), this.getYear());
        System.out.println(formatB);
    }

    public void stampa3(){
        System.out.println(this.getDay() + " " + monthTable[this.getMonth() - 1] + " " + this.getYear());
    }

    public void setMonth(int newMonth){
        if(newMonth <= 12 && newMonth > 0){
            this.month = newMonth;
        } else {
            System.out.println("Errore: Assumo Gennaio");
            this.setMonth(0);
        }
    }

    public void setDay(int newDay){
        // get la somma di giorni al mese precedente
        if(newDay > 31){
            newDay = this.formatDays(newDay);
        }

        if(newDay <= monthDayTable[this.getMonth() - 1] && newDay > 0){
            this.day = newDay;
        } else {
           // System.out.println("Errore: Assumo Giorno 1");
            this.setDay(1);
        }
    }

    public void setYear(int newYear){
        if(newYear > 1969){
            this.year = newYear;
        } else {
            System.out.println("Errore: Assumo Anno 1970");
            this.setYear(1970);
        }
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    public int getYear(){
        return this.year;
    }

    private int convertDaytoMonth(int days){
        int i;
        for(i = 0; i < monthDayTable.length; ++i){
            if(days <= monthDayTable[i]){
                return i + 1;
            }
            days -= monthDayTable[i];
        }
        return i + 1;
    }

    private int formatDays(int days){
        int sum = 0;
       // System.out.println(this.getMonth() - 2);
        for(int i = 0; i < this.getMonth() - 1; ++i){
            sum += monthDayTable[i];
            //System.out.println(sum);
        }
        days -= sum;
       // System.out.println("info " + days);
        return days;
    }

    private int parseMonthString(String monthName){
        for(int i = 0; i < monthTable.length; ++i){
            if(monthName.equals(monthTable[i])){
                return i + 1;
            }
        }
        return 0;
    } 
}