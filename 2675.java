import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int x = Integer.parseInt(br.readLine());

		for(int i = 0; i < x; i++) {

			String[] str =br.readLine().split(" ");
			
			int y = Integer.parseInt(str[0]);
			String s = str[1];
						 
			for(byte value : str[1].getBytes()) {
				for(int j=0; j<y; j++) {
					sb.append((char)value);
				}
			}
			sb.append('\n');
		}

		System.out.println(sb);

		br.close();
		
		
	}
			
}