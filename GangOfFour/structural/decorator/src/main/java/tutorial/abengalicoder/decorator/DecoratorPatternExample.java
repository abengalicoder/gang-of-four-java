package tutorial.abengalicoder.decorator;

import tutorial.abengalicoder.decorator.pizza.DoubleBrustPizza;
import tutorial.abengalicoder.decorator.pizza.Pizza;
import tutorial.abengalicoder.decorator.toppings.ExtraCheese;
import tutorial.abengalicoder.decorator.toppings.Olive;

public class DecoratorPatternExample 
{
    public static void main( String[] args )
    {
        Pizza doubleBrustPizza =  new DoubleBrustPizza();
        Pizza oliveAdded = new Olive(doubleBrustPizza);
        Pizza cheeseAdded = new ExtraCheese(oliveAdded);
        
        System.out.println(cheeseAdded.getDescription() + " : " + cheeseAdded.getCost());
    }
}
