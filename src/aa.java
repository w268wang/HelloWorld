import java.util.Scanner;

public class aa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("������һ������");
		if (input.hasNextInt()==true) {
			int a =input.nextInt();
		} else {
			System.out.print("��������ⲻ������");
		}
		close (input);
	}

	private static void close(Scanner input) {
		// TODO Auto-generated method stub
		
	}
}