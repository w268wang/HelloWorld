import java.util.*;
import java.io.*;
public class CaiShu{
 public static void main(String[] args) throws IOException{
   Random a=new Random();
   int num=a.nextInt(100);
    System.out.println("请输入一个100以内的整数：");
    for (int i=0;i<=9;i++){
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String str=bf.readLine();
    int shu=Integer.parseInt(str);
    if (shu>num)
    	System.out.println("输入的数大了");
    else if (shu<num)
    	System.out.println("输入的数小了");
    else if (i>9)
    	System.out.println("你和猪没有两样了！");
    else {
     System.out.println("恭喜你，猜对了！");
      if (i<=2)
    	  System.out.println("你真是个天才！");
      else if (i<=6)
    	  System.out.println("还将就，你过关了！");
      else if (i<=8)
    	  System.out.println("但是你还……真笨！");
      else
    	  System.out.println("你和猪没有两样了！");   
     break;}
   }
  }
}