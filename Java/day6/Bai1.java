import java.util.*;


public class Bai1 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t-- > 0){
            int n = r.nextInt();
            int a[] = new int[n];
            for(int i = 0 ;i  <n ; i++) a[i] = r.nextInt();
            int mn = a[0];
            for(int i = 0 ; i<n ;i++)mn = Math.min(mn,a[i]);
            for(int i = 0 ; i< n ;i++){
                if(a[i] == mn){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
