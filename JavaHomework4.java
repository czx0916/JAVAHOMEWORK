package javaHomework;

import java.util.Arrays;

public class JavaHomework4 {

	public static void main(String[] args) {
//		System.out.println(problem1("asddffasd", 2));
//		Scissors s = new Scissors(5);
//		 Paper p = new Paper(7);
//		 Rock r = new Rock(15);
//		 System.out.println(s.fight(p) + " , "+ p.fight(s) );
//		 System.out.println(p.fight(r) + " , "+ r.fight(p) );
//		 System.out.println(r.fight(s) + " , "+ s.fight(r) );
//		 IpAddress ip = new IpAddress("216.27.6.136");
//		 System.out.println(ip.getDottedDecimal());
//		 System.out.println(ip.getOctet(4));
//		 System.out.println(ip.getOctet(1));
//		 System.out.println(ip.getOctet(3));
//		 System.out.println(ip.getOctet(2));
		int[] t = {1,2,3};
		int[] t1 = {4,5,6};
		System.out.println(findMedianSortedArrays(t, t1));
		
	}
/*
 * question 1	
 */
 public static String problem1(String s,int k){
	 s.replace("/-", "");
	 s.toUpperCase();
	 String[] s3 = s.split("");
	 String[] res = new String[s.length()/k+1];
	 String result = "";
	 int length =(s3.length-s3.length%k)/k-1;
	 int count = 0;
	 res[0] = res[0] +"-";
	 for(int i=0;i<res.length;i++){
		if(i==0){
			if(s3.length%k==0){
				for(int x = 0;x<s3.length/k;x++)
					res[0] = res[0]+s3[count++];
			}
			else 
				for(int x = 0;x<s3.length%k;x++)
					res[0] = res[0]+s3[count++];
		}
		else{ 
			for(int j=0;j<length;j++)
			res[i] = res[i]+s3[count++];
		res[i] = res[i] +"-";
		}
	 }
	for(int i = 0;i<res.length;i++)
		result = result + res[i];
	 return result;
 }
 /*
  * question 5
  */ 
 public static String intToRoman(int num){
	   int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i=0;i<values.length;i++) {
	        while(num >= values[i]) {
	            num -= values[i];
	            sb.append(strs[i]);
	        }
	    }
	    return sb.toString();
 }
 /*
  * extra credit
  */  
 public static double findMedianSortedArrays(int[] nums1, int[] nums2){
	 double[] res = new double[nums1.length+nums2.length];
	 int num = 0;
	 for(int i=0;i<nums1.length;i++){
		 res[num] = nums1[i]; 
		 num = num+1;
	 }
	 for(int i=0;i<nums2.length;i++){
		 res[num] = nums2[i]; 
		 num = num+1;
	 }
	 Arrays.sort(res);
		if((nums1.length+nums2.length)%2==0){
			return (res[res.length/2]+res[res.length/2-1])/2;
		}
		else
			return res[res.length/2];
 }
}
/*
 * question 2	
 */
class Tool{
	protected char type;
	private int strength;
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
}
class Rock extends Tool{
	public Rock(int strength){
		super.setStrength(strength);
		super.type = 'r';
	}
	public boolean fight(Tool tool){
		if(tool.type=='s'){
			if(2*tool.getStrength()>=super.getStrength())
				return true;
			else 
				return false;
		}
		else if(tool.type=='p')
			if(tool.getStrength()>=2*super.getStrength())
				return true;
			else 
				return false;
		else 
			if(tool.getStrength()>=super.getStrength())
				return true;
			else 
				return false;
			
	}
}
class Paper extends Tool{
	public Paper(int strength){
		super.setStrength(strength);
		super.type = 'p';
	}
	public boolean fight(Tool tool){
		if(tool.type=='r'){
			if(2*tool.getStrength()>=super.getStrength())
				return true;
			else 
				return false;
		}
		else if(tool.type=='s')
			if(tool.getStrength()>=2*super.getStrength())
				return true;
			else 
				return false;
		else 
			if(tool.getStrength()>=super.getStrength())
				return true;
			else 
				return false;
			
	}
}
class Scissors extends Tool{
	public Scissors(int strength){
		super.setStrength(strength);
		super.type = 's';
	}
	public boolean fight(Tool tool){
		if(tool.type=='p'){
			if(2*tool.getStrength()>=super.getStrength())
				return true;
			else 
				return false;
		}
		else if(tool.type=='r')
			if(tool.getStrength()>=2*super.getStrength())
				return true;
			else 
				return false;
		else 
			if(tool.getStrength()>=super.getStrength())
				return true;
			else 
				return false;
			
	}
}
/*
 * question 3	
 */
class IpAddress{
	private String ip;
	public IpAddress(String ip){
		this.ip = ip;
	}
	public String getDottedDecimal(){
		return this.ip;
	}
	public String getOctet(int num){
	   String[] res = this.ip.split("\\.");
	   return res[num-1];
	}
}
/*
 * question 4
 */
class Student{
	private String name;
	private int id;
	public Student(String name,int id){
		this.name = name;
		this.id = id; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
class Course{
	private String name;
	private int numberOfStudent = 0;
	String[] nameOfStudent = new String[10];
	public Course(String name){
		this.name = name;
	}
	public void Register(Student stu){
		if(numberOfStudent<10)
		{
		nameOfStudent[numberOfStudent] = stu.getName();
		numberOfStudent++;
		}
		else
		System.out.println("the class have 10 student already");
	}
	public String[] getStudents(){
		return nameOfStudent;
	}
	public boolean isFull(){
		if(numberOfStudent<10)
			return false;
		else
			return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}
}
