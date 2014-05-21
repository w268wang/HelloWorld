
public class World 
{
	/*public static void main(String[] args) 
	{
		int i,j,k,sum=0;
		int a[][][]={{{5,1},{6,7}},{{9,4},{8,3}},{{8,2},{2,1}}};
		for (i=0;i<a.length;i++)
			for(j=0;j<a[i].length;j++)
				for(k=0;k<a[j].length;k++)
					sum+=a[i][j][k];
		System.out.println("sum="+sum);
	}*/
	/*public static void main(String[] args)
	{
		int zu[]={1,2,3,4,5,6,7,8};
		setlarger(zu);
	}
	static public void setlarger(int zu[])
	{
		int a=zu[0];
		for(int i=0;i<zu.length;i++)
			if(a<zu[i])
				a=zu[i];
		System.out.println("最大值为："+"\t"+a);
	}*/
	public static int[][] add(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]+=1;
		return arr;
	}
	public static void main(String args[])
	{
		int A[][]={{1,2,3},{1,2,3}};
		int B[][]=new int[2][5];
		B=add(A);
		setlarger(B);
	}
	static public void setlarger(int zu[][])
	{
		int a=zu[0][0];
		for(int i=0;i<zu.length;i++)
			for(int j=0;j<zu[i].length;j++)
			{
				if(a<zu[i][j])
					a=zu[i][j];
			}
		System.out.println("最大值为："+"\t"+a);
	}
}
