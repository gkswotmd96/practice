import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        System.out.println(a.divide(b));
        System.out.println(a.mod(b));
    }
}