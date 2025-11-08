import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        while (t-- > 0) {
            String s = r.nextLine();
            String[] w = s.trim().split("\\s+");
            StringBuilder ret = new StringBuilder();
            ret.append(w[w.length - 1].toLowerCase());
            for (int i = 0; i < w.length - 1; i++) {
                ret.append(w[i].substring(0, 1).toLowerCase());
            }
            String ans = ret.toString();
            if (mp.get(ans) == null) {
                System.out.printf("%s@ptit.edu.vn\n",ans);
                mp.put(ans, 1);
            } else {
                System.out.printf("%s%d@ptit.edu.vn\n", ans, mp.get(ans) + 1);
                mp.put(ans, mp.get(ans) + 1);
            }
        }
    }
}
