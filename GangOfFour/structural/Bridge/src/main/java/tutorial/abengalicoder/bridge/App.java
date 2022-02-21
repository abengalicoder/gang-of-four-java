package tutorial.abengalicoder.bridge;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DominosPizza[] pizzas = new DominosPizza[] {
    			new Cheff("veg", "soya", new VegPizza()),
    			new Cheff("chicken", "olive", new ChickenPizza())
    	};
    	
    	for(DominosPizza pizza : pizzas) {
    		pizza.make();
    	}
    			
    }
}
