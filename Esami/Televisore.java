package prg.esame4;

public class Televisore {
    public static final int MARCA = 0;
    public static final int MODELLO = 1;
    public static final int DIMENSIONI = 2;

    private String modello, marca;
    private int dimensione; // diagonale in pollici

    public Televisore() {
        set(MARCA, "default-marca");
        set(MODELLO, "default-modello");
        set(DIMENSIONI, "0");
    }

    public void set(int selection, String parameter) {
        switch(selection) {
            case 0:
                this.marca = parameter;
                break;
            case 1:
                this.modello = parameter;
                break;
            case 2:
                try {
                    this.dimensione = Integer.parseInt(parameter);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
               // throw new Exception("qualcosa è andato storto");
            
        }
    }
}
