import java.util.*;
class Hospital
{
    int id;
	String name;
	String spec;
	String Gender;
	int Age;
	Hosp myhosp = new Hosp();
	public static int main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("1.Doctor Record\n2.Patient Record\n3.Display Doctor Details\n4.Display Patient Details\n5.Appointment\n6.exit()");
		int sel = input.nextInt();
		switch(sel){
			
			case 1:
			System.out.println("Enter the details in the sequence of Name , age , gender , id , specality");
			String ds = input.next();
			int da = input.nextInt();
			String dg = input.next();
			int di = input.nextInt();
			String dsp = input.nextLine();
			myhosp.getinfodoctor( ds,  dg ,  dsp);
			break;

			case 2:
			System.out.println("Enter the details in the sequence of Name , age , gender , id ");
			String ps = input.next();
			int pa = input.nextInt();
			String pg = input.next();
			int pi = input.nextInt();
			myhosp.getinfopatient( ps , pg);
			
			break;

			case 3:
			System.out.println("Enter id no of Doctor");
			int did = input.nextInt();
			myhosp.printDoctordetails(did);
			break;

			case 4:
			System.out.println("Enter id no of Patient");
			int pid =input.nextInt();
			myhosp.printPatientdetails(pid);
			break;

			case 5:
			System.out.println("Enter the disease");
			String dis = input.nextLine();

			System.out.println("enter yes or no");
			String comp = input.next();
			if(comp == "yes")
			{
				System.out.println("Enter name");
				String name =input.next();
				myhosp.openNewAccount(name);	
			}

			break;


			case 6:
			System.exit(0);


		}
	} 
}

class Hosp
{
 hospId[] accounts;     
 int NoId = 5;      
public Hosp() {
    accounts = new hospId[5];
    noId = 0;
    }
public int printPatientdetails(int pid)
{

for (int i=0 ; i<noId;i++)
{
	if(pid == accounts[i].getIdNum())
		System.out.println(account[i].getinfopatient());
	
}

}

public int printDoctordetails(int did)
{
	for(int i=0 ; i<noId ;i++){
	if(did == accounts[i].getIdNum())
		System.out.println(account[i].getinfodoctor());
	}

}

public int openNewAccount(String PatientName) {

    hospId b = new hospId(PatientName);
    accounts[noId] = b;
    noId++;
    return b.getIdNum();
}

public String getinfodoctor(String ds, String dg , String dsp)
{
	return "Name : " + ds + "Gender" + dg +  "\nSpec : " + dsp;
}

public String getinfopatient(String ps , String pg)
{
	return "Name : " + ps + "\ngender : " + pg ; 
}

}

