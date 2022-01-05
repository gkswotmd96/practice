import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		int[] have = new int[6];
		int[] need = new int[]{1,1,2,2,2,8};
		int[] result = new int[6];
		for(int i = 0; i <6; i++) {
			have[i] = sc.nextInt();
		}
		
		for(int i =0; i < 6; i++) {
			result[i] = need[i] - have[i];
			System.out.println(result[i]);
		}
		sc.close();
	}
}
