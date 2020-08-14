import java.util.*;
import java.io.*;

class Book
{
	int id;
	String name;
    String author;
    int price;
    public Book(int id,String name,String author,int price)
    {
    	this.id = id;
    	this.name = name;
    	this.author = author;
    	this.price = price;
    }
}
class hashmap
{
	public static void main(String args[])
	{
		//int b[] = new Integer[4]
		HashMap<Integer,Book> hm = new HashMap<Integer,Book>();
		Book b1 =  new Book(1342 ,"Computer networks", "Srinivas guru" , 400);
		Book b2 =  new Book(1453 ,"Computer Science", "Allu arjun" , 600);
		Book b3 =  new Book(1256 ,"C programming", "Koti guru" , 300);
		Book b4 =  new Book(1987 ,"Python tutorial", "Gurunanak" , 900);
      
      	hm.put(1,b1);
      	hm.put(2,b2);
      	hm.put(3,b3);
      	hm.put(4,b4);

      for(Map.Entry<Integer,Book> entry : hm.entrySet())
      {
      	int key = entry.getKey();
      	Book b = entry.getValue();
      	System.out.println(key + " details");         
      	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.price);
      }

	}
}