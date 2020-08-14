import java.util.*;
import java.io.*;
class buff_op_stream
{
	public static void main(String args[]) throws IOException
	{
		// FileOutputStream f = new FileOutputStream("E:\\java programms\\files\\buff_op_stream1.txt");
        OutputStream f = new BufferedOutputStream(new FileOutputStream("E:\\java programms\\files\\buff_op_stream1.txt"));
        String s = "Buffer String";
        byte[] b= s.getBytes();
        f.write(b);
        f.close();
	}
}