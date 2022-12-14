package bin.util;

public class ScreenClearer{
    public ScreenClearer(){}

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
    }
}