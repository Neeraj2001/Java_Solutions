import java.util.*;
class vert_str_hash
{
   public static String printvertical(String s)
   {
   	String result = " ";
   	HashMap<Integer,String> map = new HashMap<>(); //integer is key
   	Scanner sc = new Scanner(s); //assign the string value to sc
   	int max = 0;
   	while(sc.hasNext())    
   	//checks if there is a next word if not false and exit loop
   	{
   		String st = sc.next(); 
   		//assigning the each word to st
   		max = Math.max(max,st.length());
   		//assign max value to max comp max and len()
   	}
   	sc = new Scanner(s);
   	while(sc.hasNext())
   	{
   		String st= sc.next();
   		for(int i=0;i<st.length();i++)
   		{
   			char ch = st.charAt(i);
   			map.put(i,map.getOrDefault(i,"")+ch);
   			//
   		}
   		for(int i=st.length();i<max;i++)
   		{
   			map.put(i,map.getOrDefault(i,"")+"$");
   		}
     }
   		for(int i=0;i<max;i++)
   		{
   			String a= map.get(i);
   			result = result+a+"\n ";
   		}
   		return result;
   	}
   public static void main(String args[])
   {
   	Scanner ip = new Scanner(System.in);
   	String st = ip.nextLine();  // this is neeraj
   	//String st = "ge ek sfor ge eks";
   	System.out.println(printvertical(st));
   }
}