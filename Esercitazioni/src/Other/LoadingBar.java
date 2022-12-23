package bin.util;
import bin.util.ScreenClearer;
public class LoadingBar {
    public static void main(String[] args) {
        ScreenClearer.clearScreen();
        System.out.println("\u001b[24;0HLOADING IN PROGRESS");
        for(int i = 0; i < 120; i++) {
            try {
                Thread.sleep((int)(Math.random() * 100));
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.print("🀫");
        }
        System.out.println("GET PSYCHED!");
        ScreenClearer.clearScreen();
    }
}