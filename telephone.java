import java.util.*;
class telephone
{
public static void main(String args[]);
{
 Scanner s = new Scanner(System.in);
    int choice = 0;


    do {
        System.out.println("1  enter 1 contact");
        System.out.println("2 enter 2 contact");
        System.out.println("3 enter 3 contact");
        System.out.println("4  enter 4 contacts ");
        System.out.println("5 exit");
      
        System.out.print("Enter ");
        choice = s.nextInt();
        switch (choice) {
            case 1: 
	 ArrayList<Long> arrL = new ArrayList<Long>(); 
                  System.out.println("enter the name");
                  String ch=s.next();
                   System.out.println("enter the number");
                   long n=s.nextLong();
                   arrL.add(n);
                   System.out.println(ch+" contact number are: ");
                   arrL.forEach(d -> System.out.println(d)); 
                   break;
             case 2:
                    ArrayList<Long> arrL1 = new ArrayList<Long>(); 
                    System.out.println("enter the name");
                    String ch1=s.next();
                    System.out.println("enter the first number");
                    long p=s.nextLong();
	  System.out.println("enter the second number");
                    long m=s.nextLong();
                    arrL1.add(p);
                    arrL1.add(m);
                    System.out.println(ch1+" contact number are: ");
                    arrL1.forEach(d -> System.out.println(d)); 
                    break;
            case 3:
                    ArrayList<Long> arrL2 = new ArrayList<Long>(); 
                    System.out.println("enter the name");
                    String ch2=s.next();
                    System.out.println("enter the first number");
                    long q=s.nextLong();
	  System.out.println("enter the second number");
                    long r=s.nextLong();
                    System.out.println("enter the third number");
                    long t=s.nextLong();
                    arrL2.add(q);
                    arrL2.add(r);
                    arrL2.add(t);
                    System.out.println(ch2+" contact number are: ");
                    arrL2.forEach(d -> System.out.println(d)); 
                    break;
            case 4:
                    ArrayList<Long> arrL3 = new ArrayList<Long>(); 
                    System.out.println("enter the name");
                    String ch3=s.next();
                    System.out.println("enter the first number");
                    long a=s.nextLong();
	  System.out.println("enter the second number");
                    long b=s.nextLong();
                    System.out.println("enter the third number");
                    long c=s.nextLong();
                    System.out.println("enter the third number");
                    long k=s.nextLong();
                    arrL3.add(a);
                    arrL3.add(b);
                    arrL3.add(c);
                    arrL3.add(k);
                    System.out.println(ch3+" contact number are: ");
                    arrL3.forEach(d -> System.out.println(d)); 
                    break;
         case 5:
                System.exit(0);
        }
}

while (choice != '5');
}
}

                 
                 






















/*import java.util.ArrayList; 
class Test 
{ 
    public static void main(String args[]) 
    { 
       
        ArrayList<Integer> arrL = new ArrayList<Integer>(); 
        arrL.add(1); 
        arrL.add(2); 
        arrL.add(3); 
        arrL.add(4); 
  
        // Using lambda expression to print all elements 
        // of arrL 
        arrL.forEach(n -> System.out.println(n)); 
  
        // Using lambda expression to print even elements 
        // of arrL 
        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); }); 
    } 
} */