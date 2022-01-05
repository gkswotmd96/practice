import java.io.*;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if((N - M) < 0) {
			bw.write("-1");
		}else {
			if((N - M) % 2 ==0) {
				bw.write((N - M)/2 + M + " " + (N - M)/2);
			}else {
				bw.write("-1");
			}
					
		}
		bw.flush();
		bw.close();
		br.close();	
		
	}
			
}