package project2;

public class Hand extends GroupOfCards{
private final int NUM;
private int shortest = 0;
public Hand(int playerNum,int NumberOfCards){
	super(NumberOfCards);
	this.NUM = playerNum;
}
public void sort(){
	int num = cards.size();
	for(int i=0;i<num-1;i++){
		int max = 0;
		int index = 0;
		for(int j=i;j<num;j++){
			if(cards.get(j).getNum()+13*cards.get(j).getSuit()>=max)
				max = cards.get(j).getNum()+13*cards.get(j).getSuit();
				index = j;
		}
		cards.add(i,cards.remove(index));
	}
}
public void setShortest(){
  if(findcount(0)>=findcount(1))
		  shortest = 1;
  if(find(14,3)==-1||find(13,3)==-1||find(12,3)==-1||findcount(0)>=findcount(3)||findcount(1)>=findcount(3)){
	  shortest = 3;
  }
}
public int getShortest(){
	return shortest;
}
public int findcount(int suit){
	int count = 0;
	for(Card c : cards){
		if(c.getSuit()==suit)
			count++;
	}
	return count;
}
public int find(int num,int suit){
	for(int i = 0;i<cards.size();i++){
		if(cards.get(i).getNum()==num&&cards.get(i).getSuit()==suit)
			return i;
	}
	return -1;
}
public Card playACard(Game game,Trick trick){
	int index = 0;
	if(trick.getCurrentSize()==0)
	{ 
		if(findcount(shortest)==0)
			return cards.remove(findhlowest());
		else
		{
		index = findhighest(shortest);
		return cards.remove(index);
		}
	}
	else if ((trick.getCurrentSize() == game.PLAYERS- 1)
			  && !trick.getHearts() && !trick.getQueen());
	return cards.remove(findhighest(trick.GetCard(0).getSuit()));
	
	
}

public int findlowest(int suit){
	int min = 15;
	int index = 0;
	for(int i =0;i<cards.size();i++){
		if(cards.get(i).getSuit()==suit)
		{
			if(findcount(shortest)==0)
				
			if(cards.get(i).getNum()<min)
				index = i;
		}
	}
	return index;
}
public int findhighest(int suit){
	int max = 0;
	int index = 0;
	for(int i =0;i<cards.size();i++){
		if(cards.get(i).getSuit()==suit)
		{
			if(cards.get(i).getNum()>max)
				index = i;
		}
	}
	return index;
}
public int findhighest(){
	int index = 0;
	int max = 0;
	for(int i = 0 ;i<cards.size();i++){
		if(cards.get(i).getNum()>max)
			index = i;
	}
	return index;
}
public int findhlowest(){
	int index = 0;
	int min = 0;
	for(int i = 0 ;i<cards.size();i++){
		if(cards.get(i).getNum()<min)
			index = i;
	}
	return index;
}
public int findHighestBelow(Card card){
	int index = 0;
	int max = 0;
	for(int i =0;i<cards.size();i++){
		if(cards.get(i).getNum()>max&&cards.get(i).getNum()<card.getNum())
			index = i;
	}
	return index;
}
}
