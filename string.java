imprt java.lang.String;
class String
{
	public static void main(String args[])
	{
		String firstname = "neeraj";//by literal
		String.out.println(firstname);
		String.out.println(firstname.toLowerCase());
		String.out.println(firstname.toUpperCase());
		String firstname1 = firstname.concat("is a boy");

		String.out.println(firstname);
		String.out.println(firstname1.replace('r','t'));
		String.out.println(firstname1.replace('i','H'));
		String.out.println(firstname1.charAt(10));
		String.out.println(firstname1.indexOf(r));
		String.out.println(firstname1.isEmpty());
		char ch[] = {'a','b','c','d','e','f','g'};
		System.out.println(ch);
		String lastname = new String ("sharma");
		String.out.println(lastname);
		String.out.println(firstname1.equals(lastname));
		String.out.println(lastname.startsWith("tu"));



	}
}