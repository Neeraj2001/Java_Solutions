import java.util.*;
interface tele{
	int number(int a);
}
class tele_directory
{
	public static void main(String args[])
	{
	  Scanner ip = new Scanner(System.in);
	  System.out.println("enter no of test cases");
	  int t = ip.nextInt();
	  System.out.println("Name");
      String s = ip.next();
	  ArrayList<Long> ar = new ArrayList<Long>();
	  System.out.println("1 . One contact\n2 . Two contact\n3 . Three contact\n4 . Four contact\5 . Close"); 	
	  while(t-- >0)
	  {
	  	int sw = ip.nextInt();
	  	switch(sw)
	  	{
	  		case 1:
	  		  //System.out.println("One contact no");
              System.out.println("enter contact no");
              long a = ip.nextLong();
              ar.add(a);
              System.out.println(s);
              ar.forEach(n -> System.out.println(n));
              ar.clear();
              break;
            case 2:
	  		  //System.out.println("Two contact no");
              System.out.println("enter two contact no");    
              long b = ip.nextLong();
              long c = ip.nextLong();
              ar.add(b);
              ar.add(c);
              System.out.println(s);
              ar.forEach(n -> System.out.println(n));
              ar.clear();
              break;
            case 3:
	  		  //System.out.println("Three contact no");
              System.out.println("enter three contact no");
              long d = ip.nextLong();
              long e = ip.nextLong();
              long f = ip.nextLong();
              ar.add(d);
              ar.add(e);
              ar.add(f);
              System.out.println(s);
              ar.forEach(n -> System.out.println(n));
              ar.clear();
              break;
            case 4:
	  		  //System.out.println("Two contact no");
              System.out.println("enter four contact no");
              long g = ip.nextLong();
              long h = ip.nextLong();
              long i = ip.nextLong();
              long j = ip.nextLong();
              ar.add(g);
              ar.add(h);
              ar.add(i);
              ar.add(j);
              System.out.println(s);
              ar.forEach(n -> System.out.println(n));
              ar.clear();
              break;
            case 5:
              System.exit(0);
            default:
              System.out.println("try again");  

	  	}
	  }


}
}