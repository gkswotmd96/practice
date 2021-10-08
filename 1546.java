import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		double[] value = new double[N];
		String[] str = br.readLine().split(" ");
		int max = 0;
		double sum =0;
		
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(str[i]);
			if( max < arr[i]) {
				max = arr[i];
				
			}
		}
		
		for(int i =0; i < N; i++) {
			value[i] = arr[i]/max*100;
			sum += value[i];

		}
		
		System.out.println(sum/N);

	}
}