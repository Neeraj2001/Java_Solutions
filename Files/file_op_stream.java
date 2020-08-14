import java.util.*;
import java.io.FileOutputStream;
class file_op_stream
{
	public static void main(String args[])
	{
		try{
		FileOutputStream f = new FileOutputStream("E:\\java programms\\files\\file_op_stream.txt");
		String s = " this is neeraj";
        byte[] b = s.getBytes();
		f.write(b);
		f.close();
		System.out.println("succ");
        }
        catch(Exception e){
        	System.out.println(e);

        }
	}
}