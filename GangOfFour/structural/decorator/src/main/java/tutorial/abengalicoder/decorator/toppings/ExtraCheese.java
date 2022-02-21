package tutorial.abengalicoder.decorator.toppings;

import tutorial.abengalicoder.decorator.pizza.Pizza;

public class ExtraCheese extends BaseToppings {


	public ExtraCheese(Pizza pizza) {
		super(pizza);
		this.cost = 2.34;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Extra Cheese added";
	}
	
}
