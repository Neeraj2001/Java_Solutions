/*Write a java program to implement Home Budget Managemen.In which you have to include at least three from the given topicsas 
required: Inheritance, Overriding Methods, Polymorphism, Abstract Classes, Nested Classes, Interfaces, Lambda Expressions, 
Exceptional Handling and I/O Fundamentals.Avoid copying from given solution on website.Try to implement using the concept 
covered in the class.Solution must be unique for each student.Roll Number:37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,73
*/
//
import java.util.*;
import java.io.*;
interface intr
{
	public void home();
	public void inputs();
}
abstract class abs implements intr
{
    public void home()
    {
       System.out.println("   Home Budget Management System \n");
    }
}
class budget
{
	int bill;
	public budget(int bill)
	{
		super();
		this.bill = bill;
	}
}
class home_management extends abs
{
	public void inputs()
	{
       
	}
	public static void main(String args[]) throws Exception
	{
		File f = new File("E:\\Java Programms\\Files\\home_management.txt");
		OutputStream os= new BufferedOutputStream(new FileOutputStream("E:\\Java Programms\\Files\\home_management.txt"));
		String s = " Home Budget Management System\n ";
		byte[] b =s.getBytes();
		os.write(b);
        Scanner sc = new Scanner(System.in);
        intr obj = new home_management();
        obj.home();
        s = "1 . House Rent\n2 . Electicity\n3 . Water\n4 . Gas\n5 . Grocery\n6 . Cloths\n7 . Loan\n8 . Medical\n9 . Others";
        System.out.println("1 . House Rent\n2 . Electicity\n3 . Water\n4 . Gas\n5 . Grocery\n6 . Cloths\n7 . Loan\n8 . Medical\n9 . Others");
        b = s.getBytes();
        os.write(b);
        System.out.println("Enter the Bill Amount: ");
        //int ar[] = new int[10];
        List<budget> list = new ArrayList<>();
        int in=0;
         for(int i=1;i<=10;i++)
        {
            String s1;
            if(i == 1)
            {
                try{
                System.out.println("House Rent");
                int bill =sc.nextInt();
                 s1 = String.valueOf(bill);
                 s = "\n Home Rent : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));}
               catch(InputMismatchException exp)
        {
        System.out.println("You Entered non Integer Value");
        return;
        } 
                            }
            if(i == 2)
            {try{
                System.out.println("Electicity");
                int bill =sc.nextInt();
                 s1 = String.valueOf(bill);
                 s = "\n Electricity : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            } catch(InputMismatchException exp)
        {
        System.out.println("You Entered non Integer Value");
        return;
        } 
        }
            if(i == 3)
            {try{
                System.out.println("Water");
                int bill =sc.nextInt();
                 s1 = String.valueOf(bill);
                 s = "\n Water       : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            } catch(InputMismatchException exp)
        {
        System.out.println("You Entered non Integer Value");
        return;
        } }
            if(i == 4)
            {try{
                System.out.println("Gas");
                int bill =sc.nextInt();
                 s1 = String.valueOf(bill);
                 s = "\n Gas         : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            } catch(InputMismatchException exp)
        {
        System.out.println("You Entered non Integer Value");
        return;
        } }
            if(i == 5)
            {try{
                System.out.println("Grocery");
                int bill =sc.nextInt();
                 s1 = String.valueOf(bill);
                 s = "\n Grocery     : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            } catch(InputMismatchException exp)
        {
        System.out.println("You Entered non Integer Value");
        return;
        } }
            if(i == 6)
            {try{
                System.out.println("Cloths");
                int bill =sc.nextInt();
                s1 = String.valueOf(bill);
                 s = "\n Cloths      : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            } catch(InputMismatchException exp)
        {
        System.out.println("You Entered non Integer Value");
        } }
        if(i == 7)
            {try{
                System.out.println("Loan");
                int bill =sc.nextInt();
                s1 = String.valueOf(bill);
                 s = "\n Loan      : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            } catch(InputMismatchException exp)
        {
        System.out.println("You Entered non Integer Value");
        } }
        if(i == 8)
            {try{
                System.out.println("Medical");
                int bill =sc.nextInt();
                s1 = String.valueOf(bill);
                 s = "\n Medical      : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            } catch(InputMismatchException exp)
        {
        System.out.println("You Entered non Integer Value");
        } }
        if(i == 9)
            {try{
                System.out.println("Others");
                int bill =sc.nextInt();
                s1 = String.valueOf(bill);
                 s = "\n Others      : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            } catch(InputMismatchException exp)
        {
        System.out.println("You Entered non Integer Value");
        } }
        if(i == 10)
            {try{
                System.out.println("Income you Earned");
                int inc =sc.nextInt();
                s1 = String.valueOf(inc);
                 s = "\n Income you Earned      : "+s1;
                 b =s.getBytes();
                os.write(b);
                in = inc;
            } catch(InputMismatchException exp)
        {
        System.out.println("You Entered non Integer Value");
        } }
        } 
        int total=0;
        for(budget bud:list)
        {
           total = total + bud.bill;
        }
        int remain = in-total;
                 String s1 = String.valueOf(total);
                 s = "\n Total Buget you Spent for Home is : "+s1;
                 b =s.getBytes();
                os.write(b);
                s1 = String.valueOf(remain);
        System.out.println("Total Buget you Spent for Home is "+total);
        if(remain>0)
        {       
        System.out.println("Your Savings is "+remain);
         s = "\n Your Savings is: "+s1;
                 b =s.getBytes();
                os.write(b); }
        else{
        System.out.println("Your got no savings "+remain);
         s = "\nYour got no savings"+s1;
                 b =s.getBytes();
                os.write(b); 
        }                     
 
        os.close();
	}
}