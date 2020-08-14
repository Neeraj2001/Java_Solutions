class student
{
	int id;
	String name;
	student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id + ","+name);
	}
	}
class father extends student
{
	float salery;
	String occupation;
	father(int id  ,String name,float salery,String occupation)
	{
		super(id,name);
		this.salery = salery;
		this .occupation = occupation;

	}
	void display()
	{
		System.out.println(id +","+name+","+salery+","+occupation);

	}
}
class mother extends father
{
	int age;
	String nme;
	mother(int id  ,String name,float salery,String occupation,int age,String nme)
	{
		super(id,name,salery,occupation);
		this.age = age;
		this.nme=nme;
	}
	void display()
	{
		System.out.println(id +","+name+","+salery+","+occupation+","+age+","+nme);


	}
}
	class detailns
	{
		public static void main(String args[])
		{
			mother obj = new mother(1,"neeraj",34000,"CEO",20,"Seetha");
			obj.display();
		}


	}
