import java.util.*;

class sv {
    public String ma;
    public String ngay;
    public String gio;
    public String phong;

    public sv(int id, String ngay, String gio, String phong) {
        this.ma = String.format("C%03d", id);
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
    }

    public String toString() {
        return String.format("%s %s %s %s", this.ma, this.ngay, this.gio, this.phong);
    }
}

public class Bai3 {
    public static String fun(String s) {
        String[] w = s.split("\\/");
        StringBuilder ret = new StringBuilder();
        ret.append(w[2]);
        ret.append(w[1]);
        ret.append(w[0]);
        return ret.toString();
    }

    public public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Integer t = 
    }
}
