import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class one_three {
	
	public static void main(String[] args) throws IOException{

		Stack<String> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    int n = Integer.parseInt(br.readLine());
		
	    for(int i = 0; i< n; i++) {
	    	String[] data = br.readLine().split(" ");
	    	
	    	for(int j =0; j<data.length; j++) {
	    		stack.add(data[j]);
	    	}
	    	
	    	bw.write("Case #"+ (i+1) + ": ");
	    	for(int j =0; j< data.length; j++) {
	    		bw.write(stack.pop()+" ");
	    	}
	    	bw.write("\n");
	    }
		
	    bw.flush();
	    bw.close();
	    br.close();
	    
	}
	
}


