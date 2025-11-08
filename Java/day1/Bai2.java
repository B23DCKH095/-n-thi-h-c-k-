import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Long s = 0L;
        Long cur = 1L;
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        for(int i = 1 ;i <= n ; i++){
            cur *= i;
            s += cur;
        }
        System.out.print(s);
    }
}
