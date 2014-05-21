public class Bahe 
{
	public static void main(String[] args) 
	{
		Bahe ba = new Bahe();
		//for(int ci=6; ci<=2147483647; ci+=2)
		//279172s
		for(int ci=6; ci<=100000; ci+=2)
		{
			if(ba.test(ci)==false)
			{
				System.out.println("false");
				break;
			}
		}
		System.out.println("true");
		System.out.println("OVER!");
	}
	public boolean prime(int input)
	{
		int n = input;
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public boolean test(int object)
	{
		int x=object;
		if(x<6||x%2!=0)
		{
			System.out.println("input wrong number!");
			return false;
		}else{
			for(int i=3;i<=x/2;i+=2)
			{
				if((prime(i)&&prime(x-i))==true)
				{
					return true;
				}
			}
			return false;
		}
	}
	/*public void output(boolean boo)
	{
		if(boo==true)
		{
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}*/
}
