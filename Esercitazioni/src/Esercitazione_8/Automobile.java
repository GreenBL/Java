package bin.es8;

public class Automobile extends VeicoloAMotore{
    private String targa;

    public void setTarga(String plate){
        this.targa = plate;
    }

    public String getTarga(){
        return this.targa;
    }

    public String toString(){
        return "< " + getX() + "," + getY() + " >\n" + "current acceleration at this instant : " + getAccelX() + "forward/upwards " + getAccelY();
    }
}