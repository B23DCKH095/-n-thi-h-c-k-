import java.math.BigInteger;
import java.util.*;
public class bai3 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t-- > 0){
            BigInteger a = new BigInteger(r.next());
            BigInteger b = new BigInteger(r.next());
            BigInteger gcd = a.gcd(b);
            BigInteger lcm = a.multiply(b).divide(gcd);
            System.out.printf("%s %s\n",lcm,gcd);
        }
    }
}
