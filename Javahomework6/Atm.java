package javaHomework;

import java.util.ArrayList;
import java.util.HashMap;

public class Atm{
	private double transactionFee;
	private int availableAmountInMachine;
	private ArrayList<String> recentTransactions;
	public ArrayList<String> getrecentTransactions(String bankAccountNumber) {
		return userDataforrecentTransactions.get(bankAccountNumber);
	}
	public void withDrawalamount(String bankAccountNumber, String withDrawalamount) {
		int total = Integer.valueOf(userDataformoney.get(bankAccountNumber))-Integer.valueOf(withDrawalamount);
		if(total>=0){
		userDataformoney.put(bankAccountNumber, String.valueOf(total));
		String Transactions = "withDrawal :  withDrawalamount";
		addTransactions(bankAccountNumber,Transactions);
		availableAmountInMachine = availableAmountInMachine - Integer.valueOf(withDrawalamount);
		}
		else
			System.out.println("Your account do not have enough money");
	}
	public void deposit(String bankAccountNumber, String depositamount) {
		int total = Integer.valueOf(userDataformoney.get(bankAccountNumber))+Integer.valueOf(depositamount);
		userDataformoney.put(bankAccountNumber, String.valueOf(total));
		String Transactions = "deposit : depositamount";
		addTransactions(bankAccountNumber,Transactions);
		availableAmountInMachine = availableAmountInMachine + Integer.valueOf(depositamount);
	}
private void addTransactions(String bankAccountNumber, String transactions) {
		if(userDataforrecentTransactions.get(bankAccountNumber).size()<10)
			userDataforrecentTransactions.get(bankAccountNumber).add(transactions);
		else
		{
			userDataforrecentTransactions.get(bankAccountNumber).remove(0);
			userDataforrecentTransactions.get(bankAccountNumber).add(transactions);
		}
	}
	public void changepassword(String bankAccountNumber, String newpassword) {
		userData.put(userDataforbn.get(bankAccountNumber), newpassword);
	}

	private HashMap<User,String> userData;//密码和用户
	private HashMap<String,User> userDataforbn;//账户名和用户
	private HashMap<String,String> userDataformoney;//账户名和余额
	private HashMap<String,ArrayList<String>> userDataforrecentTransactions;//账户名和交易信息
	public Atm(){
		transactionFee = 0.01;
		availableAmountInMachine = 100000;
		recentTransactions = new ArrayList<String>();
		this.userData = new HashMap<User,String>();
		this.userDataforbn = new HashMap<String,User>();
		this.userDataformoney = new HashMap<String,String>();
		this.userDataforrecentTransactions = new HashMap<String,ArrayList<String>>();
	}
	public String availableBalance(String bankAccountNumber) {
		return userDataformoney.get(bankAccountNumber);
	}
	public boolean forgetPassword(String name, String age, String phoneNumber, String bankAccountNumber) {
		if(userDataforbn.get(bankAccountNumber).getName().equals(name)&&
		  (userDataforbn.get(bankAccountNumber).getAge().equals(age)&&
		  (userDataforbn.get(bankAccountNumber).getPhoneNumber().equals(phoneNumber))))
				return true;
		return false;
	}
	public boolean contains(String bankAccountNumber, String password) {
		if(!userDataforbn.containsKey(bankAccountNumber))
			return false;
		else if(userData.get(userDataforbn.get(bankAccountNumber)).equals(password))
			return true;
		return false;
	}
	public void addUser(User user,String password){
		userData.put(user, password);
		userDataforbn.put(user.getName(),user);
		userDataformoney.put(user.getName(), "0");
		userDataforrecentTransactions.put(user.getName(),new ArrayList<String>());
	}
	
}