import java.util.*;

class sv implements Comparable<sv>{
    public String ma;
    public String ten;
    public String nganh;
    public sv(int id,String ten,String nganh){
        this.ma =String.format("GV%02d",id);
        this.ten = ten;
        String[] w = nganh.split("\\s+");
        StringBuilder ret = new StringBuilder();
        for(String tmp : w){
            ret.append(tmp.substring(0,1).toUpperCase());
        }
        this.nganh = ret.toString();
    }
    public int compareTo(sv other){
        String w[] = this.ten.split("\\s+");
        String t1 = w[w.length - 1];
        w = other.ten.split("\\s+");
        String t2 = w[w.length -1];
        int ss = t1.compareTo(t2);
        if(ss == 0) return this.ma.compareTo(other.ma);
        return ss;

    }
    public String toString(){
        return String.format("%s %s %s",this.ma,this.ten,this.nganh);
    }
}
public class bai2{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t =Integer.parseInt(r.nextLine());
        ArrayList<sv> ds = new ArrayList<>();
        int id =1;
        while(t-- > 0){
            ds.add(new sv(id++,r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(sv tmp: ds){
            System.out.println(tmp);
        }
    }
}