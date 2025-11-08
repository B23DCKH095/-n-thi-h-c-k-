import java.util.*;

public class Bai3 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        int id = 1;
        while(t-- > 0){
            System.out.printf("Test %d:",id++);
            int n = Integer.parseInt(r.nextLine());
            for(int i = 2; i*i <= n ;i++){
                if(n%i == 0){
                    int cnt= 0;
                    while(n%i == 0){
                        cnt += 1;
                        n /= i;
                    }
                    System.out.printf(" %d(%d)",i,cnt);
                }
            }
            if(n > 1) System.out.printf(" %d(%d)",n,1);
            System.out.println("");
        }
    }
}
