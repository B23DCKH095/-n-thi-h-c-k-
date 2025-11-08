import java.math.BigInteger;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t=  Integer.parseInt(r.nextLine());
        while(t-- > 0){
            BigInteger u = new BigInteger(r.nextLine());
            BigInteger v = new BigInteger(r.nextLine());
            BigInteger x = u.multiply(v);
            BigInteger y = u.gcd(v);
            System.out.println(x.divide(y));
        }
    }
}
