import java.util.Scanner;


public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt(); 
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
        Integer d = sc.nextInt();
        Integer e = sc.nextInt();
        int f = 0;
        
        f = ((a*a) + (b*b) + (c*c) + (d*d) + (e*e)) % 10;
        
        System.out.println(f);
        sc.close();
	}
}
