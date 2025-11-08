import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class sv{
    public String ma;
    public String ten;
    public String loai;
    public Double LoiNhuan;
    public sv(int id,String ten,String loai,String mua,String ban){
        this.ma = String.format("%d",id);
        this.ten = ten;
        this.loai = loai;
        this.LoiNhuan = Double.parseDouble(ban) - Double.parseDouble(mua);
    }
    public String toString(){
        return String.format("%s %s %s %.2f",this.ma,this.ten,this.loai,this.LoiNhuan);
    }
}
public class Bai1{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<sv> ds = new ArrayList<>();
        for(int i = 1 ; i<= t; i++){
            ds.add(new sv(i,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(sv1,sv2) -> Double.compare(sv2.LoiNhuan,sv1.LoiNhuan));
        for(sv tmp: ds){
            System.out.println(tmp);
        }
    }
    
}