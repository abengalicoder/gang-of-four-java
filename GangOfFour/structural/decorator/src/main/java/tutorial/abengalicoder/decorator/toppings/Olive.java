package tutorial.abengalicoder.decorator.toppings;

import tutorial.abengalicoder.decorator.pizza.Pizza;

public class Olive extends BaseToppings {
	
	
	public Olive(Pizza pizza) {
		super(pizza);
		this.cost = 2.34;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Olive added";
	}
	

}
