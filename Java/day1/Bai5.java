import java.util.ArrayList;
import java.util.Scanner;

class sv{
    public String lop;
    public String s;
    public sv(String a,String b,String c,String d){
        this.s = String.format("%s %s %s %s", a,b,c,d);
        this.lop = c;
    }
    public String toString(){
        return this.s;
    }
}

public class Bai5 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<sv> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            ds.add(new sv(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        int q = Integer.parseInt(r.nextLine());
        while(q -- > 0){
            String cmp = r.nextLine();
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n",cmp);
            for(sv tmp : ds){
                if(tmp.lop.compareTo(cmp) == 0){
                    System.out.println(tmp.s);
                }
            }
        }
    }
}
