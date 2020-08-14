import java.util.Scanner;

class Bank
{
     String accno;  
     String name;
	long Bal;

	Scanner Sc=new Scanner(System.in);
	
	
	void openAccount()
	{ 
		System.out.print("Enter Account No: ");
		accno=Sc.next();
		System.out.print("Enter Name: ");
		name=Sc.next();
		System.out.print("Enter Balance: ");
		Bal=Sc.nextLong();
	}

	void showAccount()
	{ 
		System.out.println(accno+","+name+","+Bal);
	}

	void deposit()
	{
		long amount;
		System.out.println("Enter Amount U Want to Deposit : ");
		amount=Sc.nextLong();
		Bal=Bal+amount;
	}

	void withdrawal()
	{
		long amount;
		System.out.println("Enter Amount U Want to withdraw : ");
		amount=Sc.nextLong();
		if(Bal>=amount)
		{ 
			Bal=Bal-amount;
		}
		else
		{
			System.out.println("Less Balance..Transaction Failed..");
		}
	}

	boolean search(String acn)
	{ 
		if(accno.equals(acn))
		{ 
			showAccount();
			return(true);
		}
		return(false);
	}
}

class Account
{  
	public static void main(String arg[])
	{
		Scanner Sc=new Scanner(System.in);
		
		//create initial accounts
		System.out.print("How Many Customer U Want to Input : ");
		int n=Sc.nextInt();
		Bank  C[]=new Bank[n];
		for(int i=0;i<C.length;i++)
		{   
			C[i]=new Bank();
			C[i].openAccount();
		}
		
		//run loop until menu 5 is not pressed
		int ch;
		do
		{
			System.out.println("Main Menu\n1.Display All\n2.Search By Account\n3.Deposit\n4.Withdrawal\n5.Exit");
			System.out.println("Ur Choice :");
			ch=Sc.nextInt();
			switch(ch)
			{ 
				case 1:
					for(int i=0;i<C.length;i++)
					{
						C[i].showAccount();
					}
					break;

				case 2:
					System.out.print("Enter Account No U Want to Search ");
					String acn=Sc.next();
					boolean found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed Account Not Exist..");
					}
					break;

				case 3:
					System.out.print("Enter Account No : ");
					acn=Sc.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].deposit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed Account Not Exist");
					}
					break;

				case 4:
					System.out.print("Enter Account No : ");
					acn=Sc.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].withdrawal();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 5:
					System.out.println("Good Bye..");
					break;
			}
		}
		while(ch!=5);
	}
}
