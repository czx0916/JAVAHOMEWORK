package project2;

public class Trick extends GroupOfCards{
private int winner;
private Card winningCard;
private boolean hearts;
private boolean queen;
private int players;
public int getWinner() {
	return winner;
}
public Card getWinningCard() {
	return winningCard;
}
public boolean getHearts() {
	return hearts;
}
public boolean getQueen() {
	return queen;
}
public Trick(int players){
	super(players);
	this.players = players;
}
public boolean isWinner(Card card){
	if(winningCard!=null&&card.getSuit()!=winningCard.getSuit()){
		return false;
	}
	if(card.getNum()<winningCard.getNum())
	return false;
	return true;
}
public void update(int playNum,Card card){
	if(isWinner(card)==true){
		winner = players;
		winningCard = card;
	}
	if(card.getSuit()==2)
		hearts = true;
	if(card.getNum()==12&&card.getSuit()==3)
		queen = true;
}
}
