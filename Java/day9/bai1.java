import java.util.*;

public class bai1{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int m = r.nextInt();
        Set<Integer> st = new TreeSet<>();
        for(int i = 0 ; i < n + m ; i++) st.add(r.nextInt());
        for(Integer i : st){
            System.out.printf("%d ",i);
        }
    }
}