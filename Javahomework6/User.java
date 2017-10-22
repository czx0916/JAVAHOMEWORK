package javaHomework;

public class User{
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBankaccountNumber() {
		return bankaccountNumber;
	}
	public void setBankaccountNumber(String bankaccountNumber) {
		this.bankaccountNumber = bankaccountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String age;
	private String phoneNumber;
	private String bankaccountNumber;
	private String name;
	private String address;
	public User(String age,String phoneNumber,String bankaccountNumber,String name,String address){
		this.age = age;
		this.address = address;
		this.bankaccountNumber = bankaccountNumber;
		this.name = name;
		this.address = address;
	}
}
