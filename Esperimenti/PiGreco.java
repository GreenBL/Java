import java.util.Random;

public class PiGreco{
    public static void main(String args[]){
        if (args.length != 1){
            System.out.println("Usage : java PiGreco <sample_size>");
            System.exit(1);
        }
        Random random = new Random();
        double x = 0;
        double y = 0;
        double distance = 0;
        double n_circle = 0;
        double n_total = 0;
        for(int i = 0; i < Integer.parseInt(args[0]); i++){
            x = random.nextDouble();
            y = random.nextDouble();
            distance = y * y + x * x;
            if(distance <= 1){
                n_circle += 1;
            }
            n_total += 1;
        }
        System.out.println("π = " + 4 * n_circle / n_total + " (per this machine)");
    }
}