
public class Constructors {
	public static void main (String[] args) {
		Pizza pepperoniPizza = new Pizza(8);
		PrintValue printer = new PrintValue();
		printer.printValue(pepperoniPizza.slices);
		pepperoniPizza.eat(4);
		printer.printValue(pepperoniPizza.slices);
	}
}


class Pizza {
	int slices;
	String topping;
	
	public void eat(int amount) {
		if(amount < 2) {
			slices -= 1;			
		}
		else {
			slices-= amount;
		}
	}
	Pizza(int pieces){
		slices = pieces;
	}
}