package javaHomework;

public class MaxValue {

	public static void main(String[] args) throws InterruptedException{
		int[] array = new int[10];
		for(int i = 0;i<array.length;i++)
			{
			array[i] = (int)(Math.random()*100);
			System.out.println(array[i]);
			}
		System.out.println("the max number in the array is : "+findmax(array,0,array.length));
		

	}
    public static int findmax(int[] array,int low ,int high) throws InterruptedException{
    	int max = 0;
    	myThread[] maxThread = new myThread[4];
        for(int i = 0;i<4;i++){
			maxThread[i] = new myThread(array,i*array.length/4,(i+1)*array.length/4);
			maxThread[i].start();
		}
    	for(int i=0;i<4;i++){
    		maxThread[i].join();
    		if(maxThread[i].max>max)
    			max = maxThread[i].max;
    	}
    	return max;
    }
}
class myThread extends Thread{
	public int  max = 0;
	private int low = 0;
	private int high = 0;
	private int[] array;
	public myThread(int[] array,int low,int high){
		this.array = array;
		this.low = low;
		this.high = high;
	}
	public void run(){
		for(int i = low;i<high;i++){
			if(array[i]>max)
				max = array[i];
		}
	}
}