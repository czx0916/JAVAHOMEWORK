package javaHomework;

public class pizzaCalculate {

	public static void main(String[] args) {
		pizza hotPizza = new pizza("hotPizza",10,50);
		customers sam = new customers("sam","hotpizza",15);
		int sum = hotPizza.getUnitPrize()*sam.getpizzaNumber();
		System.out.println("the sum of the pizza is : "+ sum);
		
		
	}

}
class pizza{
	private String pizzaType;
	private int unitPrize;
	private int loyaltyPoints;
    pizza(String pizzaType,int unitPrize,int loyaltyPoints){
		this.setPizzaType(pizzaType);
		this.unitPrize = unitPrize;
		this.setLoyaltyPoints(loyaltyPoints);
	}
    public int getUnitPrize(){
    	return this.unitPrize;
    }
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public int getLoyaltyPoints() {
		return loyaltyPoints;
	}
	public void setLoyaltyPoints(int loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}
}
class customers{
	private String name;
	private String pizzaType;
	private int pizzaNumber;
	public customers(String name,String pizzaType,int pizzaNumber){
		this.pizzaNumber = pizzaNumber;
		this.pizzaType = pizzaType;
		this.name = name;
	}

	public String getPizzatype(){
		return pizzaType;
	}

	public int getpizzaNumber(){
		return pizzaNumber;
	}

	public String getName() {
		return name;
	}


}