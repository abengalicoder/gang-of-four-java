package tutorial.abengalicoder.bridge;

public class VegPizza implements Pizza {

	public void cook(String pizzaType, String top) {
		System.out.println("Veg Pizza");
		System.out.println(pizzaType + " -> " + top);
		
	}

}
