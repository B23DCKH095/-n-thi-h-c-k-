import java.io.File;
import java.io.FileNotFoundException;
import java.security.cert.TrustAnchor;
import java.util.*;

class sv{
    public String ma;
    public String ten;
    public String tin;
    public String ht1;
    public String ht2;
    public boolean ok;
    public sv(String a,String b,String c,String d,String e){
        this.ma = a;
        this.ten = b;
        this.tin = c;
        this.ht1 = d;
        this.ht2 =e;
        if(check(d) || check(e)) ok = true;
        else ok = false;
    }
    public boolean check(String s){
        if(s.equals("Truc tuyen")) return true;
        if(s.length() <= 12) return false;
        if(s.substring(s.length() - 12).equals(".ptit.edu.vn")) return true;
        return false;
    }
    public String toString(){
        return String.format("%s %s %s %s %s", this.ma,this.ten,this.tin,this.ht1,this.ht2);
    }
}
public class Bai5 {
    public static void main(String[] args) throws Exception{
        File x = new File("MONHOC.in");
        Scanner r = new Scanner(x);
        ArrayList<sv> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            ds.add(new sv(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(sv1,sv2) -> sv1.ma.compareTo(sv2.ma));
        for (sv tmp: ds){
            if(tmp.ok) System.out.println(tmp);
        }
    }
}
