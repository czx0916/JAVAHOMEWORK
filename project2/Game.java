package project2;

public class Game {
   public final int PLAYERS;
   private Deck deck;
   private Trick[] tricks;
   private Hand[] players;
   private int numberOfTricks = 0;
   private boolean hearts = false;
   private boolean queenOfSpades = false;
public boolean isHearts() {
	return hearts;
}
public int getNumberOfTricks() {
	return numberOfTricks;
}
public boolean isQueenOfSpades() {
	return queenOfSpades;
}

   public Game(int numberOfPlayers){
	   this.PLAYERS = numberOfPlayers;
	   players = new Hand[numberOfPlayers];
	   for(int i = 0 ;i<players.length;i++)
		   players[i] = new Hand(i,deck.TOTAL_CARDS/numberOfPlayers);
	   tricks = new Trick[deck.TOTAL_CARDS/numberOfPlayers];
   }
public void playAGame(){
	deck.shuffle();
	int cardsLeft = deck.TOTAL_CARDS%players.length;
	for(int i =0;i<players.length;i++)
		{
		players[i].sort();
		players[i].setShortest();
		System.out.println("player "+ i +"shortest = "+ players[i].getShortest());
		
		System.out.println(players[i].cards);
		}
}   
}
