class string_buffer_builder_performance
{
	public static void main(String argsp[])
	{
		long time = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("java");
		for(int i = 0;i<=1000;i++)
		{
			sb.append("language");

		}
		System.out.println(System.currentTimeMillis()-time);
		time=System.currentTimeMillis();
		StringBuffer sbobj = new StringBuffer("programming");
		for(int i = 0;i<=1000;i++)
		{
			sbobj.append("language");
		}
		System.out.println(System.currentTimeMillis()-time);
	}
}