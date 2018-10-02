package org.capgemini;

public class Customer {
 private int customerId;
 private String customerName;
 private Address address;
 private Account account[];
 private String mobileNo;
 private String emailId;
 private int accountNo;
 private int accountCount;

 public Customer()
 {
	 
 }
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Account[] getAccount() {
	return account;
}
public void setAccount(Account[] account) {
	this.account = account;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public int getAccountCount()
{
	return this.accountCount;
}
public void setAccountCount(int accountCount)
{
	this.accountCount=accountCount;
	
}
public int get1AccountNo(int accountCount)
{
	return account[accountCount].getAccountNo();
	
}



 
}
