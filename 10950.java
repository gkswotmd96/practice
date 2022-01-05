import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int X = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0; i <X; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		
		System.out.println(sb);
		br.close();
		
		
		
	}
			
}