package javaHomework;

import java.util.ArrayList;

public class printPascalTriangle {

	public static void main(String[] args) {
		System.out.println(PascalTriangle(5));

	}
  public static ArrayList<ArrayList<Integer>> PascalTriangle(int n){
	  ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	  if(n<=0)
		  return res;
	  ArrayList<Integer> temp = new ArrayList<Integer>();
	  for(int i = 0;i<n;i++){
		  temp.add(0,1);
		  for(int j=1;j<temp.size()-1;j++)
			  temp.set(j, temp.get(j)+temp.get(j+1));
		  res.add(new ArrayList(temp));
	  }
	  return res;
  }
}
