package javaHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		System.out.println("Welcome to Hangman");
		int timesOfGuess = 8;
		ArrayList list = new ArrayList();
		InitialisesWords(list);
	    String choosedWord = chooseWord(list);
	    String initialDisplay = DisplayInitialWord(choosedWord);
	    System.out.println("the word now looks like : " + initialDisplay);
	    handleGuess(choosedWord, initialDisplay,timesOfGuess);
	}
public static String DisplayInitialWord(String str){
	String initialDisplay = "";
	for(int i=0;i<str.length();i++){
		initialDisplay = initialDisplay + "-";
	}
	return initialDisplay;
	}
public static boolean isContains(String choosedWord,String input){
	String[] str = choosedWord.split("");
	for(int i=0;i<str.length;i++){
		if(str[i].equals(input))
			{
			return true;
			}
	}
	return false;
}
public static String convertWord(String choosedWord,String input,String initialDisplay){
	String[] str = choosedWord.split("");
	String[] str1 = initialDisplay.split("");
	for(int i=0;i<str.length;i++){
		if(str[i].equals(input))
			{
			str1[i] = input;
			}
	}
	initialDisplay = "";
	for(int i = 0 ;i<str1.length;i++){
		initialDisplay = initialDisplay + str1[i];
	}
	return initialDisplay;
}
public static boolean gameWon(String choosedWord,String initialDisplay){
	if(choosedWord.equals(initialDisplay))
		return true;
	else
		return false;
}
public static boolean gameOver(int num){
	if(num == 0)
		return true;
	else
		return false;
}
public static void handleGuess(String choosedWord,String initialDisplay,int num){
	Scanner sc = new Scanner(System.in);
	String str = "";
	System.out.print("Your Guess : ");
	str = sc.nextLine();
	int timesOfGuess = num;
	
	if(isContains(choosedWord, str)==true){
		String temp = convertWord(choosedWord, str, initialDisplay);
		System.out.println("The guess is correct");
		System.out.println("you have  "+ timesOfGuess +" guesses left");
		System.out.println("The words now looks like this : "+ temp);
		printMan(timesOfGuess);
		if(gameWon(choosedWord, temp)==true){
			System.out.println("You win this game");
			return;
		}
		handleGuess(choosedWord,temp,timesOfGuess);
	}
	else
	 {
		System.out.println("The guess is wrong not an "+ str +" in the word");
		timesOfGuess--;
		System.out.println("you have  "+ timesOfGuess +" guesses left");
		System.out.println("The words now looks like this : "+ initialDisplay);
		printMan(timesOfGuess);
		if(gameOver(timesOfGuess)==true){
			System.out.println("You failed this game");
			return;
		}
		handleGuess(choosedWord,initialDisplay,timesOfGuess);
	 }
}

public static void  InitialisesWords(ArrayList list){
	list.add("hello");
	list.add("world");
	list.add("worlda");
	list.add("worldab");
	list.add("worldabc");
	list.add("worldabcd");
	list.add("tianhao");
  }
public static String chooseWord(ArrayList list){
	  int  t = (int)(Math.random()*list.size());
	  return (String) list.get(t);
  }
public static void  printMan(int num){
	if(num == 8){
//		System.out.println(" ------------- ");
//		System.out.println("|        |  ");
	}
	else if(num == 7){
		System.out.println(" ------------- ");
		System.out.println("|        |  ");
		System.out.println("|        O  ");
	}
	else if(num == 6){
		System.out.println(" ------------- ");
		System.out.println("|        |  ");
		System.out.println("|        O  ");
		System.out.println("|        |  ");
	}
	else if(num == 5){
		System.out.println(" ------------- ");
		System.out.println("|        |  ");
		System.out.println("|        O  ");
		System.out.println("|        |  ");
		System.out.println("|     ---    ");
	}
	else if(num == 4){
		System.out.println(" ------------- ");
		System.out.println("|        |  ");
		System.out.println("|        O  ");
		System.out.println("|        |  ");
		System.out.println("|     --- ---   ");
	}
	else if(num == 3){
		System.out.println(" ------------- ");
		System.out.println("|        |  ");
		System.out.println("|        O  ");
		System.out.println("|        |  ");
		System.out.println("|     --- ---   ");
		System.out.println("|       /    ");
		System.out.println("|      /    ");
	}
	else if(num == 2){
		System.out.println(" ------------- ");
		System.out.println("|        |  ");
		System.out.println("|        O  ");
		System.out.println("|        |  ");
		System.out.println("|     --- ---   ");
		System.out.println("|       / \\ ");
		System.out.println("|      /   \\");
	}
	else if(num == 1){
		System.out.println(" ------------- ");
		System.out.println("|        |  ");
		System.out.println("|        O  ");
		System.out.println("|        |  ");
		System.out.println("|     --- ---   ");
		System.out.println("|       / \\ ");
		System.out.println("|      /   \\");
		System.out.println("|    ---    ");
	}
	else if(num == 0){
		System.out.println(" ------------- ");
		System.out.println("|        |  ");
		System.out.println("|        O  ");
		System.out.println("|        |  ");
		System.out.println("|     --- ---   ");
		System.out.println("|       / \\ ");
		System.out.println("|      /   \\");
		System.out.println("|    ---    ---");
	}
 }
}
