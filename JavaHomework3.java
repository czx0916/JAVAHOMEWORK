package javaHomework;

import java.util.Arrays;

public class JavaHomework3 {

	public static void main(String[] args) {
		String str = "olleh";
		String str1 = "hello";
		System.out.println(CheckIfTwoStringsAreAnagrams(str, str1));
		System.out.println(caculater.quaraticEquation(1, 2, 3));
		
		//System.out.println(removeVowelsFromString(str));
		//System.out.println(str == str1);
		//System.out.println(str.compareTo(str1));

	}
public static String removeVowelsFromString(String input){
    // Consider upper case vowels
    input=input.replaceAll("a|e|i|o|u","");
	
	return input;
 }
// Does this method validate palindrome?
public static boolean CheckIfTwoStringsAreAnagrams(String s1,String s2){
	 
    String[] a1 = s1.split("");
    String[] a2 = s2.split("");
	
    String s3 = "";
    String s4 = "";
	if(a1.length!=a2.length){
		return false;
	}
	for(int i=0;i<a1.length/2;i++){
		String temp = "";
		temp =a1[i];
		a1[i]=a1[a1.length-1-i];
		a1[a1.length-i-1]=temp;
	}

	for(int i=0;i<a1.length;i++){
		s3 = s3 + a1[i];
		s4 = s4 + a2[i];
		}

	
	if(s3.equals(s4)){
	return true;}
	return false;
	
}
public static boolean CheckIfTwoStringsAreAnagrams1(String s1,String s2){
	if (s1.length() != s2.length()) {
    return false;
}
char[] str1 = s1.toCharArray();
char[] str2 = s2.toCharArray();
Arrays.sort(str1);
Arrays.sort(str2);

return Arrays.equals(str1, str2);

}
}
class caculater{
	static double adder(double num1,double num2){
		return num1+num2;
	}
	static double substractor(double num1,double num2){
		return num1-num2;
	}
	static double multiplicator(double num1,double num2){
		return num1*num2;
	}
	static double divisor(double num1,double num2){
		return num1/num2;
	}
	static double squareRoot(double num1){
		return Math.sqrt(num1);
	}
	static double square(double num1){
		return num1*num1;
	}
	static double cube(double num1){
		return num1*num1*num1;
	}
	static double FahrenheitToCelsius(double num1){
		return (num1-32.00)*9/5;
	}
	static double FeetToinche(double num1){
		return num1/12;
	}
	static double[] quaraticEquation(double a,double b,double c){
		double[]  result = new double[2];
		// What if a == 0?
		if(Math.sqrt(b*b-4*a*c)>=0){
			result[0] = (-b+Math.sqrt(b*b-4*a*c))/2*a;
			result[1] = (-b-Math.sqrt(b*b-4*a*c))/2*a;
			return result;
		}
		return result;
	}
}
