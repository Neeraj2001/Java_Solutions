import java.util.Scanner;
class Banking_neeraj
{
	public static void main(String args[])
	{
		int amount = 100 ;
		int id;
		String name;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Details");
		//acc = a.nextInt();
		id = a.nextInt();
		name = a.next();
		System.out.println("1 : Withdraw"+'\n'+"2 : Deposit");
		int sel =a.nextInt();
		switch(sel)
		{
			case 1:
			System.out.println("Enter Amount to Withdraw ");
			int am = a.nextInt();
			if(am >= 0 || am > amount){
				amount = amount+am;
			}
			else{
				System.out.println("not valid");
			}
            break;
			case 2:
			System.out.println("Enter amount to Deposit");
            int amo = a.nextInt();


            break;
			
			

		} 
		//System.out.println("Amount"+);
		System.out.println("Id  -" +id);
		System.out.println("Name  -" + name);
	}
}