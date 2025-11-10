import java.util.*;

class sv{
    public String ma;
    public String ten;
    public Long luongthang;
    public Long thuong;
    public Long phucap;
    public Long thunhap;
    public sv(int id,String ten,String luongcoban,String songaycong,String chucvu){
        this.ma = String.format("NV%02d",id);
        this.ten = ten;
        int lcb = Integer.parseInt(luongcoban);
        int ngay = Integer.parseInt(songaycong);
        this.luongthang = lcb*ngay*1L;
        this.thuong  =0L;
        if(ngay >=25) this.thuong = this.luongthang*2/10;
        else if(ngay >= 22) this.thuong = this.luongthang / 10;
        this.phucap = 0L;
        if(chucvu.equals("GD")) this.phucap = 250000L;
        else if(chucvu.equals("PGD")) this.phucap = 200000L;
        else if(chucvu.equals("TP")) this.phucap = 180000L;
        else this.phucap = 150000L;
        this.thunhap = this.luongthang + this.thuong + this.phucap;
    }
    public String toString(){
        return String.format("%s %s %d %d %d %d",this.ma,this.ten,this.luongthang,this.thuong,this.phucap,this.thunhap);
    }
}
public class bai2{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<sv> ds = new ArrayList<>();
        int id = 1;
        int t =Integer.parseInt(r.nextLine());
        while(t-- > 0){
            ds.add(new sv(id++,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        for(sv tmp: ds){
            System.out.println(tmp);
        }
    }
}