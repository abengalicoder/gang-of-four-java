package tutorial.abengalicoder.bridge;

public class ChickenPizza implements Pizza {

	public void cook(String pizzaType, String top) {
		System.out.println("Chicken Pizza");
		System.out.println(pizzaType + " -> " + top);
		
	}

}
