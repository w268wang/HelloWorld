
public class Factorial 
{
	public static void main(String[] args) 
	{
		Factorial fac = new Factorial();
		int output = fac.func(10);
		System.out.println(output);
	}
	int func(int n)
	{
		if(n>1)
			return (func(n-1)*n);
		else
			return 1;
	}
}
