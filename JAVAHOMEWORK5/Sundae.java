package JAVAHOMEWORK5;

public class Sundae extends IceCream{
     private String toppingName;
     private double toppingPrice;
     public Sundae(String name,double prize,String toppingName,double toppingPrice){
    	 super(name,prize);
    	 this.toppingName = toppingName;
    	 this.toppingPrice = toppingPrice;
     }
     public double getCost(){
    	 return this.price+toppingPrice;
     }
     public String toString(){
    	 String res = this.toppingName + " with\n";
    	 String temp = this.name;
    	 String temp1 = DessertShoppe.centsToDollars(this.getCost())+"\n";
    	 res = res + temp;
    	 for(int i=temp.length();i<DessertShoppe.OUTPUT_LENGTH-temp1.length();i++){
    		 res =res +" ";
    	 }
    	 res = res +temp1;
    	 return res;
     }
}
