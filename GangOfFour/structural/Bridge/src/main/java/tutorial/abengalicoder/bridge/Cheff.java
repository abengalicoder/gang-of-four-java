package tutorial.abengalicoder.bridge;

public class Cheff extends DominosPizza {
	String pizzaType; 
	String top;
	
	public Cheff(String pizzaType, String top, Pizza pizza) {
		super(pizza);
		this.pizzaType=pizzaType;
		this.top = top;
	}

	@Override
	public void make() {
		pizza.cook(pizzaType, top);
	}

}
