package project2;

public class Deck extends GroupOfCards{
public static final int TOTAL_CARDS = 52;
public Deck(){
	 super(TOTAL_CARDS);
}
public void shuffle(){
	int num = super.getCurrentSize();
	for(int i=0;i<num;i++){
		cards.add(cards.remove((int)(Math.random()*num)));
	}
 }
public Card dealCard(){
	return cards.get(0);
}
}
