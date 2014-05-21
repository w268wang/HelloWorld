
public class Inner_function 
{
	public static void main(String[] args) 
	{
		Inner_function i_f = new Inner_function();
		System.out.print(i_f.calculate(5,5));
	}
	int sum(int n, int x)
	{
		int z;
		if(n<=0)
			z=1;
		else if(n==1)
			z=x;
		else
			z=(((2*n-1)*x*sum(n-1,x)-(n-1)*sum(n-2,x))/n);
		return z;
	}
	public int calculate(int time, int input)
	{
		int output;
		output=sum(time,input);
		return output;
	}
}
