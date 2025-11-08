import java.util.*;


public class Bai2 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        for(int i = 1; i <= t; i++){
            String a = r.nextLine();
            String b = r.nextLine();
            String c = r.nextLine();
            String d = r.nextLine();
            String []w = c.split("\\/");
            c = String.format("%02d/%02d/%s",Integer.parseInt(w[0]),Integer.parseInt(w[1]),w[2]);
            System.out.printf("B20DCCN%03d %s %s %s %.2f\n",i,a,b,c,Double.parseDouble(d));
        }
    }
}
