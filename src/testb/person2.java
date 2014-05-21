package testb;
import testa.A;

class C implements A
{
	public String print()
	{
		return("ABC");
	}
}
public class person2
{
	public static void main(String[] args)
	{
		System.out.println(new C().print());
	}
}
/*class person2
{
	public static void main(String[] args)
	{
		System.out.println(new test().talk());
	}
}*/
