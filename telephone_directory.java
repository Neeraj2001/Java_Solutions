import java.util.*;
interface telephone
{
	int number(int n);

}
public class telephone_directory
{
	public static void main(String args[])
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner ip = new Scanner(System.in);
		System.out.println("enter name ");
		String s = ip.next();
		int sw =ip.nextInt();
		System.out.print("1 . One contact\n2 . Two contact\n3 . Three contact\n4 . Four contact\5 . Close");
		int i=0;
		do{
		switch(sw)
		{
			 case 1:
			   System.out.println("One contact");
			 
			   telephone t1 = n->
			   {
			 	 a.add(n);
			   };
			   System.out.println(a);

               break;
			 case 2:
			   
			   System.out.println("Two contact");
			   while(i-- <2)
			   {
			   	telephone t2 = n->
			   {
			 	 a.add(n);
			 	 a.add(n);
			   };
			   }
			   System.out.println(a);
			  
			   break;
			 case 3:
			   System.out.println("Three contact");
			   //int i=0;
			   while(i-- <3)
			   {
			   	telephone t3 = n->
			   {
			 	 a.add(n);
			   };
			   }
			   System.out.println(a);
			    break;
			 case 4:
			   System.out.println("Four contact");
			   //int i=0;
			   while(i-- <4)
			   {
			   	telephone t4 = n->
			   {
			 	 a.add(n);
			   };
			   }
			   System.out.println(a);
			   break;
			 case 5:
			   System.out.println("Close");
			   exit(0);

			 default:
			   System.out.println("wrong input");
		}


}while(sw != 5);


	}
}