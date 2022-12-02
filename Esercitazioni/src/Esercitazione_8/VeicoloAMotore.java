package bin.es8;

public abstract class VeicoloAMotore extends Veicolo{
    private int cilindrata = 500;

    public void setCilindrata(int nuovaCilindrata){
        this.cilindrata = nuovaCilindrata;
    }

    public int getCilindrata(){
        return this.cilindrata;
    }

    public void muovi(int time){
        setX(getX() + (time * getInitSpeedX()) + (time * time * getAccelX()));
        setY(getY() + (time * getInitSpeedY()) + (time * time * getAccelY()));
    }
}