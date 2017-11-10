package javaHomework;

public class ReverseHello {

	public static void main(String[] args) {
		
		helloThread hs = new helloThread(0);
		hs.start();
	}

}
class helloThread extends Thread {
	private int num;
	public helloThread(int num){
		this.num = num;
	}
	public void run(){
		if(num<=50)
		{
			helloThread hs = new helloThread(num+1);
			hs.start();
			try {
				hs.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello from Thread "+num);
		}
	}
}