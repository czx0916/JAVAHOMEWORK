package javaHomework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ATM_homework6 {

	public static void main(String[] args) {
		Atm  atm = new Atm();
		handleATM(atm);
//		login(atm, "q");
	}

public static void CreatNewUser(Atm atm) {
		System.out.print("Please set you bankAccountNumber :");
		Scanner sc = new Scanner(System.in);
		String bankAccountNumber = sc.nextLine();
		System.out.print("Please set you password :");
		String password = sc.nextLine();
		System.out.print("Please set you name :");
		String name = sc.nextLine();
		System.out.print("Please set you age :");
		String age = sc.nextLine();
		System.out.print("Please set you address :");
		String address = sc.nextLine();
		System.out.print("Please set you phoneNumber :");
		String phoneNumber = sc.nextLine();
		atm.addUser(new User(age,phoneNumber,bankAccountNumber,name,address), password);
		System.out.println("New User Created");
		login(atm, bankAccountNumber);
	}
public static void handleATM(Atm atm){
		System.out.println("New user or Current user\n     1.New User\n     2.Current User");
		System.out.print("Your Choose: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.equals("1"))
			CreatNewUser(atm);
		else if(str.equals("2"))
			CurrentControl(atm);
		else
		{
			System.out.println("error input");
			handleATM(atm);
		}
	}

public static void CurrentControl(Atm atm) {
		System.out.print("Please set you bankAccountNumber :");
		Scanner sc = new Scanner(System.in);
		String bankAccountNumber = sc.nextLine();
		System.out.print("Forget password ? :");
		String whetherforget = sc.nextLine();
		if(whetherforget.equals(true)){
			ForgetPassword(atm,bankAccountNumber);
		}
		System.out.print("Please set you password :");
		String password = sc.nextLine();
		if(atm.contains(bankAccountNumber,password)){
			login(atm,bankAccountNumber);
		}
		else
			{
			System.out.println("error bankAccountNumber or password");
			CurrentControl(atm);
			}
	}

public static void ForgetPassword(Atm atm, String bankAccountNumber) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please set you name :");
		String name = sc.nextLine();
		System.out.print("Please set you age :");
		String age = sc.nextLine();
		System.out.print("Please set you phoneNumber :");
		String phoneNumber = sc.nextLine();
		if(atm.forgetPassword(name,age,phoneNumber,bankAccountNumber)){
			login(atm,bankAccountNumber);
		}
		else{
			System.out.println("error input");
			ForgetPassword(atm, bankAccountNumber);
		}
	}

public static void login(Atm atm, String bankAccountNumber) {
		System.out.print("1.availableBalance\n2.withDrawal\n3.deposit\n4.recentTransactions\n5.changePassword\n6.exit. ");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		if(choice.equals("1"))
			{
			System.out.println(atm.availableBalance(bankAccountNumber));
			login(atm,bankAccountNumber);
			}
		else if(choice.equals("2"))
			withDrawal(atm,bankAccountNumber);
		else if (choice.equals("3"))
			deposit(atm,bankAccountNumber);
		else if (choice.equals("4"))
			recentTransactions(atm,bankAccountNumber);
		else if (choice.equals("5"))
			changePassword(atm,bankAccountNumber);
		else if (choice.equals("6"))
			return;
		else
		{
			System.out.println("error input");
			login(atm, bankAccountNumber);
		}
	}

public static void recentTransactions(Atm atm, String bankAccountNumber) {
		System.out.println(atm.getrecentTransactions(bankAccountNumber));
		login(atm, bankAccountNumber);
	}

public static void changePassword(Atm atm, String bankAccountNumber) {
		System.out.println("New Password : ");
		Scanner sc = new Scanner(System.in);
		String newpassword = sc.nextLine();
	    atm.changepassword(bankAccountNumber,newpassword);
	    System.out.println("change password success ");
	    login(atm, bankAccountNumber);
	}

public static void deposit(Atm atm, String bankAccountNumber) {
		System.out.println("deposit amount :");
		Scanner sc = new Scanner(System.in);
		String depositamount = sc.nextLine();
		atm.deposit(bankAccountNumber,depositamount);
		System.out.println("deposit success");
		login(atm, bankAccountNumber);
	}

public static void withDrawal(Atm atm, String bankAccountNumber) {
		System.out.println("withDrawal amount :");
		Scanner sc = new Scanner(System.in);
		String withDrawalamount = sc.nextLine();
		atm.withDrawalamount(bankAccountNumber,withDrawalamount);
		System.out.println("withDrawal success");
		login(atm, bankAccountNumber);
	}


}
