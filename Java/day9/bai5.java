import java.util.ArrayList;
import java.util.*;

class sv {
    public String ten;
    public String s;
    public String cty;

    public sv(int id, String a, String b, String c, String d, String e) {
        this.ten = b;
        this.cty = e;
        this.s = String.format("%d %s %s %s %s %s", id, a, b, c, d, e);
    }

    public String toString() {
        return this.s;
    }
}

public class bai5 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int t = Integer.parseInt(r.nextLine());
        int n = t;
        ArrayList<sv> ds = new ArrayList<>();
        int id = 1;
        while (t-- > 0) {
            ds.add(new sv(id++, r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
        }
        Collections.sort(ds, (sv1, sv2) -> sv1.ten.compareTo(sv2.ten));
        int q = Integer.parseInt(r.nextLine());
        while (q-- > 0) {
            String u = r.nextLine();
            for (sv tmp : ds) {
                if (tmp.cty.equals(u))
                    System.out.println(tmp);
            }
        }
    }
}
