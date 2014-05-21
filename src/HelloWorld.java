
public class HelloWorld 
{
	public static void main(String args[]) 
	{
		int i;
		for(i=1;i<=100;i++)
		{
			if(i%10==0)
			{
				continue;
			}
			if(i%5==0)
			{
				System.out.println("i = "+i);
			}
		}
		System.out.println("OVER!");
		/*int i=1;
		for(;i<=100;)
		{
			if(i%10==0)
			{
				continue;
			}
			if(i%5==0)
			{
				System.out.println("i = "+i);
			}
			i++;
		}	
		System.out.println("OVER!");*/
	}		
}
