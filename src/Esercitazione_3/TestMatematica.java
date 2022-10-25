package bin.es3;

public class TestMatematica{
    public static void main(String args[]){
        Calcolatrice miaCalcolatrice = new Calcolatrice();
        double[] v1 = miaCalcolatrice.generaVettore(3);
        miaCalcolatrice.stampaVettore(v1);
        double[] v2 = miaCalcolatrice.generaVettore(3);
        miaCalcolatrice.stampaVettore(v2);
        double[] v3 = miaCalcolatrice.generaVettore(5);    
        miaCalcolatrice.stampaVettore(v3);
        double[] v1V2 = miaCalcolatrice.sommaVettori(v1, v2);
        miaCalcolatrice.stampaVettore(v1V2);
        double[] v1V3 = miaCalcolatrice.sommaVettori(v1, v3);
        miaCalcolatrice.stampaVettore(v1V3);
        double[] v1ConV3 = miaCalcolatrice.concatenaVettori(v1, v3);
        miaCalcolatrice.stampaVettore(v1ConV3);
        double[][] m1 = miaCalcolatrice.generaMatrice(3, 5);
        miaCalcolatrice.stampaMatrice(m1);
        double[][] m2 = miaCalcolatrice.generaMatrice(3, 5);
        miaCalcolatrice.stampaMatrice(m2);
        double[][] m3 = miaCalcolatrice.generaMatrice(3, 5);
        miaCalcolatrice.stampaMatrice(m3);
        double[][] m1Pm2 = miaCalcolatrice.sommaMatrici(m1, m2);
        double[][] m1Pm3 = miaCalcolatrice.sommaMatrici(m1, m3);
        miaCalcolatrice.stampaMatrice(m1Pm2);
        miaCalcolatrice.stampaMatrice(m1Pm3);
    }
}