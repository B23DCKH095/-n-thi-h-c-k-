import java.util.*;

public class Bai4 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            String s1 = r.nextLine();
            String s2 = r.nextLine();
            Set<String> s = new TreeSet<>();
            String []w = s2.split(" ");
            Set<String> u = new HashSet<>();
            for(String x: w){
                u.add(x);
            }
            for(String x : s1.split(" ")){
                if(!u.contains(x)) s.add(x);
            }
            for(String x : s){
                System.out.printf("%s ",x);
            }
            System.out.println("");
        }
    }    
}
