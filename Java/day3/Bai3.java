import java.util.ArrayList;
import java.util.*;

class sv {
    public int id;
    public String ma;
    public String cty;
    public String s;

    public sv(int id, String a, String b, String c, String d, String e) {
        this.id = id;
        this.ma = a;
        this.cty = e;
        this.s = String.format("%d %s %s %s %s %s", id, a, b, c, d, e);
    }

    public String toString() {
        return this.s;
    }

}

public class Bai3 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int id = 1;
        ArrayList<sv> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        while (t-- > 0) {
            ds.add(new sv(id++, r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
        }
        Collections.sort(ds, (sv1, sv2) -> sv1.ma.compareTo(sv2.ma));
        int q = Integer.parseInt(r.nextLine());
        while (q-- > 0) {
            String cmp = r.nextLine();
            for (sv tmp : ds) {
                if (tmp.cty.equals(cmp))
                    System.out.println(tmp);
            }
        }
    }
}
