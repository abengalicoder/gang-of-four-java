package tutorial.abengalicoder.bridge;

public abstract class DominosPizza {
	protected Pizza pizza;
	
	public DominosPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public abstract void make();
}
