import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Caculator 
{
	public static void main(String[] args) throws IOException
	{
		String n;
		int n2,n3;
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("处理数1：");
	    String str = bf.readLine();
	    int n1=Integer.parseInt(str);
		do
		{
		    System.out.println("运算符：");
		    n = bf.readLine();
		}while(n=="+"||n=="-"||n=="/"||n=="*");
	    if(n=="+")
	    {
	    	System.out.println("处理数2：");
		    str = bf.readLine();
		    n2=Integer.parseInt(str);
		    n3 = n1+n2;
	    }
		else if(n=="-")
		{
			System.out.println("处理数2：");
		    str = bf.readLine();
		    n2=Integer.parseInt(str);
		    n3 = n1-n2;
		}
		else if(n=="*")
		{
	    	System.out.println("处理数2：");
		    str = bf.readLine();
		    n2=Integer.parseInt(str);
		    n3 = n1*n2;
		}    
		else if(n=="/")
		{
	    	System.out.println("处理数2：");
		    str = bf.readLine();
		    n2=Integer.parseInt(str);
		    n3 = n1/n2;
	    }
	}

}

//http://www.js.10086.cn/mzone/m/wlan/
