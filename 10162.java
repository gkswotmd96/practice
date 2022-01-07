import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class one_three {
	
	public static void main(String[] args) throws IOException{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    int t = Integer.parseInt(br.readLine());
	    int time = t;
	    int a = 5*60;
	    int b = 60;
	    int c = 10;
	    int ac=0,bc=0,cc=0;
		
	    if(t>=a) {
	    	ac = t/a;
	    	t = t%a;
	    }
	    	
	    if(t>=b) {
	    	bc = t/b;
	    	t = t%b;
	    }
	    if(t>=c){
	    	cc = t/c;

	    }
	    
	    if(ac*a+bc*b+cc*c==time) {
	    System.out.println(ac+" "+bc+" "+cc);
	    }else {
	    System.out.println("-1");

	    }
	    br.close();
	    
	}
	
}


