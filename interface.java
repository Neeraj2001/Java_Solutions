interface in1
{
	void subject();
}
interface inter2
{
	 void subject1();
}
class interfacecls implements inter1,inter2
{
	public void subject()    // if public is not entered then it will show error
  	{
		System.out.println("My subject is ASP.net");
	}
	public void subject1()
	{
		System.out.println("my subject is java");
	}
	public static void main(String args[])
	{
		interfacecls obj = new interfacecls();
		obj.subject();
		obj.subject1();
	}
}