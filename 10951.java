import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		StringBuilder sb = new StringBuilder();
		
		
		while((str=br.readLine())!= null) {
			st = new StringTokenizer(str," ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			sb.append('\n');
			
		}
		
		System.out.println(sb);		
		
	}
			
}