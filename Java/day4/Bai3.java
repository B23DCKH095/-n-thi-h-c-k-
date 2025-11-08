import java.util.*;

public class Bai3 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int m = r.nextInt();
        Set<Integer> s = new TreeSet<>();
        for(int i = 0 ; i < n ; i++) s.add(r.nextInt());
        for(int i = 0 ; i< m ; i++) s.add(r.nextInt());
        for(int x: s){
            System.out.printf("%d ",x);
        }
    }
}
