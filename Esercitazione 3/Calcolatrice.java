package prg.es03;

public class Calcolatrice{
    public double[] generaVettore(int L){
        double[] vector = new double[L];
        for(int i = 0; i < L; ++i){
            vector[i] = Math.random() * 1000;                
        }
        return vector;
    }
    public double[] sommaVettori(double[] a, double[] b){
        if(a.length != b.length ){
            return a;
        }
        int size = a.length;
        double[] result = new double[size];
        for(int i = 0; i < size; ++i){
            result[i] = a[i] + b[i];
        }
        return result;
    }
    public double[] concatenaVettori(double[] a, double[] b){
        int size = a.length + b.length;
        double[] chainArr = new double[size];
        for(int i = 0; i < a.length; ++i){
            chainArr[i] = a[i];
        }
        for(int i = a.length; i < size; ++i){
            chainArr[i] = b[i - a.length];
        }
        return chainArr;
    }
    public void stampaVettore(double[] a){
        System.out.print("[ ");
        for(int i = 0; i < a.length; ++i){
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
    }

    public double[][] generaMatrice(int rows,  int cols){
        double[][] matrix = new double[rows][cols];
        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < cols; ++j){
                matrix[i][j] = Math.random() * 100;
            }
        }
        return matrix;
    }

    public double[][] sommaMatrici(double[][] a, double[][] b){
        if(a.length != b.length){
            return a;
        }
        for(int i = 0; i < a.length; ++i){
            if(a[i].length != b[i].length){
                return a;
            }
        }
        double[][] matSum = new double[a.length][a[0].length];
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[i].length; ++j){ // a[i].length = dimensione della i-esima riga
                matSum[i][j] = a[i][j] + b[i][j];
            }
        }
        return matSum;
    }

    public void stampaMatrice(double[][] m){
        int rows = m.length;
        int cols = m[0].length;
        System.out.println(" ");
        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < cols; ++j){
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}