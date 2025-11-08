import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int x_max = - 9999;
        int y_max = -9999;
        int y_min = 9999;
        int x_min = 9999;
        for(int i = 0; i < 4; i++){
            int x = r.nextInt();
            int y = r.nextInt();
            x_max = Math.max(x_max, x);
            y_max = Math.max(y_max,y);
            x_min = Math.min(x_min,x);
            y_min = Math.min(y_min,y);
        }
        int dai = x_max - x_min;
        int rong= y_max - y_min;
        int canh = Math.max(dai,rong);
        System.out.print(canh*canh);
    }
}
