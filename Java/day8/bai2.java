import java.util.ArrayList;
import java.io.File;
import java.util.*;

class sv implements Comparable<sv>{
    public String ma;
    public String ten;
    public Double diem;
    public String trangthai;
    public sv(int id,String ten,String dd,String dt,String kv){
        this.ma = String.format("TS%02d",id);
        StringBuilder ret =new  StringBuilder();
        String[] w= ten.trim().split("\\s+");
        for(String u : w){
            ret.append(u.substring(0,1).toUpperCase());
            ret.append(u.substring(1).toLowerCase());
            ret.append(" ");
        }
        this.ten = ret.toString();
        this.diem = Double.parseDouble(dd);
        if(dt.equals("Kinh")) this.diem += 0.0;
        else this.diem += 1.5;
        int k = Integer.parseInt(kv);
        if(k == 1) this.diem += 1.5;
        else if(k == 2) this.diem += 1.0;
        if(this.diem >= 20.5) this.trangthai = "Do";
        else this.trangthai = "Truot";
    }
    public int compareTo(sv other){
        int ss = Double.compare(other.diem, this.diem);
        if(ss == 0) return this.ma.compareTo(other.ma);
        return ss;
    }
    public String toString(){
        return String.format("%s %s%.1f %s",this.ma,this.ten,this.diem,this.trangthai);
    }
}
public class bai2 {
    public static void main(String[] args) throws Exception{
        File x = new File("THISINH.in");
        Scanner r = new Scanner(x);
        Integer t= Integer.parseInt(r.nextLine());
        ArrayList<sv> ds = new ArrayList<>();
        int id =1;
        while(t-- > 0){
            ds.add(new sv(id++,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(sv tmp : ds){
            System.out.println(tmp);
        }

    }
}
