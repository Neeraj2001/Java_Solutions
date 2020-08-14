/*in the dance competition candidates are reg by uniqueid and their name for the competiotion only five candidates are required
 but during the process 6th record is also inserted but with redundant number.print all the 6 records(along with redundant record)
  then remove that duplicate entry then after display the final list*/
import java.util.*;
//import org.apache.commons.lang.ArrayUtils;

class decl
{
    int id;
    String name;
}
 class dance
 {
 	


 	static Scanner get = new Scanner(System.in);
 	static int len = 6;
 	//list lid = new ArrayList();
 	//list lname = new ArrayList();
 	public static void main(String args[])
 	{
         decl obj = new decl();
         ArrayList<Object> see = new ArrayList<Object>();
 		 for(int i=0 ;i<len;i++)
 	  {
        obj.id = get.nextInt();
        obj.name = get.nextLine();
        see .add(obj); 
 		/*System.out.println("\nenter id of "  +" Studet "+ (i+1));
 		 Int id = get. nextInt();
         lid.add(id);
 		System.out.println("enter the name");
 		 String name = get.nextLine();
         lname.add(name);*/
 	}

 		for (Object i : see)
 		{
 			System.out.println(i);
 		}



 	}

 	
 }
