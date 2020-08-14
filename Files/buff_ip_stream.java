import java.util.*;
import java.io.*;
class buff_ip_stream
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream f =new FileInputStream("E:\\java programms\\files\\file_op_stream.txt");
		BufferedInputStream b = new BufferedInputStream(f);
		int i=0;
		while((i=b.read())!= -1)
		{
			System.out.println((char)i);
		}
		f.close();
		b.close();
	}
}