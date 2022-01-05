import java.util.Scanner;


public class one_three {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
		
		int arr[] = new int[n];
		int rarr[] = new int[n];
		int max = 0;
		int count =0;
	        
	        
		for(int i=0;i<n;i++){
	        
			arr[i] = in.nextInt();
	        rarr[n-i-1]=arr[i];
		}
	        
		for(int i =0; i<n; i++) {
			if(rarr[i]>max) {
				max = rarr[i];
				count++;
			}
		}
		System.out.print(count);
		
	    
	}
	
}


