import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while (t-- > 0) {
            String s = r.next();
            Boolean ok = true;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    ok = false;
                    break;
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '5' || s.charAt(i) == '7')) {
                    ok = false;
                    break;
                }
            }
            if (ok)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
