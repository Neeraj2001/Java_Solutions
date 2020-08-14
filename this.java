class student
{
	int id;
	String name;
	
	student(int id ,String name )
	{
		this .id = id;
		this .name = name;
		
	}
	void display()
	{
		System.out.println(id+","+name);
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
		student ob2 = new student(1,"bravo");//l should keep for printing long integer value
		ob2.display();

			}
}