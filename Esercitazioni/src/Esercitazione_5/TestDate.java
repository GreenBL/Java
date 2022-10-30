package bin.es5;

public class TestDate{
    public static void main(String args[]){
        Date data1 = new Date(190, 1992);
        Date data2 = new Date(30, 10, 2022);
        Date data3 = new Date(23, "Maggio", 1989);

       // System.out.println(data1.toString());

        data1.stampa1();
        data1.stampa2();
        data1.stampa3();

        data2.stampa1();
        data2.stampa2();
        data2.stampa3();

        data3.stampa1();
        data3.stampa2();
        data3.stampa3();
    
    }
}