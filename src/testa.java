
public class testa
{
	public static void main(String[] args)
	{
		String a = "";
		String b = null;
		int q;
		try {q = a.compareTo(b);}
		catch(Exception e){
			String QWE = "";
			q = -1;
			try{a.compareTo(QWE);}
			catch(Exception ex){q = 1;}
		}
		System.out.print(q);
	}

}
