package bin.es8;
import java.util.Scanner;

public class TestStack{
	public static void main(String args[]){
		String menu = "";
		String buffer = "";
		Scanner scanner = new Scanner(System.in);
		Stack stack = new Stack();
		String info = "\n\u001B[34mEnter command [push <String>, pop, print, exit]\u001B[0m\n";

		System.out.print(info);
		while(!(menu = scanner.next()).equals("exit")){
			switch(menu){
				case "push":
					buffer = scanner.next();
					stack.push(buffer);
					scanner.nextLine();
					break;
				case "pop":
					System.out.println("popped " + stack.pop());
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