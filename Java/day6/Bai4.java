import java.util.HashMap;
import java.util.Map;
import java.util.*;

class sv{
    public String ma;
    public String ten;
    public Long gia;
    public sv(String a,String b,String c){
        this.ma = a;
        this.ten = b;
        this.gia = Long.parseLong(c);
    }
}
public class Bai4 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t= Integer.parseInt(r.nextLine());
        Map<String,sv> mp = new HashMap<>();
        while(t-- > 0){
            String s = r.nextLine();
            mp.put(s,new sv(s,r.nextLine(),r.nextLine()));
        }
        t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            String []w = r.nextLine().split(" ");
            String ma = w[0];
            Long sl = Long.parseLong(w[1]);
            String u = ma.substring(1,3);
            sv v = mp.get(u);
            System.out.printf("%s %s %d\n",ma,v.ten,v.gia*sl);
        }
    }
}
