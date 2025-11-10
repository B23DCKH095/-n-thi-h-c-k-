import java.security.PublicKey;
import java.util.*;

class sv {
    public String ma;
    public String ten;
    public int dongia;
    public Long thue;
    public Long thanhtien;

    public sv(String ma, String sl) {
        this.ma = ma;
        Long sll = Long.parseLong(sl);
        Double pt = 0.0;
        if (ma.startsWith("X")) {
            this.dongia = 128000;
            pt = 0.03;
        } else if (ma.startsWith("D")) {
            this.dongia = 11200;
            pt = 0.035;
        } else {
            this.dongia = 9700;
            pt = 0.02;
        }
        this.thue = Math.round(pt * this.dongia * sll);
        if (ma.endsWith("BP"))
            this.ten = "British Petro";
        else if (ma.endsWith("ES"))
            this.ten = "Esso";
        else if (ma.endsWith("SH"))
            this.ten = "Shell";
        else if (ma.endsWith("CA"))
            this.ten = "Castrol";
        else if (ma.endsWith("MO"))
            this.ten = "Mobil";
        else {
            this.thue = 0L;
            this.ten = "Trong Nuoc";
        }
        this.thanhtien = this.dongia * sll + this.thue;
    }

    public String toString() {
        return String.format("%s %s %d %d %d", this.ma, this.ten, this.dongia, this.thue, this.thanhtien);
    }
}

public class bai5 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        ArrayList<sv> ds = new ArrayList<>();
        while (t-- > 0) {
            ds.add(new sv(r.next(), r.next()));
        }
        for (sv tmp : ds) {
            System.out.println(tmp);
        }
    }
}
