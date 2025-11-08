import java.util.*;

class sv{
    public String ten;
    public String s;
    public sv(int id,String a,String b,String c,String d,String e ,String f){
        this.ten = b;
        Double d1 = Double.parseDouble(d);
        Double d2 = Double.parseDouble(e);
        Double d3 = Double.parseDouble(f);
        this.s = String.format("%s %s %s %.1f %.1f %.1f",a,b,c,d1,d2,d3);
    }
    public String toString(){
        return this.s;
    }
}
public class Bai1{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<sv> ds = new ArrayList<>();
        int t =Integer.parseInt(r.nextLine());
        int id =1;
        while(t-- > 0){
            ds.add(new sv(id++,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(sv1,sv2)-> sv1.ten.compareTo(sv2.ten));
        id = 1;
        for(sv tmp : ds){
            System.out.println(Integer.toString(id++) + " " + tmp);
        }

    }
}