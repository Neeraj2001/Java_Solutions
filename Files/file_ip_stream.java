import java.util.*;
import java.io.*;
class file_ip_stream
{
	public static void main(String args[])
	{
		try{
		FileInputStream f = new FileInputStream("E:\\java programms\\files\\file_op_stream.txt");
		int i=0;
		while((i=f.read())!= -1)
		{
			System.out.print((char)i);

		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}