import java.util.*;
class array_list
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("neeraj");
		al.add("babloo");
		al.add("garuda");
		al.add("bravo");
		al.add("demon");
		//al.remove("bravo")
		//System.out.println(al.contains("garuda"));
		System.out.println(al); //cal obj al

		ArrayList<Integer>al1=new ArrayList<Integer>();
		al1.add(30);
		al1.add(23);
		al1.add(44);
		al1.add(25);
		al1.add(50);

		System.out.println("contains elements?:-" + al1.isEmpty());
		Iterator itr = al1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("total no of elements" + al1.size());

		System.out.println("total no of elements" + al1.get(3));
		al1.set(3,30);
		System.out.println(al1);
		ArrayList<String>al2=new ArrayList<String>();
		al2.addAll(al);
		for(String str:al2)
		{
			System.out.println(str);
		}
		al2.clear();
		System.out.println(al2);
	}

}