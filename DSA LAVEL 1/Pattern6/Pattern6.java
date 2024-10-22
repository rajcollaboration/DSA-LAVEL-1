package Pattern6;
import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 1;
        int star = n/2+1;

        for (int i = 0; i < n; i++) {
            for (int j = star; j > 0; j--) {
                System.out.print("* ");
            }
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = star; j > 0; j--) {
                System.out.print("* ");
            }
            if (i < n/2) {
                space += 2;
                star--; 
            }else{
                space -= 2;
                star++;
            }
            System.out.println();
        }
    }
}
