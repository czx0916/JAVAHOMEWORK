package JAVAHOMEWORK5;

class Candy extends DessertItem{
	private double price;
	private double weight;
	public Candy(String name,double price,double weight){
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	public double getCost(){
		return price*weight;
	}
	public double getPrice() {
		return price;
	}
	public double getWeight() {
		return weight;
	}
	public String toString(){
		String temp = this.getName();
		String temp1 =DessertShoppe.centsToDollars(this.getCost())+"\n";
		String res = DessertShoppe.centsToDollars(this.getWeight()) +"lbs. @ " + this.getPrice()+"/lb\n";
		res =res +temp;
		for(int i =temp.length();i<DessertShoppe.OUTPUT_LENGTH-temp1.length();i++){
			res = res +" ";
		}
		res = res + temp1;
		return   res;
	}
}
