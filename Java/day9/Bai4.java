import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        while (t-- > 0) {
            Double a = r.nextDouble();
            Double b = r.nextDouble();
            Double c = r.nextDouble();
            Double d = r.nextDouble();
            Double ans = Math.sqrt((a - c) * (a - c) + (b - d) * (b - d));
            System.out.printf("%.4f\n", ans);
        }
    }
}
