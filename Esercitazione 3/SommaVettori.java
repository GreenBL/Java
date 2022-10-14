package prg.es03;
import java.io.*;  
import java.util.*;  

public class SommaVettori{
    public static void main(String args[]){
        double vettore1[] = new double[10];
        double vettore2[] = new double[10];
        int risultato[] = new int[10];

        for(int i = 0; i < 10; ++i){
            vettore1[i] = Math.random() * 1000;
            vettore2[i] = Math.random() * 1000;
            risultato[i] = (int) vettore1[i] + (int) vettore2[i];
        }

        String stringVect1 = Arrays.toString(vettore1);
        String stringVect2 = Arrays.toString(vettore2);
        String stringRis = Arrays.toString(risultato);

        System.out.println("V1 = " + stringVect1);
        System.out.println("V2 = " + stringVect2);
        System.out.println("V1 + V2 = " + stringRis);
    }
}