package bin.es3;
import java.io.*;  
import java.util.*; 

public class SommaMatrici{
    public static void main(String args[]){
        double mat1[][] = new double[3][5];
        double mat2[][] = new double[3][5];
        double ris[][] = new double[3][5];
        
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 5; ++j){
                mat1[i][j] = Math.random() * 100;
                mat2[i][j] = Math.random() * 100;
                ris[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        String mat1Str = Arrays.deepToString(mat1);
        String mat2Str = Arrays.deepToString(mat2);
        String risStr = Arrays.deepToString(ris);

        System.out.println("MAT1 = " + mat1Str);
        System.out.println("MAT2 = " + mat2Str);
        System.out.println("MAT1 + MAT2 = " + risStr);
    }
}