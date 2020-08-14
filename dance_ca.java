/*in the dance competition candidates are reg by uniqueid and their name for the competiotion only five candidates are required
 but during the process 6th record is also inserted but with redundant number.print all the 6 records(along with redundant record)
  then remove that duplicate entry then after display the final list*/
import java.util.*;
import org.apache.commons.lang.ArrayUtils;

 class dance
 {
 	public static int reg(int id[],int n, String name[])
 	{
 		int j = 0;
 		int temp[] = new int[n];
 	/*for (int k=0 ;k<len;k++)
 	{
 		if (name[])
 	}	
 	for(int i=0;i<n-1;i++)
 		{
 			if (id[i] != id[i+1])
 				temp[j++] = id[i]; 
 		}
 		temp[j++] = id[n-1];
 		for(int i=0;i<j;i++)
 		{
 			id[i] = temp[i];

 		}
 		return j;*/
 	  
    for (int i=0 ; i<n;i++)
     {
     	for(j=0 ;j<n;j++)
     	{
     		if (id[i] == id[j] && name[i] == name[j])

     			//id = ArrayUtils.remove(id,j);
     		    //name = ArrayUtils.remove(name,j);
     			//remove(id[j]);
     		    //remove(name[j]);

     	}
     }		
 	
 	}


 	static Scanner get = new Scanner(System.in);
 	static int len = 6;
 	static int id[] = new int[len];
 	static String name[] = new String[len];
 	public static void main(String args[])
 	{
 		 for(int i=0 ;i<len;i++)
 	  {
 		System.out.println("\nenter id of "  +" Studet "+ (i+1));
 		 id[i] = get. nextInt();
 		System.out.println("enter the name");
 		 name[i] = get.next();
 	}

 		for (int i=0;i<len;i++)
 		{
 			System.out.println(" \n "+id[i]+" "+name[i]);
 		}
 		//Arrays.sort(id);
 	    len = reg(id , len ,name);
 	    System.out.println("\n\n");

 		for (int i=0;i<len;i++)
 		{
 			System.out.println(" \n "+id[i]+" "+name[i]);
 		}



 	}

 	
 }
