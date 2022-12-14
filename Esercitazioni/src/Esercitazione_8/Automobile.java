package bin.es8;
import bin.es6.Point2D;

public class Automobile extends VeicoloAMotore{
    private String targa;

    public Automobile(){}

    public Automobile(Point2D vel, Point2D acc, int cil, String plateNum){
        super(vel, acc, cil);
        this.setTarga(plateNum);
    }

    public void setTarga(String plate){
        this.targa = plate;
    }

    public String getTarga(){
        return this.targa;
    }

  //  public String toString(){
   //     return "< " + getX() + "," + getY() + " >\n" + "current acceleration at this instant : " + getAccelX() + "forward/upwards " + getAccelY();
  //  }
}