import java.util.*;

class sv implements Comparable<sv>{
    public String ma;
    public String ten;
    public int soluong;
    public sv(String a,String b,String c){
        this.ma = a;
        this.ten = b;
        this.soluong= Integer.parseInt(c);
    }
    public int compareTo(sv other){
        int ss = Integer.compare(other.soluong, this.soluong);
        if(ss == 0) return this.ma.compareTo(other.ma);
        return ss;
    }
    public String toString(){
        return String.format("%s %s %d",this.ma,this.ten,this.soluong);
    }
}
public class Bai2 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<sv> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new sv(r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        int q = Integer.parseInt(r.nextLine());
        while(q-- > 0){
            String s = r.nextLine();
            String []w = s.split(" ");
            int left = Integer.parseInt(w[0]);
            int right = Integer.parseInt(w[1]);
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n",left,right);
            for(sv tmp: ds){
                if(tmp.soluong >= left && tmp.soluong <= right) System.out.println(tmp);
            }
        }
    }
}
