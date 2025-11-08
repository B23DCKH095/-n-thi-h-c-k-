import java.util.*;

class sv {
    public String ma;
    public Long soluongnhap;
    public Long soluongxuat;
    public Long dongia;
    public Long tien;
    public Long thue;

    public sv(String ma, String soluongnhap) {
        this.ma = ma;
        this.soluongnhap = Long.parseLong(soluongnhap);
        this.soluongxuat = 0L;
        if (ma.charAt(0) == 'A')
            this.soluongxuat = Math.round(this.soluongnhap * 0.6);
        else
            this.soluongxuat = Math.round(this.soluongnhap * 0.7);
        if (ma.endsWith("Y"))
            this.dongia = 110000L;
        else
            this.dongia = 135000L;
        Double x = 0.0;
        if (ma.charAt(0) == 'A') {
            if (ma.endsWith("Y"))
                x = 0.08;
            else
                x = 0.11;
        } else {
            if (ma.endsWith("Y"))
                x = 0.17;
            else
                x = 0.22;
        }
        this.tien = this.soluongxuat * this.dongia;
        this.thue = Math.round(x * this.tien);
    }

    public String toString() {
        return String.format("%s %d %d %d %d %d", this.ma, this.soluongnhap, this.soluongxuat, this.dongia, this.tien,
                this.thue);
    }
}

public class Bai5 {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        ArrayList<sv> ds = new ArrayList<>();
        Integer t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            ds.add(new sv(r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(sv1,sv2)-> Long.compare(sv2.thue, sv1.thue));
        String cmp = r.nextLine();
        for(sv tmp : ds){
            if(tmp.ma.substring(0,1).equals(cmp))System.out.println(tmp);
        }
    }
}
