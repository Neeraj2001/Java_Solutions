import java.util.Scanner;
import java.util.ArrayList;
class patient
{
	String name;
	int age;
	long number;
	patient(String name,int age,long number)
	{
		this.name = name;
		this.age = age;
		this.number = number;

	}
	void dis()
		{
			System.out.println(name+"\n"+age+"\n"+number);
		}
	public static void main(String args[])
	{
		ArrayList <patient> pa  = new ArrayList<patient>();
    	Scanner s = new Scanner(System.in);
    	System.out.println("enter no of patients:");
    	int n =s.nextInt();
    	patient[] obj =new patient[n]; //array decl and initial
    	for (int i=0;i<n;i++)
    	{
    		System.out.println("Enter patient name");
    		String na = s.next();
    		System.out.println("Enter patient age");
    		int ag = s.nextInt();
    		System.out.println("Enter patient number");
    		long nu = s.nextLong();
    		obj[i] = new patient(na,ag,nu);
    	}
		System.out.println("display records:");
		for(int i=0;i<n;i++)
		{
			obj[i].dis();
			pa.add(obj[i]);
		}
	}
}
		