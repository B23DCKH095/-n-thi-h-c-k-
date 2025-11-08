import java.util.ArrayList;
import java.io.File;
import java.util.*;

class sv implements Comparable<sv>{
    public String ma;
    public String ten;
    public Long gia;
    public Long baohanh;
    public sv(String ma,String ten,String gia,String baohanh){
        this.ma = ma;
        this.ten = ten;
        this.gia = Long.parseLong(gia);
        this.baohanh = Long.parseLong(baohanh);
    }
    public int compareTo(sv other){
        int ss = Long.compare(other.gia,this.gia);
        if(ss == 0) return this.ma.compareTo(other.ma);
        return  ss;
    }
    public String toString(){
        return String.format("%s %s %d %d",this.ma,this.ten,this.gia,this.baohanh);
    }
}
public class Bai4 {
    public static void main(String[] args) throws Exception{
        File x = new File("SANPHAM.in");
        Scanner r = new Scanner(x);
        int t= Integer.parseInt(r.nextLine());
        ArrayList<sv> ds =new ArrayList<>();
        while(t-- > 0){
            ds.add(new sv(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(sv tmp: ds){
            System.out.println(tmp);
        }
    }
}
