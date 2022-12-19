package bin.es10;
import java.util.Scanner;
import bin.es5.Date;
import bin.util.ScreenClearer;

public class TestStackGeneric {
	public static void main(String args[]){
		String menu = "";
		String buffer = "";
		Scanner scanner = new Scanner(System.in);
		StackGeneric<Date> stack = new StackGeneric<>();
		String info = "\n\u001B[34mEnter command [push <String>, pop, print, exit]\u001B[0m\n";
		System.out.print(info);
		while(!(menu = scanner.next()).equals("exit")){
			ScreenClearer.clearScreen();
			System.out.print(info);
			switch(menu){
				case "push":
					try {
					stack.push(new Date(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
					}
					catch (StackFullException e) {
						e.printStackTrace();
					}
					scanner.nextLine();
					break;
				case "pop":
					try {
						System.out.println("popped " + stack.pop());
					}				
					catch (StackEmptyException e) {
						e.printStackTrace();
					}
					break;
				case "print":
					System.out.println(stack.toString());
					break;
				default:
					System.out.println("invalid command");
			}
			System.out.print(info);
		}
	}
}
