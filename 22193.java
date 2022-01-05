import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		// Biginteger  A*B
		System.out.println(A.multiply(B));
		// Biginteger A/B
		System.out.println(A.divide(B));
		// Biginteger A+B
		System.out.println(A.add(B));
		// Biginteger A-B
		System.out.println(A.subtract(B));
		// Biginteger A%B
		System.out.println(A.mod(B));
		}
}
