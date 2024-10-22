package Pattern4;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for (int i = 0; i < num; i++) {
           
           
            for(int j = 0; j < i; j++) {
                System.out.print("  ");
            }
           for(int k = 0; k < num - i; k++) {
                System.out.print("* ");
           }
           System.out.println();
        }
    }
}
