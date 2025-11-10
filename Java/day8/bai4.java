import java.util.*;

class sv{
    public String ten;
    public String s;
    public sv(String a,String b,String c,String d,String e,String f){
        this.ten = b;
        this.s = String.format("%s %s %s %s %s %s",a,b,c,d,e,f);
    }
    public String toString(){
        return this.s;
    }
}
public class bai4 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<sv> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            ds.add(new sv(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(sv1,sv2) -> sv1.ten.compareTo(sv2.ten));
        int id = 1;
        for(sv tmp : ds){
            System.out.println(String.format("%d %s",id++,tmp.toString()));
        }
    }
}
