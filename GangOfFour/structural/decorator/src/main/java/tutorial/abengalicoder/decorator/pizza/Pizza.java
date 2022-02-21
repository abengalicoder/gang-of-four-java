package tutorial.abengalicoder.decorator.pizza;

public abstract class Pizza {
	String description = "Dominos pizza";
	public double cost = 100.0;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
