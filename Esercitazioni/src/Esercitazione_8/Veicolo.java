package bin.es8;

public abstract class Veicolo{
    private int x;
    private int y;
    private int vX;
    private int vY;
    private int aX;
    private int aY;

    public void setX(int newX){
        this.x = newX;
    }

    public void setY(int newY){
        this.y = newY;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setInitSpeedX(int speed){
        this.vX = speed;
    }

    public int getInitSpeedX(){
        return this.vX;
    }

    public void setInitSpeedY(int speed){
        this.vY = speed;
    }

    public int getInitSpeedY(){
        return this.vY;
    }

    public void setAccelX(int acceleration){
        this.aX = acceleration;
    }

    public int getAccelX(){
        return this.aX;
    }

    public void setAccelY(int acceleration){
        this.aY = acceleration;
    }

    public int getAccelY(){
        return this.aY;
    }
    
    public abstract void muovi(int time);

}