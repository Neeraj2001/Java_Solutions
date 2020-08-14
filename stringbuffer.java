import java.lang.StringBuffer;
class stringbuffer
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		sb1.append("how are you");
		System.out.println(sb1);
		System.out.println(sb1.insert(6,"k18ns"));
		System.out.println(sb1.replace(4,8,"fine"));
		System.out.println(sb1.delete(1,4));
		System.out.println(sb1.reverse());
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(40);
		System.out.println(sb1.capacity());


	}
}