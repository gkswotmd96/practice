import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();

		
		System.out.println(Math.abs(A - B));
	}
		
}
