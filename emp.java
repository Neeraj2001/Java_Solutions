import java.util.*;
class emp
{
	int id;
	String name;
	float sal;
	emp(int eid,String nme,float sale)
	{
		id= eid;
		name =nme;
		sal = sale;
	}
}
class arrayns
{
	public static void main(String args[])
	{
		emp e1 =new emp(1,"neeraj",2300);
		emp e2 =new emp(2,"garuda",2350);
		emp e3 =new emp(3,"babloo",2800);
		emp e4 =new emp(4,"bravo",2110);
		emp e5 =new emp(5,"hurhee",1200);
		ArrayList<emp>obj = new ArrayList<emp>();
		obj.add(e1);
		obj.add(e2);
		obj.add(e3);
		obj.add(e4);
		obj.add(e5);
		// System.out.println(obj);  print address bcz it is obj
 
		for (emp e:obj)
		{
			System.out.println(e.id+","+e.name+","+e.sal+".");
		}
	}
}