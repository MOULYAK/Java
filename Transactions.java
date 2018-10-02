package org.capgemini;
import java.util.Date;

public class Transactions {
	private int transactionId;
	private Date transactionDate;
	
	private String transactionType;
	private double transactionAmount;
	private Account account[];
	private String[] transactionSummary;
	public Transactions(){
		
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Account[] getAccount() {
		return account;
	}
	public void setAccount(Account[] account) {
		this.account = account;
	}
	public String[] getTransactionSummary() {
		return transactionSummary;
	}
	public void setTransactionSummary(String[] transactionSummary) {
		this.transactionSummary = transactionSummary;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

}
