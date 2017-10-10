package JAVAHOMEWORK5;

class Cookie extends DessertItem{
	private double price;
	private double amount;
	public Cookie(String name,double amount,double price){
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public double getCost(){
		return price*amount/DessertShoppe.DOZEN;
	}
	 public String toString(){
		 String res = this.amount +" @ "+ DessertShoppe.centsToDollars(this.price) +" /dz\n";
		 String temp = this.getName();
		 String temp1 = DessertShoppe.centsToDollars(this.getCost())+"\n";
		 res =res +temp;
		 for(int i = temp.length();i<DessertShoppe.OUTPUT_LENGTH-temp1.length();i++){
			 res = res + " ";
		 }
		 res =res + temp1;
		 return res;
     }
}