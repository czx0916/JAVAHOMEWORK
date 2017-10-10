package JAVAHOMEWORK5;

public class IceCream extends DessertItem{
     protected String name;
	 protected double price;
     public IceCream(String name,double price){
    	 this.name = name;
    	 this.price = price;
     }
     public double getCost(){
    	 return price;
     }
     public String toString(){
    	 String res = this.name;
    	 String temp = DessertShoppe.centsToDollars(this.getCost())+"\n";
    	 for(int i = res.length();i<DessertShoppe.OUTPUT_LENGTH-temp.length();i++){
    		 res =res +" ";
    	 }
    	 res = res + temp;
    	 return res;
     }
}
