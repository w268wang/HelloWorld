import java.util.*;
import java.io.*;
public class CaiShu{
 public static void main(String[] args) throws IOException{
   Random a=new Random();
   int num=a.nextInt(100);
    System.out.println("������һ��100���ڵ�������");
    for (int i=0;i<=9;i++){
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String str=bf.readLine();
    int shu=Integer.parseInt(str);
    if (shu>num)
    	System.out.println("�����������");
    else if (shu<num)
    	System.out.println("�������С��");
    else if (i>9)
    	System.out.println("�����û�������ˣ�");
    else {
     System.out.println("��ϲ�㣬�¶��ˣ�");
      if (i<=2)
    	  System.out.println("�����Ǹ���ţ�");
      else if (i<=6)
    	  System.out.println("�����ͣ�������ˣ�");
      else if (i<=8)
    	  System.out.println("�����㻹�����汿��");
      else
    	  System.out.println("�����û�������ˣ�");   
     break;}
   }
  }
}