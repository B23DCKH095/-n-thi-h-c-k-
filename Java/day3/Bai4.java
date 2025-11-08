import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class sv{
    public String ma;
    public String ten;
    public String loai;
    public Double loinhuan;
    public sv(int id,String a,String b,String c,String d){
        this.ma =String.format("MH%02d",id);
        this.ten = a;
        this.loai = b;
        this.loinhuan = Double.parseDouble(d) - Double.parseDouble(c);
    }
    public String toString(){
        return String.format("%s %s %s %.2f",this.ma,this.ten,this.loai,this.loinhuan);
    }
}
public class Bai4 {
    public static void main(String[] args) throws Exception{
        Scanner r = new Scanner(new File("MATHANG.in"));
        ArrayList<sv> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        int id = 1;
        while(t-- > 0){
            ds.add(new sv(id++,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(sv1,sv2)-> Double.compare(sv2.loinhuan, sv1.loinhuan));
        for(sv tmp : ds){
            System.out.println(tmp);
        }
    }

}
