import java.io.*;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int S = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		if(S+K+H>=100) {
			bw.write("OK");
		}else {
			if(S<K) {
				if(K<H) {
					bw.write("Soongsil");
				}else {
					if(S<H)
					bw.write("Soongsil");
					else {
						bw.write("Hanyang");
					}
				}
			}else if(S>K){
				if(K>H) {
					bw.write("Hanyang");
				}else {
					bw.write("Korea");
				}
			}
		}
		
	
		
		bw.flush();
		br.close();
		bw.close();
		
		
	}
			
}