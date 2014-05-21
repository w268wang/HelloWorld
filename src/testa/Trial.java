package testa;

public class Trial {

	public static void main(String[] args) {
		int[][] day = new int[6][7];
		int x = 0,
			y = 2;
		System.out.println(day[x][y]);
		//initializing
		for(int i = 0, j = 0; i < 6;)
		{
			if((j+1)%7==0)
			{
				j = 0;
				i++;
			}else
			{
				day[i][j] = 0;
				j++;
			}
		}
		System.out.println(day[x][y]);

	}

}
