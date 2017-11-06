package project2;

public class Card {
 private int num;
 private int suit;
 public Card(int num,int suit){
	 this.num = num;
	 this.suit = suit;
 }
public int getNum() {
	return num;
}

public int getSuit() {
	return suit;
}
public void display(){
	switch (suit){
	case 0:
	{
	System.out.print("clubs ");
	break;
	}
	case 1:
	{
	System.out.print("diamonds ");
	break;
	}
	case 2:
	{	
	System.out.print("hearts ");
	break;
	}
	case 3:
	{
	System.out.print("spades ");
	break;
	}
	}
	if(num>1&&num<=10)
		System.out.println(num+"");
	else if(num==11)
		System.out.println("Jack");
	else if(num==12)
		System.out.println("Queen");
	else if(num==13)
		System.out.println("King");
	else if(num==14)
		System.out.println("Ace");
}
 
}
