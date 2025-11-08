import java.util.*;

class sv{
    public String ma;
    public String nhom;
    public String ten;
    public sv(String a,String b,String c,String d){
        this.ma = a;
        this.nhom = c;
        this.ten = d;
    }
    public String toString(){
        return String.format("%s %s",this.nhom,this.ten);
    }
}
public class Bai1{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        Map<String,String> mp = new HashMap<>();
        ArrayList<sv> ds = new ArrayList<>();
        int t= Integer.parseInt(r.nextLine());
        while(t-- > 0){
            String a = r.nextLine();
            String b = r.nextLine();
            if(mp.get(a) == null) mp.put(a,b);
            ds.add(new sv(a,b,r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(sv1,sv2) ->sv1.nhom.compareTo(sv2.nhom));
        int q = Integer.parseInt(r.nextLine());
        while(q-- > 0){
            String s = r.nextLine();
            System.out.printf("Danh sach nhom lop mon %s:\n",mp.get(s));
            for(sv tmp : ds){
                if(tmp.ma.equals(s)) System.out.println(tmp);
            }
        }
    }
}