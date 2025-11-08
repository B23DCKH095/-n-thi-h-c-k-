import java.util.*;

class sv{
    public String ten;
    public String ma;
    public String stt;
    public Long giamgia;
    public Long thanhtien;
    public sv(String a,String b,String c,String d){
        this.ten = a;
        this.ma = b;
        this.stt = b.substring(1,4);
        int loai = Integer.parseInt(b.substring(4));
        Long dongia = Long.parseLong(c);
        Long soluong = Long.parseLong(d);
        this.giamgia = 0L;
        if(loai == 1) this.giamgia = Math.round(dongia*soluong*0.5);
        else this.giamgia = Math.round(dongia*soluong*0.3);
        this.thanhtien = soluong*dongia - this.giamgia;
    }
    public String toString(){
        return String.format("%s %s %s %d %d",this.ten,this.ma,this.stt,this.giamgia,this.thanhtien);
    }
}
public class Bai3 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<sv> ds  = new ArrayList<>();
        while(t -- > 0){
            ds.add(new sv(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(sv1,sv2)-> sv1.stt.compareTo(sv2.stt));
        for(sv tmp: ds){
            System.out.println(tmp);
        }
    }
}
