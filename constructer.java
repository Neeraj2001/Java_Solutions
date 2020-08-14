class student
{
	int id;
	String name;
	char gender;
	long  mobile;
	student(int sid ,String sname , char g , long mno)
	{
		id = sid;
		name = sname;
		gender = g;
		mobile = mno;
	}
	void display()
	{
		System.out.println(id+","+name+","+gender+","+mobile+".");
	}

}

class studentns
{
	public static void main(String args[])
	{
		//student obj = new student(143,"neeraj");
		//obj.display();
		//student ob1 = new student(14,"garuda");
		//ob1.display();
		student ob2 = new student(1,"bravo",'m',9381164373l);//l should keep for printing long integer value
		ob2.display();

			}
}