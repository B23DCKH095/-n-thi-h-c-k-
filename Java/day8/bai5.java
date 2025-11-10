import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        int id = 1;
        while (t-- > 0) {
            String ma = String.format("B20DCCN%03d", id++);
            String ten = r.nextLine();
            String[] w = ten.trim().split("\\s+");
            StringBuilder ret = new StringBuilder();
            for (String u : w) {
                ret.append(u.substring(0, 1).toUpperCase());
                ret.append(u.substring(1).toLowerCase());
                ret.append(" ");
            }
            ten = ret.toString();
            String lop = r.nextLine();
            String ngay = r.nextLine();
            w = ngay.split("\\/");
            int dd = Integer.parseInt(w[0]);
            int mm = Integer.parseInt(w[1]);
            int yy = Integer.parseInt(w[2]);
            ngay = String.format("%02d/%02d/%d", dd, mm, yy);
            String gpa = String.format("%.2f", Double.parseDouble(r.nextLine()));
            System.out.printf("%s %s%s %s %s\n", ma, ten,lop, ngay, gpa);
        }
    }
}