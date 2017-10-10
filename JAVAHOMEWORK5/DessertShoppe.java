package JAVAHOMEWORK5;

class DessertShoppe{
	public static final double DOZEN = 12;
	public static final double CENTSTODOLLARS = 0.01;
	public static final double TAX = 0.02;
	public static final int OUTPUT_LENGTH = 37;
	
	
	public static String centsToDollars(double cents){
		return String.format("%.2f",cents*CENTSTODOLLARS);
	}
	
}