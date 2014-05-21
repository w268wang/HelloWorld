public class TEST 
{
	/*public void xing(int m) 
	{
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("OVER!");
	}
	public static void main(String args[])
	{
		int a=6;
		TEST n=new TEST();
		n.xing(a);
	}*/
	/*public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("OVER!");
	}*/
	/*public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(;i<=5-i;)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("OVER!");
	}*/
	/*public static void main(String args[])
	{
		TEST n=new TEST();
		int a=5;
		n.daying(a);
	}
	public void daying(int m)
		{
			int a=m;
			for(int i=1;i<=a;i++)
			{
				for(int k=1;k<=a-i;k++)
				{    
					System.out.print(" ");
				}
				for(int j=1;j<=2*i-1;j++)
				{
					System.out.print(i);
				}
				System.out.println();
			}
			System.out.println("OVER!");
		}*/
	public static void main(String args[])
	{
		TEST n=new TEST();
		int a=5;
		n.daying(a);
	}
	public void daying(int m)
	{
		int a=m;
		for(int i=1;i<=a;i++)
		{
			for(int k=1;k<=a-i;k++)
			{    
					System.out.print(" ");
			}
			if(i==1||i==a)
			{
				if(i==1)
				{
					System.out.println("*");
				}
				else
				{
					for(int c=1;c<=2*i-1;c++)
						System.out.print("*");
					System.out.println();
				}
			}
			else
			{
				System.out.print("*");
				for(int j=1;j<=2*i-3;j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}
		System.out.println("OVER!");
	}
}