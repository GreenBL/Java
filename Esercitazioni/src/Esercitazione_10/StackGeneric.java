package bin.es10; 
import java.util.ArrayList;

public class StackGeneric<E> {
	private ArrayList<E> pila = new ArrayList<>(100);
	private E lastPushed;
	private E lastPopped;
	
	
	public StackGeneric(){
		(this.pila).ensureCapacity(100);
	}
	
	public void push(E s) throws StackFullException{
		int size2 = (this.pila).size();
		if(this.isFull() == false && !(this.pila).contains(s)){
			if((this.pila).size() == 0){
				pila.add(0, s);
				System.out.println("\nSuccessfully pushed " + s);
			} else {
				(this.pila).add(0, s);
				this.lastPushed = s;
				System.out.println("\nSuccessfully pushed " + s);
			}
		} else {
			System.out.println("\n\u001B[31mCOULD NOT PUSH " + s + ", stack either full or duplicate object!\u001B[0m");
			throw new StackFullException();
		}
	}
	
	public E pop() throws StackEmptyException{
		if(!this.isEmpty()){
			this.lastPopped = (this.pila).get(0);
			/*return*/(this.pila).remove(0); //remove dell'arraylist ritorna l'elemento eliminato
			return this.lastPopped;
		}
		throw new StackEmptyException();
	}
	
	public boolean isEmpty(){
		return pila.isEmpty();
	}
	
	public boolean isFull(){
		if(pila.size() < 100){
			return false;
		}
		return true;
	}
	
	public String toString(){
		String buff = "";
		for(E element: this.pila){
			buff = buff + "\n| " + element.toString() + " |\n";
		}
		return buff;
	}

	public boolean equals(StackGeneric altro){
		return this.pila.equals(altro.getStack());
	}

	public ArrayList getStack(){ 
		return pila;
	}
}

class StackEmptyException extends Exception { 
	public StackEmptyException() {
		super("stack is empty!");
	}
}

class StackFullException extends Exception {
	public StackFullException() {
		super("stack is full! (100/100)");
	}
}