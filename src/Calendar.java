import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//需实现方法：1.输入年和月，输出当月日历；   2.输入年月日，输出间隔天数；

public class Calendar 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入需要实现的功能所对应的代码");
		System.out.println("1.输出当月日历；");
		System.out.println("2.输出间隔天数；");
	    String str=bf.readLine();
	    int input=Integer.parseInt(str);
	    if(input!=1&&input!=2)
	    {
	    	do
	    	{
	    		System.out.println("错误，请重新输入");
			    String t=bf.readLine();
			    input=Integer.parseInt(t);
	    	}while(input!=1&&input!=2);
	    }
	  //INPUTING
	    String n="需要查找";
	    if(input==2)
	    	n="起始";
		System.out.println("输入"+n+"的年份（1900年及之后）：");
	    str=bf.readLine();
	    int year=Integer.parseInt(str);
	    if(year<1900)
	    {
	    	do
	    	{
	    		System.out.println("输入无效，请重新输入");
			    String t=bf.readLine();
			    year=Integer.parseInt(t);
	    	}while(year<1900);
	    }
	    System.out.println("输入"+n+"的月份（1-12）：");
	    str=bf.readLine();
	    int month=Integer.parseInt(str);
	    if(month<1||month>12)
	    {
	    	do
	    	{
	    		System.out.println("输入无效，请重新输入");
			    String t=bf.readLine();
			    month=Integer.parseInt(t);
	    	}while(month<1||month>12);
	    }
		if(input==1)
		{
		    //FILLING THE ARRAY
		    int ri=1,po=0,num=0;			//2000.1.1。>>Saturday  1900。1.1.>>Monday
		    int[][] day = new int[6][7];
		    for(int m=1,y=1900; m<month||y<year;)
		    {
		    	if(m>12)
		    	{
		    		m=1;
		    		y++;
		    		continue;
		    	}
		    	else if(po>6)
		    	{
		    		po-=7;
		    		continue;
		    	}
		    	else
		    	{
		    		if(m==4||m==6||m==9||m==11)
		    		{
		    			po=po+2;
		    			m++;
		    		}
		    		else if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
		    		{
		    			po=po+3;
		    			m++;
		    		}
		    		else
		    		{
		    			if((y-1900)%4==0)
		    			{
		    				po++;
		    				m++;
		    			}
		    			else
		    				m++;	
		    		}
		    	}
		    }
		    if(po>6)
	    	{
	    		po-=7;
	    	}
		    //DETERMINING THE NUMBER OF THE MONTH
		    if(month==4||month==6||month==9||month==11)
		    	num=30;
    		else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
    			num=31;
    		else
    		{
    			if((year-1900)%4==0)
    				num=29;
    			else
    				num=28;
    		}
		    //INPUT THE ARRAY
		    int y=po,x=0;
		    for(int i=0;i<num;)
		    {
		    	if(y>6)
		    	{
		    		y=0;
		    		x++;
		    		continue;
		    	}
		    	else
		    	{
		    		day[x][y]=ri;
		    		ri++;
		    		y++;
		    		i++;
		    	}
		    }
		    //PRINTING
		    System.out.println("SU MO TH WE TH FR SA");
		    System.out.println(Arrays.deepToString(day).replaceAll("],", "]\r\n"));
		    for(int i=0,j=0;i<6;)
		    {
		    	if((j+1)%7==0)
		    	{
		    		System.out.println(day[i][j]);
		    		j=0;
		    		i++;
		    	}
		    	else if(day[i][j]<10)
		    	{
		    		System.out.print(day[i][j]+"  ");
		    		j++;
		    	}
		    	else
		    	{
		    		System.out.print(day[i][j]+" ");
		    		j++;
		    	}
		    }
		}
		//----------------------********------------------------------------------------
		//----------------------********------------------------------------------------
		//----------------------********------------------------------------------------
		//----------------------********------------------------------------------------
		else
		{
			//ADDITION INPUT
			System.out.println("输入结束年份（2000及以后）：");
		    str=bf.readLine();
		    int fyear=Integer.parseInt(str);
		    if(fyear<2000)
		    {
		    	do
		    	{
		    		System.out.println("输入无效，请重新输入");
				    String t=bf.readLine();
				    fyear=Integer.parseInt(t);
		    	}while(fyear<2000);
		    }
			System.out.println("输入起始月份（1-12）：");
		    str=bf.readLine();
		    int fmonth=Integer.parseInt(str);
		    if(fmonth<1||fmonth>12)
		    {
		    	do
		    	{
		    		System.out.println("输入无效，请重新输入");
				    String t=bf.readLine();
				    fmonth=Integer.parseInt(t);
		    	}while(fmonth<1||fmonth>12);
		    }
			int gap=0;
			for(int m=month,y=year; m<fmonth||y<fyear;)
		    {
		    	if(m>12)
		    	{
		    		m=1;
		    		y++;
		    		continue;
		    	}
		    	else
		    	{
		    		if(m==4||m==6||m==9||m==11)
		    		{
		    			gap+=30;
		    			m++;
		    		}
		    		else if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
		    		{
		    			gap+=31;
		    			m++;
		    		}
		    		else
		    		{
		    			if((y-2000)%4==0)
		    			{
		    				gap+=29;
		    				m++;
		    			}
		    			else
		    				gap+=28;
		    				m++;	
		    		}
		    	}
		    }
			System.out.println("您的所填日期的间隔为："+gap);
		}
	}
}