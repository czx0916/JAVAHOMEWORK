package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mid_term {

	public static void main(String[] args) {
//		System.out.println(arrangeCoins(5));
//		System.out.println(arrangeCoins(1));
//		System.out.println(arrangeCoins(10));
//		System.out.println(arrangeCoins(15));
//		System.out.println(arrangeCoins(16));
//		int[] nums = {1,2,3};
//System.out.println(countNumberOfpossibleWays(5,5,7));
//System.out.println(minMoves(nums));
		int[][]  test = {{1,0,0,0},{1,1,1,1},{0,1,0,0},{1,1,1,1}};
		System.out.println(findpath(test));
	}
public static int arrangeCoins(int n){
	// Why i <= Integer.MAX_VALUE, it can work, but not the optimal way to deal with it
	for(int i =1;i<=Integer.MAX_VALUE;i++)
	{  int num = (1+i)*i;
		if(num>2*n)
			return i-1;
	}
	return -1;
 }
public static int[] reverseEvenIndices(int[] nums){
	int i=0;
	int j=nums.length-1;
		if(nums.length%2==0)
			j=j-1;
		while(i<=j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		i=i+2;
		j=j-2;
		}
	return nums;
 }

public static int minMoves(int[] nums){
	Arrays.sort(nums);
	int sum = 0;
	for(int i=0;i<nums.length;i++)
		sum+=(nums[i]-nums[0]);
	return sum;
}
public static int countNumberOfpossibleWays(int m ,int n,int x){
    List<Integer> list = new ArrayList<Integer>();
	DFScountNumber(m,n,x,0,list);	
	return list.size();
}
private static void DFScountNumber(int diceFace, int totalNumber, int sum, int diceNumber,List<Integer> list) {
	if(sum<0)
		return ;
	else if(sum==0&&diceNumber==totalNumber)
		{
		list.add(1);
		}
	else
	{
		for(int i = 1;i<=diceFace;i++)
DFScountNumber(diceFace, totalNumber, sum-i, diceNumber+1, list);
	}
}
public static ArrayList<Cell>  findpath(int[][] maze){
	ArrayList<Cell> res = new ArrayList<Cell>();
	if(maze==null||maze.length==0)
		return res;
	boolean flag = false;
	DFS(maze,res,0,0,flag);
	return res;
	
}
private static void DFS(int[][] maze, ArrayList<Cell> res, int i, int j,boolean flag) {
	if(i==maze[0].length||j==maze.length)
		{
		return;
		}
	if(maze[i][j]==0||flag==true)
		{
		return;
		}
	if(i==maze[0].length-1&&j==maze.length-1){
		res.add(new Cell(i,j));
		flag = true;
		return;
	}
	res.add(new Cell(i,j));
	DFS(maze, res, i, j+1,flag);
	DFS(maze, res, i+1, j,flag);
	
	
}


}
class Cell{
	int x,y;
	Cell(int x,int y){
		this.x = x;
		this.y = y;
	}
public String toString(){
		return "[ " + this.x+" , "+this.y+" ]";
	}
}
