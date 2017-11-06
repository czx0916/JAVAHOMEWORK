package project2;

import java.util.ArrayList;

public class GroupOfCards {
 protected ArrayList<Card> cards;
 private int size = 0;
 public int getCurrentSize() {
	return size;
}
public GroupOfCards(int num){
	 cards = new ArrayList<Card>(num);
 }
public Card GetCard(int cardIndex){
	return cards.get(cardIndex);
}
public void addCard(Card card){
	cards.add(card);
	size++;
 } 
public Card  removeCard(int CardIndex){
	size--;
	return cards.remove(CardIndex);
}
public void display(){
	System.out.println("the current size is : "+size);
	for(Card c:cards){
		c.display();
	}
}
}
