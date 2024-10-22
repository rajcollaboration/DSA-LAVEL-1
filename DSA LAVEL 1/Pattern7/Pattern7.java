package Pattern7;
import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int space = 0;
       int star = 1;
       for (int i = 0; i < n; i++) {
        for(int j = space; j > 0; j--){
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        space++;
       }
    }
}
