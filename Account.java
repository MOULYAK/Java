package org.capgemini;
import java.util.Date;
public class Account {
private int accountNo;
private String accountType;
private Date openingDate;
private double openingBalance;
public Account(){
	
}
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public Date getOpeningDate() {
	return openingDate;
}
public void setOpeningDate(Date openingDate) {
	this.openingDate = openingDate;
}
public double getOpeningBalance() {
	return openingBalance;
}
public void setOpeningBalance(double openingBalance) {
	this.openingBalance = openingBalance;
}

}
