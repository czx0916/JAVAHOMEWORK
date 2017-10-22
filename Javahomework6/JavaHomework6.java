package javaHomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class JavaHomework6 {

	public static void main(String[] args) throws MyIndexOutOfBoundException{
		int sc = (int)(Math.random()*15);
		try{
				throw new MyIndexOutOfBoundException(sc);
		}
         catch(MyIndexOutOfBoundException e){
        	 System.out.println(e);
         }
	}
	public static void parse(File file) throws IOException {
	    RandomAccessFile input = null;
	    String line = null;
	    
	    try {
	        input = new RandomAccessFile(file, "r");
	        while ((line = input.readLine()) != null) {
	            System.out.println(line);
	        }
	        return;
	    } finally {
	          if (input != null) {
	            input.close();
	          }
	      }
	}  

}
class MyIndexOutOfBoundException extends Exception{
	private int LOWERBOUND = 0;
	private int UPPERERBOUND = 10;
	private int index = 0;
	public MyIndexOutOfBoundException(int index){
			this.index = index;
	}
	public String toString(){
		return "Error Message: Index:" + index +", but Lower bound:"+LOWERBOUND +", Upper bound:"+UPPERERBOUND;
	}
 }







