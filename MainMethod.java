package org.capgemini;
import java.util.*;


public class MainMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Ënter the no.of customers");
int size=scan.nextInt();
		Customer[] cust=new Customer[size];
		Account[] acc=new Account[4];	
		Transactions trans=new Transactions();

		for(int i=0;i<size;i++)
		{
			System.out.println("---------------Enter  Customer details-------------");
			System.out.println("Enter The CustomerId:");
			int n=scan.nextInt();
			System.out.println("Enter Customer Name: ");
			String s=scan.next();
			 Address a=new Address();
			 System.out.println("Enter Customer street Name:");
				String stn=scan.next();
				
		 System.out.println("Enter Customer Address:");
          String add=scan.next();
			
			 System.out.println("Enter Customer city Name:");
				String city=scan.next();
				
				 System.out.println("Enter Customer state Name:");
					String state=scan.next();
				
			System.out.println("Enter Customer Mobile No: ");
			String phno=scan.next();
			System.out.println("Enter Customer EmailId: ");
			String email=scan.next();
			a.setStName(stn);
			 a.setAddress(add);
			 a.setCity(city);
			 a.setState(state);
			cust[i]=new Customer();
			cust[i].setCustomerId(n);
			cust[i].setCustomerName(s);
			cust[i].setAddress(a);
			//cust[i].setAccount(acc);
			cust[i].setMobileNo(phno);
			cust[i].setEmailId(email);
		}
		String s="";
		do{
			
		System.out.println("Choose An Option");
		System.out.println("1.Genertate Account \n2.Do Transaction \n3.Transaction Summary \n4.Display Customer Details");
		int ch=scan.nextInt();
		
		switch(ch)
		{
		case 1:
			String c;
			
			int j=0,m=0;
			do{
				System.out.println("Give the customerId");
				int custId=scan.nextInt();
				for(int i=0;i<size;i++)
				{
					if(cust[i].getCustomerId()==custId)
					{
						m=i;
						cust[i].setAccount(acc);
						
					}
					else
					{
						System.out.println("CustomerId does not exist");
						
						
					}
				}
				
			System.out.println("--------Enter Account Details-----");
			
			 acc[j]=new Account();
			System.out.println("Enter Account Number");
			int accountNo=scan.nextInt();
			acc[j].setAccountNo(accountNo);
			System.out.println("Choose Account Type");
			System.out.println("1.Savings \n2.Current \n3.RD  \n4.FD");
			int atype=scan.nextInt();
			String accountType="";
			switch(atype)
			{
			case 1:
				accountType="Savings";
				break;
			case 2:
				accountType="Current";
				break;
			case 3:
				accountType="RD";
				break;
			case 4:
				accountType="FD";
				break;
				default :
					System.out.println("Enter valid Account Type");
					break;
			}
			acc[j].setAccountType(accountType);
			Date date= new Date();
			acc[j].setOpeningDate(date);
			System.out.println("Enter Account openingBalance");
			double bal=scan.nextDouble();
			acc[j].setOpeningBalance(bal);
			System.out.println("Want to generate another Account [Y|N]");
			c=scan.next();
		      j++;
		      cust[m].setAccountCount(j);
		     
			}while(c.charAt(0)=='y'||c.charAt(0)=='Y');
			
			
									break;
		case 2:
			System.out.println("Give the customerId");
			int custId=scan.nextInt();
			for(int i=0;i<size;i++)
			{
				
				if(cust[i].getCustomerId()==custId)
				{ 
					trans.setAccount(acc);
					System.out.println("Enter Transaction Id");
					int transId=scan.nextInt();
					trans.setTransactionId(transId);
					Date d=new Date();
					trans.setTransactionDate(d);
					System.out.println("Choose Transaction type");
					System.out.println("1.Debit \n2.Credit");
					int trancho=scan.nextInt();
					String transtype="";
					switch(trancho)
					{
					case 1:
						transtype="Debit";
						break;
					case 2:
						transtype="Credit";
						break;
						default:
							System.out.println("Transaction not feesible");
							break;
						
					}
					trans.setTransactionType(transtype);
					System.out.println("Enter Amount to be Transacted ");
					double transam=scan.nextDouble();
					trans.setTransactionAmount(transam);
					
						     	//System.out.println(k);
					int  k=cust[i].getAccountCount();
							for(int t=0;t<k;t++)
							{
								System.out.println("Choose account "+t+1+" "+cust[i].get1AccountNo(t));
							   
							}
						   int choice=scan.nextInt();
						   if(choice<=k)
						   {
							   if(transtype=="Debit")
							   transam=acc[choice].getOpeningBalance()-transam;
							   else
								   transam=acc[choice].getOpeningBalance()+transam;

							   acc[choice].setOpeningBalance(transam);
						   }
						  
										
					
					
					
				}
				else
				{
					System.out.println("CustomerId does not exist");
				}
				
			}
			
			
			break;
		case 3:
			System.out.println("Transaction Summary is");
			
				
			break;
		case 4:
			System.out.println("Customer and respective Account details");
			System.out.println("Give the customerId");
			int custId1=scan.nextInt();
			int k=0;
			for(int i=0;i<size;i++)
			{
				
				if(cust[i].getCustomerId()==custId1)
				{
					 k=cust[i].getAccountCount();
				     	//System.out.println(k);
					System.out.println(cust[i].getCustomerId()+" \t"+cust[i].getCustomerName()+" \t"+cust[i].getEmailId()+" \t"+cust[i].getMobileNo()+" \t");
					for(int t=0;t<k;t++)
					{
						System.out.println("Account "+cust[i].get1AccountNo(t));
					}
				    
				}				
				else
				{
					System.out.println("CustomerId does not exist");
					//System.exit(0);
					
				}
				
			}
			break;
		       default :
				break;
				
		}
		System.out.println("Want to Repeat [Y|N]");
		s=scan.next();
		}while(s.charAt(0)=='Y'|| s.charAt(0)=='y');
		//System.out.println("accounts:::"+acc[0].getAccountNo());
		//System.out.println("Cut account det"+cust[0].getAccount());
		//System.out.println(acc[1]);
	}
	

}
