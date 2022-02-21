package tutorial.abengalicoder.decorator.toppings;

import tutorial.abengalicoder.decorator.ToppingsDecorator;
import tutorial.abengalicoder.decorator.pizza.Pizza;

public abstract class BaseToppings extends ToppingsDecorator {
	public Pizza pizza;

	public BaseToppings(Pizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return super.getDescription();
	}

	@Override
	public double getCost() {
		return (this.pizza.getCost() + this.cost);
	}

}
