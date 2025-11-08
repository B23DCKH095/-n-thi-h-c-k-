import java.io.File;
import java.math.BigInteger;
import java.util.*;

public class Bai1{
    public static void main(String[] args) throws Exception {
        File f = new File("DATA.in");
        Scanner r = new Scanner(f);
        String s = r.next();
        while(s.length() > 1){
            String lelf = s.substring(0,s.length()/2);
            String right = s.substring(s.length()/2);
            BigInteger x = new BigInteger(lelf);
            x = x.add(new BigInteger(right));
            System.out.println(x);
            s = x.toString();
       }
    }
}