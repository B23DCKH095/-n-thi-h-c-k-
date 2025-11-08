import java.util.*;

class sv{
    public String ma;
    public String ten;
    public Long phucap;
    public Long luongchinh;
    public Long tamung;
    public Long conlai;
    public sv(int id,String ten,String chucvu,String luongcoban,String songaycong){
        this.ma = String.format("NV%02d",id);
        this.ten = ten;
        Long pc = 0L;
        if(chucvu.equals("GD")) pc = 500L;
        else if(chucvu.equals("PGD")) pc = 400L;
        else if(chucvu.equals("TP")) pc = 300L;
        else if(chucvu.equals("KT")) pc = 250L;
        else pc = 100L;
        this.phucap = pc;
        this.luongchinh = Long.parseLong(luongcoban)*Long.parseLong(songaycong);
        if((this.luongchinh + pc)*(2.0/3.0) < 25000) this.tamung = Math.round((this.luongchinh+ pc)*(2.0/3.0)/1000.0)*1000;
        else this.tamung = 25000L;
        this.conlai = this.luongchinh + pc - this.tamung;
    }
    public String toString(){
        return String.format("%s %s %d %d %d %d",this.ma,this.ten,this.phucap,this.luongchinh,this.tamung,this.conlai);
    }
}
public class Bai4 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int id = 1;
        int t= Integer.parseInt(r.nextLine());
        ArrayList<sv> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new sv(id++,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        for(sv tmp : ds){
            System.out.println(tmp);
        }
    }
}
