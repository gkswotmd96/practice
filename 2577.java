import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());
		int sum = x*y*z;
		br.close();
		int[] arr = new int[10];
		String str = String.valueOf(sum);
		
		for(int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i) - '0')]++; 
			
		}
		
		for(int v : arr) {
			
			System.out.println(v);
		}

	}
}