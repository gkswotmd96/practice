import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] arr = new int[5];
		
		for(int i =0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int sum = a*b;
		
		for(int i =0; i < 5; i++) {
			int result = 0;
			result = sum - arr[i];
			System.out.print(-result+" ");
		}
		
		
		sc.close();

	}
}