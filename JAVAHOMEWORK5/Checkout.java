package JAVAHOMEWORK5;

import java.util.Vector;

public class Checkout {
   private Vector list;
   public Checkout(){
	   list = new Vector();
   }
   public void enterItem(DessertItem des){
	   list.addElement(des);
   }
   public int totalCost(){
	   DessertItem des2 = null;
	   double total = 0;
	   for(int i=0;i<list.size();i++){
	      des2 =  (DessertItem) list.get(i);
	     total = total + des2.getCost();
	   }
	   return (int)total;
   }
   public int totalTax(){
	   return (int)(this.totalCost()*DessertShoppe.TAX);
   }
   public void clear(){
	   list.removeAllElements();
   }
   public int numberOfItems(){
	   return list.size();
   }
   public String toString(){
	   String res = "\t M & M Dessert Shoppe \n";
	   res = res+"\t --------------------\n\n";
	   for(int i=0;i<list.size();i++){
		   res += list.get(i).toString();
	   }
	   res += "\n\nTAX\t\t\t\t"+DessertShoppe.centsToDollars(this.totalTax())+"\n";
	   res += "Total Cost"+"\t\t\t"+DessertShoppe.centsToDollars(this.totalCost())+"\n";
	   return res;
   }
}
