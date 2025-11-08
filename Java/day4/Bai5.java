import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        for(int i = 1 ; i<= t; i++){
            System.out.printf("%05d %s %s %s %s %s %s\n",i,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine());
        }
    }
}
