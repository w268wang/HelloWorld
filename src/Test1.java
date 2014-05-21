
public class Test1 
{
	static String a = "string-a";
	static String b;
	String c="string-c";
	String d;
	public static void printStatic(String title)
	{
		System.out.println("-----"+title+"-----");
		System.out.println("a=\""+a+"\"");
		System.out.println("b=\""+b+"\"");
	}
	static
	{
		printStatic("before static");
		b="string-b";
		printStatic("after static");
	}
	public void print(String title)
	{
		System.out.println("-----"+title+"-----");
		System.out.println("a=\""+a+"\"");
		System.out.println("b=\""+b+"\"");
		System.out.println("c=\""+c+"\"");
		System.out.println("d=\""+d+"\"");
	}
	public Test1()
	{
		print("before constructor");
		d="string-d";
		print("after constructor");
	}
	public static void main(String[] args) 
	{
		new Test1();
	}

}
