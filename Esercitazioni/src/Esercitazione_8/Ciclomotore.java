package bin.es8;
import bin.es6.Point2D;

public class Ciclomotore extends VeicoloAMotore{
    private long numeroTelaio;

    public Ciclomotore(){}

    public Ciclomotore(Point2D vel, Point2D acc, long telaio, int cil){
        super(vel, acc, cil);
        setNumeroTelaio(telaio);
        setCilindrata(cil);
    }

    public void setNumeroTelaio(long tel){
        this.numeroTelaio = tel;
    }
}