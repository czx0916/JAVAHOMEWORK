package project2;

public class test {

	public static void main(String[] args) {
		Card test = new Card(6,0);
		Card test1 = new Card(2,0);
		Card test2 = new Card(3,0);
		Card test3 = new Card(4,0);
		Card test4 = new Card(5,0);
//		test.display();
//		GroupOfCards gp = new GroupOfCards(20);
		Hand hd = new Hand(1,10);
		
		hd.addCard(test);
		hd.addCard(test1);
		hd.addCard(test2);
		hd.addCard(test3);
		hd.addCard(test4);
		hd.display();
		hd.sort();
		hd.display();
	

	}

}
