package javaHomework;

public class JavaHomework2 {

	public static void main(String[] args) {
		double salary = employeeSalary(60.0);
		System.out.println("the salary of the employee is :"+salary);
		int sumdigit = addDigits(12);
		System.out.println("the sum digit of input is : "+ sumdigit);
		printPerfectNumbers(10000);
		printIsoscelesTriangle(15);
	
	}
	public static double employeeSalary(double hours){
		if(hours<=0){
			return 0.0;
		}
		double salary;
		if(hours<=36){
			salary = hours * 15.0;
			
		}
		else if(hours-36<=5)
		{
			double temp = hours -36;
			
		salary= 36*15+(hours-36)*15*1.5;
					
		}
		else 
			{
			System.out.println("errer input,the worker have work too much hours");
		    return -1;
		    }
		return salary;
	}
     public static int addDigits(int input){
		int sum = 0;
	      if(input<10){
	    	  return input;
	      }
    	 while(input%10 != 0){
    		 sum = sum + input%10;
    		 input = input/10;
    	 }
	return sum;
		}
     public static void printPerfectNumbers(int n){
 		 System.out.print("the perfect number between 1 to "+ n +" is :"); 
 		 for(int i=1;i<=n;i++){
 			if(IsPerfectNumber(i)!=0)
 			 System.out.print(IsPerfectNumber(i)+" ");
 			
 		 }
 		 System.out.println("");
 		}
     public static int IsPerfectNumber(int number){
    	 int sum = 0;
    	 for(int i =1;i<number;i++){
    		 if(number%i==0){
    			 sum = sum +i;
    		 }
    	 }
    	 if(sum == number)
    		 return number;
    	 return 0;
     }
     public static void printIsoscelesTriangle(int n){
 		for(int i=1;i<=n;i++){
 			if(i==1){
 				System.out.println("*");
 			}
 			else if(i>1&&i<n){
 		    	System.out.print("*");
 		    	for(int x=1;x<=i-2;x++){
 		    		System.out.print(" ");
 		    	}
 		    	System.out.println("*");
 		    }
 			else if(i == n){
 		    	for(int m=0;m<n;m++){
 		    		System.out.print("*");
 		    	}
 		    }
 		   }
 		
 		}
}

