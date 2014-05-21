
public class Test3 
{
	int a,b,c,d;
	Test3(int a,int b)
	{
		c=2*(a+b);
		d=a*b;
		System.out.println("C="+c);
		System.out.println("d="+d);
	}
	public static void main(String[] args)
	{
		Test3 R=new Test3(2,3);
	}
}
